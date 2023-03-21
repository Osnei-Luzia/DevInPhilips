SELECT * FROM cursos WHERE numero_alunos > 30;
SELECT * FROM professores WHERE nacionalidade IN ('Brasileiro','Venezuelano','Paraguaio');
SELECT * FROM alunos WHERE nome LIKE 'L%';
SELECT * FROM alunos WHERE media_geral > 7 ORDER BY media_geral DESC;
--não foi adicionado gênero para professores
SELECT * FROM professores WHERE data_nascimento < TO_DATE('01/01/1970', 'dd/mm/yyyy');
SELECT a.* 
    FROM alunos a 
    JOIN matriculas m ON a.id = m.id_aluno 
    JOIN cursos c ON m.id_curso = c.id 
    WHERE c.ead = 1;


