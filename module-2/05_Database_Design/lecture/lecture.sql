CREATE TABLE members (
	member_id serial,
	last_name varchar(20) NOT NULL,
	first_name varchar(20) NOT NULL,
	email_address varchar(100) NOT NULL,
	phone_number varchar(20),
	date_of_birth date NOT NULL
	
	CONSTRAINT pk_members PRIMARY KEY (member_id);
);

	
CREATE TABLE interest_group (
	group_id serial,
	group_name varchar(100) NOT NULL,
	
	
	CONSTRAINT pk_interest_group PRIMARY KEY (group_id);
);

CREATE TABLE events (
	events_id serial,
	event_name varchar(20) NOT NULL, 
	description varchar(100) NOT NULL,
	start_date_and_time NOT NULL,
	start_date int,
	duration int, 
	groups_id int NOT NULL,
	
	CONSTRAINT pk_events PRIMARY KEY events_id
	CONSTRAINT FK_group_member_group FOREIGN KEY(group_id) REFERENCES group(group_id)
	
	
);

CREATE TABLE group_member (
    group_id int NOT NULL,
    member_id int NOT NULL,
	CONSTRAINT PK_group_member PRIMARY KEY(group_id, member_id),
    CONSTRAINT FK_group_member_group FOREIGN KEY(group_id) REFERENCES group(group_id),
    CONSTRAINT FK_group_member_member FOREIGN KEY(member_id) REFERENCES member(member_id)
);

CREATE TABLE events_member (
    events_id int NOT NULL,
    member_id int NOT NULL,
	CONSTRAINT PK_events_member PRIMARY KEY(events_id, member_id),
    CONSTRAINT FK_events_member_group FOREIGN KEY(events_id) REFERENCES events(events_id),
    CONSTRAINT FK_events_member_member FOREIGN KEY(member_id) REFERENCES member(member_id)
);