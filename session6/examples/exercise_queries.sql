INSERT INTO transaction (accountNo, date_, action, amount) VALUES (400001, '23/07/2020', 'DEPOSIT', 10000);
INSERT INTO transaction (accountNo, date_, action, amount) VALUES (400001, '25/07/2020', 'WITHDRAW', 5000);

SELECT * FROM transaction;
SELECT accountNo, action FROM transaction;
SELECT * FROM transaction WHERE action = 'DEPOSIT';

UPDATE transaction SET amount = 6000 WHERE date_ = '25/07/2020';

DELETE FROM transaction WHERE accountno = 400001;
