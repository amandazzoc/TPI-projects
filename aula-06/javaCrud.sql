create database javaCrud;

use javaCrud;

create table usuario(
id int primary key auto_increment,
codigo int(4) not null,
nome varchar(80),
telefone varchar(25),
login varchar(60),
senha varchar(50)
);