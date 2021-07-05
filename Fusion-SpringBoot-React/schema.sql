create user `reactBackEnd`@`localhost` identified by '1111';
create user `reactBackEnd`@`%` identified by '1111';
create database react_back_end CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;
grant all privileges on react_back_end.* to `reactBackEnd`@`localhost`;
grant all privileges on react_back_end.* to `reactBackEnd`@`%`;




CREATE TABLE users
(
   id int NOT NULL AUTO_INCREMENT,
   username varchar (10),
   password varchar (12) NOT NULL,
   firstName varchar (10),
   lastName varchar (10),
   age tinyint,
   salary int,
   PRIMARY KEY (id)
);


 INSERT INTO users(username, password, firstName, lastName, age, salary) VALUES("피카츄", "1234", "kachu", "pi", 1, 100000);