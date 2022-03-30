use transportation_company;
SELECT *
FROM customer
WHERE customer.name
NOT IN ('Dale', 'Charlie', 'Leo');
