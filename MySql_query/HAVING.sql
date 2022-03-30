use transportation_company;
SELECT COUNT(package.address), package.address
FROM package
GROUP BY address
HAVING COUNT(package.address) >= 2;