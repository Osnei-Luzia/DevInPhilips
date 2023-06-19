/*Atividade 7*/

SET SERVEROUTPUT ON;
DECLARE
    CURSOR lista IS SELECT id,status FROM produtos;
    linha produtos.id%TYPE;
    status produtos.status%TYPE;
BEGIN    
    OPEN lista;
        LOOP
        FETCH lista INTO linha, status;
        EXIT WHEN lista%NOTFOUND;
            IF status = 1 THEN
                DBMS_OUTPUT.PUT_LINE('Ativo');
            ELSE
                DBMS_OUTPUT.PUT_LINE('Desativado');
            END IF;
        END LOOP;
    CLOSE lista;
END;