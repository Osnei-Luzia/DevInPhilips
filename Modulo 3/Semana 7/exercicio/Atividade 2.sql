SET SERVEROUTPUT ON;
DECLARE
  CURSOR lista IS
    SELECT id, status, valor
    FROM produtoPreco;
  produto_row lista%ROWTYPE;
  
BEGIN
  FOR produto_row IN lista LOOP
    IF produto_row.Status = 1 AND produto_row.Valor < 1000.00 THEN
      DBMS_OUTPUT.PUT_LINE('Id: ' || produto_row.Id || ', Status: Ativo, Preço: ' || produto_row.Valor);
    ELSE
      DBMS_OUTPUT.PUT_LINE('Id: ' || produto_row.Id || ', Status: Inativo ou Preço maior ou igual a 1000,00');
    END IF;
  END LOOP;
END;