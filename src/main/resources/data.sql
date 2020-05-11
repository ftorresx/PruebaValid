DROP TABLE IF EXISTS person;


CREATE TABLE person (
	id int auto_increment,
	name varchar(100),
	last_name varchar(100),
	process boolean default false
);


INSERT INTO person (name, last_name) VALUES('Fernando','Torres');
INSERT INTO person (name, last_name) VALUES('Nombre1','Apellido1');
INSERT INTO person (name, last_name) VALUES('Nombre2','Apellido2');
INSERT INTO person (name, last_name) VALUES('Nombre3','Apellido3');
INSERT INTO person (name, last_name) VALUES('Nombre4','Apellido4');
INSERT INTO person (name, last_name) VALUES('Nombre5','Apellido5');