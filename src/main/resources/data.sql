DROP TABLE IF EXISTS Todo;

CREATE TABLE Todo (
       id INT AUTO_INCREMENT PRIMARY KEY,
       user_name VARCHAR(250) NOT NULL,
       description VARCHAR(250) NOT NULL,
       target_date DATE,
       is_done BIT(1) DEFAULT FALSE
);

INSERT INTO Todo(user_name, description, target_date, is_done) VALUES ('in28Minutes', 'Learn Spring MVC', null, false);
INSERT INTO Todo(user_name, description, target_date) VALUES ('in28Minutes', 'Play COD', null);