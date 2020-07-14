DROP TABLE IF EXISTS employee CASCADE;
DROP TABLE IF EXISTS customer CASCADE;
DROP TABLE IF EXISTS method_of_payment CASCADE;
DROP TABLE IF EXISTS receipt CASCADE;
DROP TABLE IF EXISTS product CASCADE;
DROP TABLE IF EXISTS product_type CASCADE;
DROP TABLE IF EXISTS manufacturer CASCADE;
DROP TABLE IF EXISTS receipt_product CASCADE;
DROP TABLE IF EXISTS Supplier CASCADE;
DROP TABLE IF EXISTS Supplies CASCADE;


CREATE TABLE employee (
  id       INTEGER     NOT NULL,
  name      VARCHAR(50) NOT NULL,
  surname   VARCHAR(50) NOT NULL,
  telephone_number  VARCHAR(50) NOT NULL,
  employee_id integer null
);

CREATE TABLE customer (
  id       INTEGER     NOT NULL,
  name      VARCHAR(50) NOT NULL,
  surname   VARCHAR(50) NOT NULL
);

CREATE TABLE method_of_payment (
  id       INTEGER     NOT NULL,
  payment      VARCHAR(50) NOT NULL
);

CREATE TABLE receipt (
  id       INTEGER     NOT NULL,
  Amount      VARCHAR(50) NOT NULL,
	date    date NOT NULL,
	FK_employee integer not null,
	FK_customer integer not null,
	FK_method_of_payment integer not null
);

CREATE TABLE product (
  id       INTEGER     NOT NULL,
  name      VARCHAR(50) NOT NULL,
  price    integer NOT NULL,
	fk_manufacturer integer not null,
	fk_product_type integer not null
);

CREATE TABLE product_type (
  id       INTEGER     NOT NULL,
  name      VARCHAR(50) NOT NULL
);

CREATE TABLE manufacturer (
  id       INTEGER     NOT NULL,
  name      VARCHAR(50) NOT NULL
);

CREATE TABLE receipt_product (
  id       INTEGER     NOT NULL,
	FK_receipt integer not null,
	FK_product integer not null
);

CREATE TABLE Supplier (
  id       INTEGER     NOT NULL,
  name      VARCHAR(50) NOT NULL
);


CREATE TABLE Supplies (
  id       INTEGER     NOT NULL,
	FK_product integer not  null,
	FK_supplier integer not null
);


ALTER TABLE employee
  ADD CONSTRAINT PK_employee
PRIMARY KEY (id);


ALTER TABLE customer
  ADD CONSTRAINT PK_customer
PRIMARY KEY (id);


ALTER TABLE method_of_payment
  ADD CONSTRAINT PK_method_of_payment
PRIMARY KEY (id);


ALTER TABLE receipt
  ADD CONSTRAINT PK_receipt
PRIMARY KEY (id);


ALTER TABLE product_type
  ADD CONSTRAINT PK_product_type
PRIMARY KEY (id);

ALTER TABLE product
  ADD CONSTRAINT PK_product PRIMARY KEY (id);
ALTER TABLE product
  ADD CONSTRAINT FK_product_type FOREIGN KEY (fk_product_type) references Product_Type (id);

ALTER TABLE manufacturer
  ADD CONSTRAINT PK_manufacturer
PRIMARY KEY (id);


ALTER TABLE receipt_product
  ADD CONSTRAINT PK_receipt_product
PRIMARY KEY (id);


ALTER TABLE Supplier
  ADD CONSTRAINT PK_Supplier
PRIMARY KEY (id);


ALTER TABLE Supplies
  ADD CONSTRAINT PK_Supplies
PRIMARY KEY (id);

ALTER TABLE employee
  ADD CONSTRAINT FK_employee
FOREIGN KEY (employee_id) REFERENCES employee (id);


ALTER TABLE receipt
  ADD CONSTRAINT FK_employee
FOREIGN KEY (FK_employee) REFERENCES employee (id);

ALTER TABLE receipt
  ADD CONSTRAINT FK_customer
FOREIGN KEY (FK_customer) REFERENCES customer (id);
ALTER TABLE receipt
  ADD CONSTRAINT FK_method_of_payment
FOREIGN KEY (FK_method_of_payment) REFERENCES method_of_payment (id);

ALTER TABLE product
  ADD CONSTRAINT FK_manufacturer
FOREIGN KEY (FK_manufacturer) REFERENCES manufacturer (id);

ALTER TABLE receipt_product
  ADD CONSTRAINT FK_receipt
FOREIGN KEY (FK_receipt) REFERENCES receipt (id);

ALTER TABLE receipt_product
  ADD CONSTRAINT FK_product
FOREIGN KEY (FK_product) REFERENCES product (id);

ALTER TABLE supplies
  ADD CONSTRAINT FK_product
FOREIGN KEY (FK_product) REFERENCES product (id);

ALTER TABLE supplies
  ADD CONSTRAINT FK_supplier
FOREIGN KEY (FK_supplier) REFERENCES supplier (id);

CREATE SEQUENCE hibernate_sequence
 START WITH 100
 INCREMENT BY 1
 NO MINVALUE
 NO MAXVALUE
 CACHE 1;