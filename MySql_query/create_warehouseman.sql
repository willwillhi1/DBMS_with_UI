use transportation_company;
CREATE TABLE warehouseman (
W_id INT(6) UNSIGNED PRIMARY KEY,
name VARCHAR(30) NOT NULL,
supervisor_id INT(6) UNSIGNED NOT NULL,
FOREIGN KEY(supervisor_id) REFERENCES supervisor(supervisor_id)
);

INSERT INTO warehouseman (W_id, name, supervisor_id) values ('124236', 'Toby', '974211');
INSERT INTO warehouseman (W_id, name, supervisor_id) values ('472123', 'Joyce', '352352');
INSERT INTO warehouseman (W_id, name, supervisor_id) values ('464585', 'Thomas', '974211');
INSERT INTO warehouseman (W_id, name, supervisor_id) values ('436578', 'Leona', '759568');
INSERT INTO warehouseman (W_id, name, supervisor_id) values ('547688', 'Victor', '463406');
INSERT INTO warehouseman (W_id, name, supervisor_id) values ('135479', 'Nicole', '463406');
INSERT INTO warehouseman (W_id, name, supervisor_id) values ('437569', 'Walter', '352352');
INSERT INTO warehouseman (W_id, name, supervisor_id) values ('742621', 'Monica', '135256');
INSERT INTO warehouseman (W_id, name, supervisor_id) values ('555743', 'William', '103759');
INSERT INTO warehouseman (W_id, name, supervisor_id) values ('045372', 'Miranda', '323435');
