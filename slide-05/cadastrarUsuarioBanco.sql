create database  exercicio1;

use exercicio1;

create table Usuario(
	id int auto_increment primary key,
	nome varchar(255),
    login varchar(255),
    senha varchar(255),
    email varchar(255)
);