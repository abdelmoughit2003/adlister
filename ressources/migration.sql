CREATE DATABASE IF NOT EXISTS adlister_db;
use adlister_db;
CREATE TABLE IF NOT EXISTS ads(

  id int UNSIGNED not NULL AUTO_INCREMENT,
  title VARCHAR(400) not null,
  description text,
  PRIMARY KEY (id)
);
