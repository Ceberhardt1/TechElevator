CREATE TABLE members (
	member_number serial,
	last_name varchar(20) NOT NULL,
	first_name varchar(20) NOT NULL,
	email_address varchar(100) NOT NULL,
	phone_number varchar(20),
	date_of_birth date NOT NULL
	
	CONSTRAINT pk_members PRIMARY KEY (member_number);
);
--insert
	
CREATE TABLE interest_group (
	group_number serial,
	group_name varchar(100) NOT NULL,
	number_members int NOT NULL,
	number_groups int NOT NULL
	
	CONSTRAINT pk_interest_group PRIMARY KEY (group_number);
);

CREATE TABLE events (
	event_number serial,
	event_name varchar(20) NOT NULL, 
	description varchar(100) NOT NULL,
	start_date_and_time NOT NULL,
	start_date int,
	duration int, 
	groups_running int NOT NULL,
	
	CONSTRAINT pk_events PRIMARY KEY event_number
	
	
	
	
);