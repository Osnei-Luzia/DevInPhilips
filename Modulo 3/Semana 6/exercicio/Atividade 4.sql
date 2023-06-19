/*Atividade 4*/

SET SERVEROUTPUT ON;
DECLARE
    soma NUMBER;
BEGIN
    SELECT SUM(valor) INTO soma FROM produtoPreco;
    CASE 
        WHEN soma < 150.00 THEN
            DBMS_OUTPUT.PUT_LINE('Soma do produto menor que 150.00');
        WHEN soma < 500.00 THEN 
            DBMS_OUTPUT.PUT_LINE('Soma do produto menor que 500.00');
        ELSE 
            DBMS_OUTPUT.PUT_LINE('Soma do produto maior que 500.00');
    END CASE;
END;