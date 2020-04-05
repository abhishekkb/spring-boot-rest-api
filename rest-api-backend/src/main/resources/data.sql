DROP TABLE IF EXISTS billionaires;
 
CREATE TABLE accounts (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  fname VARCHAR(250) NOT NULL,
  lname VARCHAR(250) NOT NULL,
  address VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO accounts (fname, lname, address) VALUES
  ('Aliko', 'Dangote', 'xyz st bermuda triangle'),
  ('Bill', 'Gates', 'south pole, antartica'),
  ('vlady', 'p', 'ruska');