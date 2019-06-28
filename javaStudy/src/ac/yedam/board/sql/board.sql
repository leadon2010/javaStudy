SELECT *
FROM   tab;

SELECT *
FROM   login_test;

--°Ô½ÃÆÇ
CREATE TABLE board(board_no NUMBER NOT NULL
                  ,title VARCHAR2(100)
                  ,content VARCHAR2(3000)
                  ,writer VARCHAR2(100)
                  ,create_date DATE
                  ,parent_no NUMBER);

ALTER TABLE board add CONSTRAINT board_pk primary key(board_no);

CREATE sequence board_seq;

SELECT *
FROM   board;
