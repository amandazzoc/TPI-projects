create database crudControleVendasBanco;

use crudControleVendasBanco;

create table Vendas(
	id int primary key auto_increment,
    codigo int,
    nomeVendedor varchar(255),
    produtoVendido varchar(100)
);