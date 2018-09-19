CREATE TABLE IF NOT EXISTS book (
    id int(5) NOT NULL AUTO_INCREMENT,
    title varchar(50) DEFAULT NULL,
    author varchar(50) DEFAULT NULL,
    year int(4) DEFAULT NULL,
    isbn int(13) DEFAULT NULL,
    price int(10) DEFAULT NULL,
    PRIMARY KEY(id)
    );
    
    
    CREATE TABLE IF NOT EXISTS category (
    id int(5) NOT NULL AUTO_INCREMENT,
    name varchar(50) DEFAULT NULL,
    book_id int(5) DEFAULT NULL,
    PRIMARY KEY(id),
    
    FOREIGN KEY (book_id) REFERENCES book(id) ON DELETE CASCADE
    );