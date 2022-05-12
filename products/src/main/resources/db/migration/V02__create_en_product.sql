CREATE TABLE en_product (
  product_id SERIAL PRIMARY KEY,
  category_id SERIAL NOT NULL,
  name VARCHAR(100) NOT NULL,
  description VARCHAR(1000) NOT NULL,
  weight FLOAT,
  price FLOAT NOT NULL,
  CONSTRAINT fk_category_id FOREIGN KEY (category_id)
    REFERENCES en_category(category_id)
);
