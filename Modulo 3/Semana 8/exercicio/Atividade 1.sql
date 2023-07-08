CREATE OR REPLACE FUNCTION aplicarDesconto (aplicarDesconto IN NUMBER, idProduto IN NUMBER)
    RETURN NUMBER
IS
    resultado NUMBER(10,2);
    codigo NUMBER := idProduto;
    BEGIN
        SELECT valor INTO resultado 
        FROM produtoPreco
        WHERE idProduto = codigo;
        
        IF aplicarDesconto = 1 THEN
            resultado := resultado + (resultado * 0.1);
        END IF;
    RETURN resultado;
END;  