SELECT *
FROM invoice
WHERE EXTRACT(MONTH FROM create_at) = Abril;

SELECT *
FROM invoice
WHERE EXTRACT(MONTH FROM create_at) = Agosto
  AND EXTRACT(YEAR FROM create_at) = 2020;

SELECT DISTINCT c.*
FROM client as c
         JOIN invoice as i ON c.id = i.client_id
         JOIN detail as d ON i.id = d.invoice_id
WHERE i.total > 100;

SELECT *
FROM client
WHERE address = 'Quito';

SELECT *
FROM product
WHERE price < 5.00;

SELECT *
FROM product
WHERE brand = 'ACME';

SELECT p.*, SUM(d.quantity) AS total_quantity_sold
FROM product as p
         JOIN detail as d ON p.id = d.product_id
GROUP BY p.id
ORDER BY total_quantity_sold DESC
    LIMIT 3;