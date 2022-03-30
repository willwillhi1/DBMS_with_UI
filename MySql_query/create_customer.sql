use transportation_company;
CREATE TABLE customer (
C_id INT(6) UNSIGNED PRIMARY KEY,
name VARCHAR(30) NOT NULL,
phone_no BIGINT(10) UNSIGNED NOT NULL
);

INSERT INTO customer (C_id, name, phone_no) values ('395792', 'Bob', '1234567890');
INSERT INTO customer (C_id, name, phone_no) values ('132035', 'Brian', '1984603777');
INSERT INTO customer (C_id, name, phone_no) values ('233423', 'Bruce', '9476204729');
INSERT INTO customer (C_id, name, phone_no) values ('004855', 'Dale', '0485739279');
INSERT INTO customer (C_id, name, phone_no) values ('646346', 'Clara', '3957205873');
INSERT INTO customer (C_id, name, phone_no) values ('532671', 'Jane', '0483957395');
INSERT INTO customer (C_id, name, phone_no) values ('153604', 'Don', '0400497577');
INSERT INTO customer (C_id, name, phone_no) values ('354750', 'Leo', '1049487636');
INSERT INTO customer (C_id, name, phone_no) values ('346567', 'Belle', '9282736480');
INSERT INTO customer (C_id, name, phone_no) values ('246811', 'Charlie', '6638930498');
