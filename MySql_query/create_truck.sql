use transportation_company;
CREATE TABLE truck (
T_id INT(3) UNSIGNED PRIMARY KEY,
location_address VARCHAR(30) NOT NULL,
license_plate_num VARCHAR(7) NOT NULL
);

INSERT INTO truck (T_id, location_address, license_plate_num) values ('123', 'addressA', 'QWD1234');
INSERT INTO truck (T_id, location_address, license_plate_num) values ('125', 'addressB', 'FLR4503');
INSERT INTO truck (T_id, location_address, license_plate_num) values ('682', 'addressR', 'EVR1345');
INSERT INTO truck (T_id, location_address, license_plate_num) values ('820', 'addressD', 'FBY7543');
INSERT INTO truck (T_id, location_address, license_plate_num) values ('654', 'addressR', 'HKL7643');
INSERT INTO truck (T_id, location_address, license_plate_num) values ('034', 'addressJ', 'GRY2456');
INSERT INTO truck (T_id, location_address, license_plate_num) values ('359', 'addressU', 'SCB5678');
INSERT INTO truck (T_id, location_address, license_plate_num) values ('084', 'addressG', 'JKD2465');
INSERT INTO truck (T_id, location_address, license_plate_num) values ('853', 'addressC', 'ASH9664');
INSERT INTO truck (T_id, location_address, license_plate_num) values ('358', 'addressW', 'ERH2358truck');
