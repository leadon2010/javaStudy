CREATE OR REPLACE PACKAGE board_pkg IS

    -- Author  : LEADON
    -- Created : 2019-06-28 ���� 12:33:02
    -- Purpose : 

    PROCEDURE write_board(p_title   VARCHAR2
                         ,p_content VARCHAR2
                         ,p_write   VARCHAR2);

END board_pkg;
/
CREATE OR REPLACE PACKAGE BODY board_pkg IS
    PROCEDURE write_board(p_title   VARCHAR2
                         ,p_content VARCHAR2
                         ,p_write   VARCHAR2) IS
    BEGIN
        INSERT INTO board
            (board_no
            ,title
            ,content
            ,writer
            ,create_date
            ,parent_no)
        VALUES
            (board_seq.nextval
            ,p_title
            ,p_content
            ,p_write
            ,SYSDATE
            ,NULL);
    
    EXCEPTION
        WHEN OTHERS THEN
            dbms_output.put_line(SQLERRM);
    END write_board;

END board_pkg;
/
