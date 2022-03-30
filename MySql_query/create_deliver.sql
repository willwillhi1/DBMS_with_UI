use transportation_company;
CREATE TABLE deliver (
deliveryman_id INT(6) UNSIGNED,
truck_id INT(3) UNSIGNED,
package_id INT(6) UNSIGNED,
deverly_num INT(6) UNSIGNED NOT NULL,
FOREIGN KEY(deliveryman_id) REFERENCES deliveryman(D_id),
FOREIGN KEY(truck_id) REFERENCES truck(T_id),
FOREIGN KEY(package_id) REFERENCES package(P_id),
primary key (deliveryman_id, truck_id, package_id)
);

INSERT INTO deliver (deliveryman_id, truck_id, package_id, deverly_num) values ('123456', '123', '224124', '135564');
INSERT INTO deliver (deliveryman_id, truck_id, package_id, deverly_num) values ('358853', '682', '654242', '247533');
INSERT INTO deliver (deliveryman_id, truck_id, package_id, deverly_num) values ('094682', '084', '353256', '346462');
INSERT INTO deliver (deliveryman_id, truck_id, package_id, deverly_num) values ('123456', '359', '547484', '054711');
INSERT INTO deliver (deliveryman_id, truck_id, package_id, deverly_num) values ('394759', '820', '574634', '646351');
INSERT INTO deliver (deliveryman_id, truck_id, package_id, deverly_num) values ('003938', '123', '133444', '623111');
INSERT INTO deliver (deliveryman_id, truck_id, package_id, deverly_num) values ('094682', '853', '555555', '758242');
INSERT INTO deliver (deliveryman_id, truck_id, package_id, deverly_num) values ('123277', '125', '463478', '686074');
INSERT INTO deliver (deliveryman_id, truck_id, package_id, deverly_num) values ('048394', '654', '076399', '313667');
INSERT INTO deliver (deliveryman_id, truck_id, package_id, deverly_num) values ('978654', '034', '754835', '772217');
