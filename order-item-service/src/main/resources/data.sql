DROP TABLE IF EXISTS cust_order_item;

CREATE TABLE cust_order_item (
  order_id BIGINT NOT NULL,
  product_code VARCHAR(250) NOT NULL,
  product_name VARCHAR(250) NOT NULL,
  quantity INT NOT NULL,
  PRIMARY KEY(order_id, product_code)
);

INSERT INTO cust_order_item (order_id, product_code, product_name,quantity) VALUES
  (1, '123', 'Product 1', 2),
  (1, '456', 'Product 2', 1),
  (2, '456', 'Product 2', 2),
  (2, '657', 'Product 3', 5);
