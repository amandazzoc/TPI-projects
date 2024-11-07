create database crudCadastroProdutosBanco;

use crudCadastroProdutosBanco;

create table produtos(
	 id int primary key auto_increment,
     codigo int, 
     nomeProduto varchar(100),
     descricao varchar(100)
);
