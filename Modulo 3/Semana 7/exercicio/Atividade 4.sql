SET SERVEROUTPUT ON;
CREATE OR REPLACE PROCEDURE PRINT_ALL_PRODUCTS
IS
  CURSOR lista IS
    SELECT *
    FROM produtoPreco;
  
  produto_row produtoPreco%ROWTYPE;
BEGIN
  OPEN lista;
  
  BEGIN
    LOOP
      FETCH lista INTO produto_row;
      EXIT WHEN lista%NOTFOUND;
      DBMS_OUTPUT.PUT_LINE('Id: ' || produto_row.Id || ', Status: ' || produto_row.Status || ', Preço: ' || produto_row.Valor);
    END LOOP;
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      DBMS_OUTPUT.PUT_LINE('Erro: Dados não encontrados na tabela "ProdutoPreco".');
  END;
  
  CLOSE lista;
END;