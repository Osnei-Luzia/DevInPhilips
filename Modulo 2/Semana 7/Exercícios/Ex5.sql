SELECT * FROM alunos; --WHERE id = 10;

UPDATE alunos 
SET media_geral = 10
WHERE id = 10;


SELECT * FROM cursos;

UPDATE cursos
SET ead = 0
WHERE id_professor = (SELECT p.id FROM professores p JOIN enderecos e on e.id = p.id_endereco WHERE e.uf <> 'RJ');


DELETE FROM matriculas WHERE id_curso = 3;
DELETE FROM cursos WHERE id = 3;