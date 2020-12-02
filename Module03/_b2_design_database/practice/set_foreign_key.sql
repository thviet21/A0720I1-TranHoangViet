create database _b2_set_foreign_key;

use _b2_set_foreign_key;

CREATE TABLE customers(
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(40),
   address VARCHAR(255),
   email VARCHAR(255)
);

CREATE TABLE orders(
   id INT AUTO_INCREMENT,
   staff VARCHAR(50),
   PRIMARY KEY(id),
   concustomer_id INT,
   constraint fk_customers_id foreign key (concustomer_id) REFERENCES customers(id)
);