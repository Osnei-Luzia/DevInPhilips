CREATE OR REPLACE TRIGGER posUpdateProdutos
AFTER UPDATE ON produtos
FOR EACH ROW
DECLARE
    campo_alterado VARCHAR2(100);
    valor_antigo VARCHAR2(100);
BEGIN
    IF UPDATING('descricao') THEN
        campo_alterado := 'descricao';
        valor_antigo := :OLD.descricao;
    ELSIF UPDATING('status') THEN
        campo_alterado := 'status';
        valor_antigo := :OLD.status;
    ELSIF UPDATING('quantidadeemestoque') THEN
        campo_alterado := 'quantidadeemestoque';
        valor_antigo := :OLD.quantidadeemestoque;
    END IF;
    IF campo_alterado IS NOT NULL THEN
        INSERT INTO LOG (ID, campo, valorAntigo, nomeTabela)
        VALUES (:OLD.ID, campo_alterado, valor_antigo, 'Novo Produto');
    END IF;
END;