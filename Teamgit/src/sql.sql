drop table user_info;

create table user_info(
id varchar2(20),
password varchar2(10) not null,
name varchar2(20) not null,
gender char(10) not null,
seedmoney number(5),
constraint user_info_id_pk primary key(id),
constraint user_info_gender_ck check(gender in('MAN', 'WOMAN'))
);

insert into user_info
values('master','1234','∏∂Ω∫≈Õ','MAN',1000);

select * from user_info;

select * from news;

select * from stocks;

drop table stocks cascade constraints;

create table stocks
(stock_id number(3),
stock_name varchar2(10) not null,
stock_minus number(2),
stock_plus number(2),
news_id number(3),
constraint stocks_stock_id_pk primary key(stock_id),
constraint stocks_news_id_fk foreign key(news_id) references news(news_id)
);


