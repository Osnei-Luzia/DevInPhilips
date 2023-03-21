--Os valores para ID de cada tabela podem variar por causa da sequência

INSERT INTO enderecos(cep, logradouro, numero, bairro, cidade, uf)
VALUES ('27281-260','Moçambique','656','Retiro','Volta Redonda','RJ');

INSERT INTO enderecos(cep, logradouro, numero, bairro, cidade, uf)
VALUES ('26316-154','Felipe dos Santos','280','Vila Central','Queimados','RJ');

INSERT INTO enderecos(cep, logradouro, numero, bairro, cidade, uf)
VALUES ('38182-638','M','291','Veredas do Belverde','Araxá','MG');

--SELECT * FROM enderecos;

--ALTER TABLE professores RENAME COLUMN nascionalidade to nacionalidade

INSERT INTO professores(nome, sobrenome, id_endereco, telefone, email, data_nascimento, nacionalidade)
VALUES ('Larissa','Olivia Sônia','1','(24)3692-4993','larissa_olivia@band.com.br','15/01/1953','Brasileiro');

INSERT INTO professores(nome, sobrenome, id_endereco, telefone, email, data_nascimento, nacionalidade)
VALUES ('Arthur','Breno Breno Monteiro','2','(21)3761-4044','arthur.breno.monteiro@igi.com.br','27/02/1969','Brasileiro');

INSERT INTO professores(nome, sobrenome, id_endereco, telefone, email, data_nascimento, nacionalidade)
VALUES ('Bianca','Analu Betina','3','(34)3756-2275','raquel_campos@edwardmaluf.com.br','08/03/1973','Brasileiro');

--SELECT * FROM professores;

--ALTER TABLE alunos RENAME COLUMN nascionalidade to nacionalidade;
--ALTER TABLE alunos MODIFY media_geral DECIMAL(4,2);

INSERT INTO alunos(nome, sobrenome, matricula, email, data_nascimento, nacionalidade, media_geral)
VALUES ('Noah','Lorenzo Juan Costa','10203040','noah_lorenzo_costa@predialnet.com.br','03/01/1988','Brasileiro',8.8);

INSERT INTO alunos(nome, sobrenome, matricula, email, data_nascimento, nacionalidade, media_geral)
VALUES ('Erick','Diogo Farias','10203041','erick_diogo_farias@artedaserra.com.br','05/01/1963','Brasileiro',10);

INSERT INTO alunos(nome, sobrenome, matricula, email, data_nascimento, nacionalidade, media_geral)
VALUES ('Emily','Isadora Martins','10203042','emily_isadora_martins@tafeta.com.br','15/03/1966','Brasileiro',7.2);


INSERT INTO cursos(codigo, id_professor, nome, ead, numero_alunos)
VALUES ('2000034','6','Informática','1',30);

INSERT INTO cursos(codigo, id_professor, nome, ead, numero_alunos)
VALUES ('2000035','7','Culinária','0',25);

INSERT INTO cursos(codigo, id_professor, nome, ead, numero_alunos)
VALUES ('2000036','6','Banco de Dados','1',30);

INSERT INTO cursos(codigo, id_professor, nome, ead, numero_alunos)
VALUES ('2000040','8','Inglês','1',30);

--SELECT * FROM cursos;

--SELECT * FROM alunos; 
--SELECT * FROM cursos;

--RENAME matricula TO matriculas;
--ALTER TABLE matriculas MODIFY media DECIMAL(4,2);

--SELECT * FROM matriculas;

INSERT INTO matriculas(id_aluno,id_curso,media)
VALUES ('10','1',7);

INSERT INTO matriculas(id_aluno,id_curso,media)
VALUES ('11','2',10);

INSERT INTO matriculas(id_aluno,id_curso,media)
VALUES ('12','3',2);

INSERT INTO matriculas(id_aluno,id_curso,media)
VALUES ('10','4',9);

SELECT * FROM matriculas;






