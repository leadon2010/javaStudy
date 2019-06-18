SELECT *
FROM   tab;

SELECT *
FROM   employees;

SELECT *
FROM   employees_temp
ORDER  BY job_id DESC;

SELECT *
FROM   member_hr;

CREATE TABLE member_hr AS
    SELECT employee_id user_id
          ,first_name  user_pw
          ,first_name
          ,last_name
    FROM   employees;

CREATE TABLE employee_temp AS
    SELECT *
    FROM   employees;

INSERT INTO employees_temp
    SELECT *
    FROM   employees e
    WHERE  1 = 1
    AND    NOT EXISTS (SELECT 1
            FROM   employees_temp t
            WHERE  e.employee_id = t.employee_id);

CREATE TABLE ajaxsample(full_name VARCHAR2(50)
                       ,position VARCHAR2(30)
                       ,office VARCHAR2(10)
                       ,extn VARCHAR2(10)
                       ,start_date VARCHAR2(20)
                       ,salary VARCHAR2(20)) tablespace users pctfree 10 initrans 1 maxtrans 255 storage(initial 64k NEXT 1m
                                                                                                         minextents 1
                                                                                                         maxextents
                                                                                                         unlimited);

SELECT *
FROM   ajaxsample;

SELECT *
FROM   tab;

SELECT *
FROM   login_test;

UPDATE login_test
SET    passwd = '1234';

-------------------------------
--��ǰ����(��ǰ�ڵ�, ��ǰ��, �ܰ�) - yedam_product
--�԰�����(��ǰ�ڵ�, ����) - yedam_receipt
--�������(��ǰ�ڵ�, ����) - yedam_issue
--�������(��ǰ�ڵ�, ���������) - yedam_onhand
-------------------------------

drop TABLE yedam_product purge;
CREATE TABLE yedam_product(product_code VARCHAR2(10)
                          ,product_name VARCHAR2(50)
                          ,product_price NUMBER);

drop TABLE yedam_prod_txn purge;
CREATE TABLE yedam_prod_txn(product_code VARCHAR2(10)
                           ,txn_qty NUMBER
                           ,receipt_issue_date DATE);

CREATE OR REPLACE view yedam_receipt_info_v AS
    SELECT p.product_code
          ,p.product_name
          ,t.txn_qty
          ,t.receipt_issue_date
    FROM   yedam_product  p
          ,yedam_prod_txn t
    WHERE  p.product_code = t.product_code
    AND    t.txn_qty > 0;

CREATE OR REPLACE view yedam_issue_info_v AS
    SELECT p.product_code
          ,p.product_name
          ,t.txn_qty
          ,t.receipt_issue_date
    FROM   yedam_product  p
          ,yedam_prod_txn t
    WHERE  p.product_code = t.product_code
    AND    t.txn_qty < 0;

CREATE OR REPLACE view yedam_prod_onhand AS
    SELECT p.product_code
          ,SUM(t.txn_qty) AS onhand_qty
    FROM   yedam_prod_txn t
          ,yedam_product  p
    WHERE  t.product_code = p.product_code
    GROUP  BY p.product_code;
