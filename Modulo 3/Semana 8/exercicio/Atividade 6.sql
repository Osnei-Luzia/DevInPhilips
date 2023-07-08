CREATE OR REPLACE TRIGGER preDeletePrecoProduto
BEFORE DELETE ON produtoPreco
FOR EACH ROW
BEGIN
    INSERT INTO LOG (ID, campo, valorAntigo, nomeTabela)
    VALUES (:OLD.ID, 'IdProduto', :OLD.IdProduto, 'ProdutoPreco');
END;