DROP TABLE IF EXISTS cust_order;

CREATE TABLE cust_order (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  customer_name VARCHAR(250) NOT NULL,
  order_date VARCHAR(250) NOT NULL,
  shipping_address VARCHAR(250) NOT NULL,
  total DECIMAL(20,2) NOT NULL
);

INSERT INTO cust_order (customer_name, order_date, shipping_address, total) VALUES
  ('Test cust 1', '12/08/20', 'Test address1', 20.2),
  ('Test cust 2', '12/08/20', '123 Main Street', 10.0);
