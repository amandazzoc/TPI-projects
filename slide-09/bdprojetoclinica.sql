create database projetoclinica;
use projetoclinica;

create table usuario(
	id int primary key auto_increment,
    senha varchar(100),
    login varchar(100)
);

create table Pacientes(
	id int primary key auto_increment,
    nome varchar(100),
    endereco varchar(100),
    complemento varchar(100),
    rg varchar(100),
    cpf varchar(100),
    dataNasc int
)