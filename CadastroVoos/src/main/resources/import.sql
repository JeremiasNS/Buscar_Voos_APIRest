--
-- Author:  jeremias
-- Created: 28/06/2019

#drop database cadastro_rest_jeremias;

#create database cadastro_rest_jeremias;

#use cadastro_rest_jeremias;

#select * from Voo;
#select * from Aviao;
#select * from Cidade;
#select * from Estado;
#show tables;
#show databases;

#Insere Pilotos
insert into Piloto (cht,cpf, dataNascimento, nome, telefone) values (12345,'12345678910','10-12-86','Arthur','9123456789');
insert into Piloto (cht,cpf, dataNascimento, nome, telefone) values (12346,'12345678911','10-12-83','Alberto','9123456710');


#Insere Aviões
insert into Aviao (capacidadePassageiros, dataFabricacao, modelo) values (600, '2008-05-30', 'Airbus A380');
insert into Aviao (capacidadePassageiros, dataFabricacao, modelo) values (180, '2009-05-30', 'Boeing 707');

#Inserir Estados
insert into Estado (nome, UF, pais) values ( 'Acre', 'AC', 'Brasil');
insert into Estado (nome, UF, pais) values ( 'Alagoas', 'AL', 'Brasil');
insert into Estado (nome, UF, pais) values ( 'Amazonas', 'AM', 'Brasil');
insert into Estado (nome, UF, pais) values ( 'Amapá', 'AP', 'Brasil');
insert into Estado (nome, UF, pais) values ( 'Bahia', 'BA', 'Brasil');
insert into Estado (nome, UF, pais) values ( 'Ceará', 'CE', 'Brasil');
insert into Estado (nome, UF, pais) values ( 'Distrito Federal', 'DF', 'Brasil');
insert into Estado (nome, UF, pais) values ( 'Espírito Santo', 'ES', 'Brasil');
insert into Estado (nome, UF, pais) values ( 'Minas Gerais', 'MG', 'Brasil');
insert into Estado (nome, UF, pais) values ( 'Mato Grosso do Sul', 'MS', 'Brasil');
insert into Estado (nome, UF, pais) values ('Mato Grosso', 'MT', 'Brasil');
insert into Estado (nome, UF, pais) values ('Pará', 'PA', 'Brasil');
insert into Estado (nome, UF, pais) values ('Paraíba', 'PB', 'Brasil');
insert into Estado (nome, UF, pais) values ('Pernambuco', 'PE', 'Brasil');
insert into Estado (nome, UF, pais) values ('Piauí', 'PI', 'Brasil');
insert into Estado (nome, UF, pais) values ('Paraná', 'PR', 'Brasil');
insert into Estado (nome, UF, pais) values ('Rio de Janeiro', 'RJ', 'Brasil');
insert into Estado (nome, UF, pais) values ('Rio Grande do Norte', 'RN', 'Brasil');
insert into Estado (nome, UF, pais) values ('Rondônia', 'RO', 'Brasil');
insert into Estado (nome, UF, pais) values ('Roraima', 'RR', 'Brasil');
insert into Estado (nome, UF, pais) values ('Rio Grande do Sul', 'RS', 'Brasil');
insert into Estado (nome, UF, pais) values ('Santa Catarina', 'SC', 'Brasil');
insert into Estado (nome, UF, pais) values ('Sergipe', 'SE', 'Brasil');
insert into Estado (nome, UF, pais) values ('Tocantins', 'TO', 'Brasil');
insert into Estado (nome, UF, pais) values ('São Paulo', 'SP', 'Brasil');
insert into Estado (nome, UF, pais) values ('Goiás', 'GO', 'Brasil');
insert into Estado (nome, UF, pais) values ('Maranhão', 'MA', 'Brasil');


#Inserir Cidades
insert into Cidade (nome, estado_id) values ('Palmas','1');
insert into Cidade (nome, estado_id) values ('São Luís','4');
insert into Cidade (nome, estado_id) values ('São Paulo','2');
insert into Cidade (nome, estado_id) values ('Goiânia','3');
insert into Cidade (nome, estado_id) values ('Brasilia','3');

#Inserir Voos
insert into Voo (horadataChegada, horadataPartida, numeroVoo, precoPacagem, aviao_id, cidadeDestino_id, cidadeOrigem_id, piloto_id) values ('2019-05-30','2019-05-30',5556,500,1,4,1,1);
