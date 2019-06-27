#create database cadastro_rest_jeremias;

#use cadastro_rest_jeremias;

#select * from Voo;
#select * from Aviao;


#Insere Pilotos
insert into Piloto (cht,cpf, dataNascimento, nome, telefone) values 
(12345,"12345678910","10/12/86","Arthur","9123456789"),
(12346,"12345678911","10/12/83","Alberto","9123456710");


#Insere Aviões
insert into Aviao (capacidadePassageiros, dataFabricacao, modelo) values 
(600, '2008-05-30', 'Airbus A380'),
(180, '2009-05-30', 'Boeing 707');

#Insere Estados

insert into Estado (nome, UF, pais) values
( 'Acre', 'AC', 'Brasil'),
( 'Alagoas', 'AL', 'Brasil'),
( 'Amazonas', 'AM', 'Brasil'),
( 'Amapá', 'AP', 'Brasil'),
( 'Bahia', 'BA', 'Brasil'),
( 'Ceará', 'CE', 'Brasil'),
( 'Distrito Federal', 'DF', 'Brasil'),
( 'Espírito Santo', 'ES', 'Brasil'),
( 'Minas Gerais', 'MG', 'Brasil'),
( 'Mato Grosso do Sul', 'MS', 'Brasil'),
('Mato Grosso', 'MT', 'Brasil'),
('Pará', 'PA', 'Brasil'),
('Paraíba', 'PB', 'Brasil'),
('Pernambuco', 'PE', 'Brasil'),
('Piauí', 'PI', 'Brasil'),
('Paraná', 'PR', 'Brasil'),
('Rio de Janeiro', 'RJ', 'Brasil'),
('Rio Grande do Norte', 'RN', 'Brasil'),
('Rondônia', 'RO', 'Brasil'),
('Roraima', 'RR', 'Brasil'),
('Rio Grande do Sul', 'RS', 'Brasil'),
('Santa Catarina', 'SC', 'Brasil'),
('Sergipe', 'SE', 'Brasil'),
('Tocantins', 'TO', 'Brasil'),
('São Paulo', 'SP', 'Brasil'),
('Goiás', 'GO', 'Brasil'),
('Maranhão', 'MA', 'Brasil');


#Inserir Cidades
insert into Cidade (nome, estado_id) values ('Palmas','1');
insert into Cidade (nome, estado_id) values ('São Luís','4');
insert into Cidade (nome, estado_id) values ('São Paulo','2');
insert into Cidade (nome, estado_id) values ('Goiânia','3');
insert into Cidade (nome, estado_id) values ('Brasilia','3');

#Inserir Voos
insert into Voo (horadataChegada, horadataPartida, numeroVoo, precoPacagem, aviao_id, cidadeDestino_id, cidadeOrigem_id, piloto_id) values ('2019-05-30 07:30:21','2019-05-30 08:30:21',5556,500,1,4,1,1);