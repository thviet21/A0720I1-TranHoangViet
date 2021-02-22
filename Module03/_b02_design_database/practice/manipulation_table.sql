create database b2_design_database;

use b2_design_database;

create table contacts(
	contact_id int not null auto_increment,
    constraint contacts_pk primary key (contact_id),
    last_name nvarchar(30) not null,
    first_name nvarchar(25) not null,
    birthday date
);
CREATE TABLE suppliers( 
  supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);


DROP TABLE contacts, suppliers;

ALTER TABLE contacts
  ADD diachi varchar(100) NOT NULL
    AFTER birthday;
    
ALTER TABLE people
  CHANGE COLUMN diachi address
    varchar(70) NOT NULL;
    
ALTER TABLE contacts
  RENAME TO people;