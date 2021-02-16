create database palindrome;


use palindrome;


create table palindrome(id int not null primary key, original_string varchar(50) not null unique, palindrome_string varchar(225));

show tables;

select * from palindrome;