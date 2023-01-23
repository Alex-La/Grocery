DROP TABLE IF EXISTS orders;
CREATE TABLE orders(id serial PRIMARY KEY, customer_name VARCHAR(25), customer_surname VARCHAR(25), customer_phone VARCHAR(11));