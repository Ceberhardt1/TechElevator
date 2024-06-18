CREATE TABLE members (
	member_number int PRIMARY KEY,
	last_name varchar(20) NOT NULL,
	first_name varchar(20) NOT NULL,
	email_address varchar(100) NOT NULL,
	phone_number varchar(20),
	date_of_birth date NOT NULL
);
	
CREATE TABLE interest_group (
	group_number int NOT NULL,
	name varchar(100) UNIQUE NOT NULL
	

);

CREATE TABLE events (
	event_number int NOT NULL,
	name varchar(20) NOT NULL, 
	description varchar(100) NOT NULL,
	start_date_and_time NOT NULL
	
	
	
	
);