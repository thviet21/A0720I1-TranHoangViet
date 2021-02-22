create database _b2_management_customers;

use _b2_management_customers;

create table customers(
	customer_id int not null unique,
    constraint customers_pk primary key (customer_id),
    customer_name nvarchar(50) not null,
    customer_andress nvarchar(255) not null,
    customer_email nvarchar(255) not null unique,
    customer_phone int(10) not null unique
);


create table accounts(
	account_id int not null unique, 
    constraint accounts_pk primary key (account_id),
    account_type nvarchar(20) not null,
    account_date_create date not null,
    account_balance float not null,
    customer_number int not null unique,
    constraint accounts_fk foreign key (customer_number) references customers(customer_id)
);

create table transactions(
	transaction_id int not null unique,
    constraint transactions_pk primary key (transaction_id),
    balance float not null,
    transaction_date date not null,
    description_transaction text,
    account_number int not null unique,
    constraint transactions_fk foreign key (account_number) references accounts(account_id)
);