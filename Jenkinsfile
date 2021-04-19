pipeline {
    agent any
    environment {
        EMAIL_RECIPIENTS = 'coghlada@tcd.ie'
    }

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            tools {
               jdk "openjdk-11"
            }
            steps {
                sh 'java -version'

                // Get some code from a GitHub repository
                git 'https://github.com/dancoghlan/todo-service.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
