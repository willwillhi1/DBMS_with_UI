use transportation_company;
CREATE TABLE deliveryman (
D_id INT(6) UNSIGNED PRIMARY KEY,
name VARCHAR(30) NOT NULL,
license_num BIGINT(10) UNSIGNED NOT NULL
);

INSERT INTO deliveryman (D_id, name, license_num) values ('123456', 'Amelia', '1234567890');
INSERT INTO deliveryman (D_id, name, license_num) values ('123277', 'Emma', '1984603777');
INSERT INTO deliveryman (D_id, name, license_num) values ('094682', 'Ivy', '9476204729');
INSERT INTO deliveryman (D_id, name, license_num) values ('495820', 'Jessica', '0485739279');
INSERT INTO deliveryman (D_id, name, license_num) values ('978654', 'Mia', '3957205873');
INSERT INTO deliveryman (D_id, name, license_num) values ('048394', 'Nova', '0483957395');
INSERT INTO deliveryman (D_id, name, license_num) values ('394759', 'Ace', '0400497577');
INSERT INTO deliveryman (D_id, name, license_num) values ('019384', 'Arthur', '1049487636');
INSERT INTO deliveryman (D_id, name, license_num) values ('358853', 'Ben', '9282736480');
INSERT INTO deliveryman (D_id, name, license_num) values ('003938', 'Benjamin', '6638930498');
