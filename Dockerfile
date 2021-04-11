FROM openjdk:11.0.10-slim

COPY target/todo-service-1.0.0-SNAPSHOT.jar todo-service-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/todo-service-1.0.0-SNAPSHOT.jar"]