use transportation_company;
SELECT AVG(package.weight)
FROM package
WHERE package.receiver_id = '354750';