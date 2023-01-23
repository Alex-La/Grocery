DROP TABLE IF EXISTS orders;
CREATE TABLE orders(
    id serial NOT NULL PRIMARY KEY,
    customer_name VARCHAR(25),
    customer_surname VARCHAR(25),
    customer_phone VARCHAR(11),
    created_at TIMESTAMP NOT NULL DEFAULT NOW()
);

DROP TABLE IF EXISTS users;
CREATE TABLE users(
  id serial NOT NULL PRIMARY KEY,
  name VARCHAR(25),
  password VARCHAR
);