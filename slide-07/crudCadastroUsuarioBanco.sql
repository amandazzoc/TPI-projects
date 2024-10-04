create database crudCadastroUsuarioBanco;

use crudCadastroUsuarioBanco;

create table Usuario(
	id int primary key auto_increment,
    nome varchar(100),
    email varchar(100),
    login varchar(50),
    senha varchar(100)
);