-- customers.sql

select * from customers;

create table Customers(
	code number(4) primary key,
	name varchar2(30) not null,
	email varchar2(30), 
	phone varchar2(20)
);


insert into Customers values(3, 'park', '','33333');
insert into Customers values(4, 'hong', '','33333');
insert into Customers values(5, 'lee', '','33333');
insert into Customers values(6, 'kim', '','33333');
insert into Customers values(7, 'kang', '','33333');