SELECT p.firstName,p.lastName,
(SELECT city FROM address a WHERE a.personId = p.personid) as city,
(SELECT state FROM address a1 Where a1.personId= p.personid) as state

FROM person  p;
