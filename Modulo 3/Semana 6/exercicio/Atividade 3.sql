/*Atividade 3*/

SELECT p.id, pr.idProduto, p.descricao, pr.valor, pr.cadastro 
FROM produtoPreco pr
INNER JOIN produtos p ON pr.idProduto = p.id;