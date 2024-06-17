START TRANSACTION;

DROP TABLE IF EXISTS customers, artists, art, customer_purchases;

CREATE TABLE customers
(
	customerId serial,
	firstName varchar(50) NOT NULL,
	address varchar(100) NOT NULL,
	phone varchar(12) NULL,
	
	--constaint <name of the constraint> 
	CONSTRAINT pk_customers PRIMARY KEY (customerId)
);


CREATE TABLE artists
(
	artistId serial,
	firstName varchar(50) NOT NULL,
	lastName varchar(50) NOT NULL,
	
	constraint pk_artist PRIMARY KEY (artistId)
);


CREATE TABLE art
(
	artId serial, 
	title varchar(50) NOT NULL,
	artistId int NOT NULL,
	
	CONSTRAINT pk_art PRIMARY KEY (artId),
	CONSTRAINT fk_art_artists FOREIGN KEY (artistId) REFERENCES artists(artistId)
	
);

CREATE TABLE customer_purchases
(
	customerId int NOT NULL,
	artId int NOT NULL,
	purchaseDate timestamp NOT NULL,
	purchasePrice money NOT NULL,
	
	CONSTRAINT pk_customer_purchases PRIMARY KEY (customerId, artId, purchaseDate),
	CONSTRAINT fk_customer_purchases_customer FOREIGN KEY (customerId) REFERENCES customers (customerId),
	CONSTRAINT fk_customer_purchases_art FOREIGN KEY (artId) REFERENCES art(artId)
);

--ROLLBACK;

COMMIT;