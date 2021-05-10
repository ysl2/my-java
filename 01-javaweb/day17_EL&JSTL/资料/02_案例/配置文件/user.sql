create database day17; -- 创建数据库
use day17; 			   -- 使用数据库
create table user(   -- 创建表
	id int primary key auto_increment,
	name varchar(20) not null,
	gender varchar(5),
	age int,
	address varchar(32),
	qq	varchar(20),
	email varchar(50)
);
