drop table emp;
drop table if exists emp;
create table emp 
(
    empno number(4) ,
    ename varchar(50),
    sal number,
    CONSTRAINT emp_pk primary key(empno)
);

select * from emp;

create SEQUENCE emp_seq
    start with 1
    increment by 1
    MAXVALUE 100
    CYCLE nocache  ; 
    
    
