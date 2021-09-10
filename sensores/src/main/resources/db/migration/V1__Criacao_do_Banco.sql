CREATE TABLE dryers_log (
 id INT NOT NULL,

 primary key (id)

);

CREATE TABLE channel (
    id INT NOT NULL,
    name VARCHAR(100),
    description VARCHAR(100),
    latitude double,
    longitude double,
    field1 VARCHAR(50),
    field2 VARCHAR(50),
    field3 VARCHAR(50),
    field4 VARCHAR(50),
    field5 VARCHAR(50),
    created_at DATETIME,
    updated_at DATETIME,
    last_entry_id INT,
    id_dryers_log INT,

    primary key (id),
    foreign key (id_dryers_log) REFERENCES dryers_log(id)
);

CREATE TABLE field(
    entry_id INT NOT NULL,
    created_at DATETIME,
    field1 VARCHAR(50),
    field2 VARCHAR(50),
    field3 VARCHAR(50),
    field4 VARCHAR(50),
    field5 VARCHAR(50),
    id_dryers_log INT,
    primary key (entry_id),
    foreign key (id_dryers_log) REFERENCES dryers_log(id)
);


