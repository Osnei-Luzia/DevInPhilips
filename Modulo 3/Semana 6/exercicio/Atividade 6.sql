/*Atividade 6*/

DECLARE
    valor NUMBER;
    multi NUMBER := 0.15;
BEGIN
    FOR i IN 1..3 LOOP
        UPDATE produtoPreco SET valor = valor+(valor*multi) WHERE valor > 100;
    END LOOP;
END;