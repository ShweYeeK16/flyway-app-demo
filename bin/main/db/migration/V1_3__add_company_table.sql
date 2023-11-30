CREATE TABLE Company (
    company_id INT AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(100) NOT NULL,
    address VARCHAR(255),
    city VARCHAR(50),
    state VARCHAR(50),
    postal_code VARCHAR(10),
    country VARCHAR(50),
    phone_number VARCHAR(20),
    email VARCHAR(100) UNIQUE,
    website VARCHAR(255),
    founded_date DATE,
    description TEXT
);