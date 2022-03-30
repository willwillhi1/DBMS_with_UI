use transportation_company;
SELECT *
FROM package
WHERE NOT EXISTS (SELECT name
				  FROM customer 
				  WHERE customer.C_id = package.sender_id AND 
				  package.weight < 20);