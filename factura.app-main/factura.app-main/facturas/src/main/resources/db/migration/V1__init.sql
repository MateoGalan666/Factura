CREATE TABLE Client (
                         id INT PRIMARY KEY ,
                         nui VARCHAR(255) UNIQUE,
                         fullname VARCHAR(255),
                         address VARCHAR(255)
);

CREATE TABLE Invoice (
                         id INT PRIMARY KEY ,
                         code VARCHAR(255) UNIQUE,
                         create_at DATE,
                         total DECIMAL(10, 2),
                         client_id INT,
                         FOREIGN KEY (client_id) REFERENCES Client(id)
);

CREATE TABLE Product (
                          id INT PRIMARY KEY ,
                          description VARCHAR(255),
                          brand VARCHAR(255),
                          price DECIMAL(10, 2),
                          stock INT
);

CREATE TABLE Detail (
                         id INT PRIMARY KEY ,
                         quantity INT,
                         price DECIMAL(10, 2),
                         invoice_id INT,
                         product_id INT,
                         FOREIGN KEY (invoice_id) REFERENCES Invoice(id),
                         FOREIGN KEY (product_id) REFERENCES Product(id)
);