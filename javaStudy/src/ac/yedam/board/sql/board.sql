SELECT *
FROM   tab;

SELECT *
FROM   login_test;

CREATE TABLE login_test(
id varchar2(10), passwd varchar2(10), name varchar2(100));

insert into login_test values('1111','1234','changho');
insert into login_test values('166','1234','Susan');

--게시판
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


