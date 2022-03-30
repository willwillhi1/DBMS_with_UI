use transportation_company;
CREATE TABLE package (
P_id INT(6) UNSIGNED PRIMARY KEY,
weight FLOAT(3) UNSIGNED,
address VARCHAR(30) NOT NULL,
receiver_id INT(6) UNSIGNED NOT NULL,
sender_id INT(6) UNSIGNED NOT NULL,
manager_id INT(6) UNSIGNED NOT NULL,
FOREIGN KEY(receiver_id) REFERENCES customer(C_id),
FOREIGN KEY(sender_id) REFERENCES customer(C_id),
FOREIGN KEY(manager_id) REFERENCES warehouseman(W_id)
);

INSERT INTO package (P_id, weight, address, receiver_id, sender_id, manager_id) values ('224124', '22.13', 'adderssA', '395792', '346567', '124236');
INSERT INTO package (P_id, weight, address, receiver_id, sender_id, manager_id) values ('353256', '1.33', 'adderssA', '004855', '532671', '472123');
INSERT INTO package (P_id, weight, address, receiver_id, sender_id, manager_id) values ('547484', '0.33', 'adderssA', '354750', '346567', '436578');
INSERT INTO package (P_id, weight, address, receiver_id, sender_id, manager_id) values ('133444', '7.75', 'adderssB', '646346', '004855', '464585');
INSERT INTO package (P_id, weight, address, receiver_id, sender_id, manager_id) values ('555555', '10.65', 'adderssB', '395792', '132035', '124236');
INSERT INTO package (P_id, weight, address, receiver_id, sender_id, manager_id) values ('463478', '0.12', 'adderssC', '532671', '153604', '436578');
INSERT INTO package (P_id, weight, address, receiver_id, sender_id, manager_id) values ('654242', '0.53', 'adderssC', '004855', '233423', '742621');
INSERT INTO package (P_id, weight, address, receiver_id, sender_id, manager_id) values ('754835', '5.43', 'adderssC', '395792', '132035', '135479');
INSERT INTO package (P_id, weight, address, receiver_id, sender_id, manager_id) values ('076399', '0.22', 'adderssD', '153604', '354750', '742621');
INSERT INTO package (P_id, weight, address, receiver_id, sender_id, manager_id) values ('574634', '8.94', 'adderssE', '354750', '233423', '464585');
