CREATE OR REPLACE VIEW ApenasLeituraProdutoPreco AS
SELECT ID, IdProduto
FROM produtoPreco
WITH READ ONLY;