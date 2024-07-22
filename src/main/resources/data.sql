DROP TABLE IF EXISTS customer_order;
DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS student;

CREATE TABLE customer (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    first_name varchar(300) NOT NULL DEFAULT '',
    last_name varchar(300) NOT NULL DEFAULT '',
    email varchar(300) NOT NULL DEFAULT '',
    status varchar(300) NOT NULL DEFAULT 'REGULAR',
    PRIMARY KEY (id)
);

CREATE TABLE customer_order (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    customer_id int(11) unsigned NOT NULL,
    item_name varchar(300) NOT NULL DEFAULT '',
    price int(11) NOT NULL DEFAULT '',
    currency varchar(300) NOT NULL DEFAULT 'USD',
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customer(id)
);

CREATE TABLE student (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    first_name varchar(300) NOT NULL DEFAULT '',
    last_name varchar(300) NOT NULL DEFAULT '',
    email varchar(300) NOT NULL DEFAULT '',
    payment_method varchar(300) not NULL,
    PRIMARY KEY (id)
);
CREATE TABLE user (
    id int(11) unsigned NOT NULL AUTO_INCREMENT,
    first_name varchar(300) NOT NULL DEFAULT '',
    last_name varchar(300) NOT NULL DEFAULT '',
    email varchar(300) NOT NULL DEFAULT '',
    age int(3) NOT NULL,
    address varchar(300) NOT NULL DEFAULT '',
    joining_date date NOT NULL,
    PRIMARY KEY (id)

);
INSERT INTO user (first_name,last_name,email,age,address,joining_date) VALUES ('Tal','Golan','tal@gmail.com',59,'Geva 1891500','2024-07-06');
INSERT INTO user (first_name,last_name,email,age,address,joining_date) VALUES ('Moshe','Dayan','moshe@gmail.com',25,'Rabin 6 Tel-Aviv','2022-02-02');
INSERT INTO user (first_name,last_name,email,age,address,joining_date) VALUES ('Kanye','West','kanye@gmail.com',51,'Fifth Avenue 12 NYC','2023-03-30');

