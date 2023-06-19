/*Atividade 5*/

SELECT * FROM produtoPreco pr 
LEFT JOIN produtos p ON pr.idProduto = p.id WHERE pr.status = 0;
