CREATE OR REPLACE VIEW buscarProduto AS
SELECT p.id, pp.valor
FROM produtos p
INNER JOIN produtoPreco pp ON p.id = pp.idproduto
WHERE pp.valor NOT BETWEEN 100 AND 200
WITH CHECK OPTION;