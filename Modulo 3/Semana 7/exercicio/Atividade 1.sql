/*Atividade 1*/

SET SERVEROUTPUT ON;
DECLARE
    CURSOR lista IS SELECT id,status FROM produtos;
    linha produtos.id%TYPE;
    status produtos.status%TYPE;
BEGIN
    OPEN lista;
        LOOP
        FETCH lista INTO linha, status;
        EXIT WHEN linha > 3;
            UPDATE produtos SET status = 0 WHERE id = linha;
        END LOOP;
    CLOSE lista;
END;