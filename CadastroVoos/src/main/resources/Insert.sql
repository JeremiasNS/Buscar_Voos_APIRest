--select * from Voo;
--select * from Aviao;


--Insere Pilotos
insert into Piloto (cht,cpf, dataNascimento, nome, telefone) values (12345,"12345678910","10/12/86","Arthur","9123456789");
insert into Piloto (cht,cpf, dataNascimento, nome, telefone) values (12346,"12345678911","10/12/83","Alberto","9123456710");


--Insere Aviões
insert into Aviao (capacidadePassageiros, dataFabricacao, modelo) values (600, '2008-05-30', 'Airbus A380');
insert into Aviao (capacidadePassageiros, dataFabricacao, modelo) values (180, '2009-05-30', 'Boeing 707');

--Insere Estados
insert into Estado (UF, nome, pais) values ('TO','Tocantins','Brasil');
insert into Estado (UF, nome, pais) values ('SP','São Paulo','Brasil');
insert into Estado (UF, nome, pais) values ('GO','Goias','Brasil');
insert into Estado (UF, nome, pais) values ('MA','Maranhão','Brasil');

----Inserir Cidades
insert into Cidade (nome, estado_id) values ('Palmas','1');
insert into Cidade (nome, estado_id) values ('São Luís','4');
insert into Cidade (nome, estado_id) values ('São Paulo','2');
insert into Cidade (nome, estado_id) values ('Goiânia','3');
insert into Cidade (nome, estado_id) values ('Brasilia','3');

----Inserir Voos
insert into Voo (horadataChegada, horadataPartida, numeroVoo, precoPacagem, aviao_id, cidadeDestino_id, cidadeOrigem_id, piloto_id) values ('2019-05-30','2019-05-30',5556,500,1,4,1,1);