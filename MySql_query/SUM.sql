use transportation_company;
SELECT SUM(package.weight)
FROM package
WHERE package.receiver_id = '354750';