create database Arraia_pay;
use Arraia_pay;
create table qrcode(
id int auto_increment primary key ,
saldo float,
nome_cliente varchar(50)
);
drop table qrcode;
select * from qrcode;