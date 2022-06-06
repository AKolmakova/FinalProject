DROP DATABASE IF EXISTS salon;
CREATE DATABASE salon;

USE salon;

DROP TABLE IF EXISTS account;
CREATE TABLE account (
  id INT AUTO_INCREMENT PRIMARY KEY,
  s_login VARCHAR(250),
  s_password VARCHAR(250),
  s_email VARCHAR(250),
  s_role VARCHAR(250)
);

DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
  id INT AUTO_INCREMENT PRIMARY KEY,
  s_name VARCHAR(250),
  s_surname VARCHAR(250),
  s_phone VARCHAR(250),
  s_rating DOUBLE,
  account_id INT,

  FOREIGN KEY (account_id) REFERENCES account (id)
        ON UPDATE CASCADE
        ON DELETE SET NULL
);

DROP TABLE IF EXISTS booking;
CREATE TABLE booking  (
  id INT AUTO_INCREMENT PRIMARY KEY,
  s_status VARCHAR(250),
  s_grade INT,
  s_discount DOUBLE,
  customer_id INT,

  FOREIGN KEY (customer_id) REFERENCES customer  (id)
        ON UPDATE CASCADE
        ON DELETE SET NULL
);

DROP TABLE IF EXISTS resource ;
CREATE TABLE resource (
  id INT AUTO_INCREMENT PRIMARY KEY,
  s_url TEXT
);

DROP TABLE IF EXISTS sketch;
CREATE TABLE sketch (
  id INT AUTO_INCREMENT PRIMARY KEY,
  s_rating INT,
  s_approved BOOLEAN DEFAULT FALSE,
  s_size INT,
  s_price DOUBLE,
  resource_id INT,

  FOREIGN KEY (resource_id) REFERENCES resource  (id)
        ON UPDATE CASCADE
        ON DELETE SET NULL
);

DROP TABLE IF EXISTS tag;
CREATE TABLE tag (
  id INT AUTO_INCREMENT PRIMARY KEY,
  s_name VARCHAR(255)
);

DROP TABLE IF EXISTS sketch_tag;
CREATE TABLE sketch_theme (
  id INT AUTO_INCREMENT PRIMARY KEY,
  s_sketch_id INT,
  s_tag_id INT,

  FOREIGN KEY (s_sketch_id) REFERENCES sketch (id)
        ON UPDATE CASCADE
        ON DELETE SET NULL,
   FOREIGN KEY (s_tag_id) REFERENCES tag (id)
        ON UPDATE CASCADE
        ON DELETE SET NULL

);

DROP TABLE IF EXISTS dynamic_content;
CREATE TABLE dynamic_content (
   id INT AUTO_INCREMENT PRIMARY KEY,
   s_element_type VARCHAR(255),
   s_location VARCHAR(255),
   resource_id INT,

   FOREIGN KEY (resource_id) REFERENCES resource  (id)
          ON UPDATE CASCADE
          ON DELETE SET NULL

);