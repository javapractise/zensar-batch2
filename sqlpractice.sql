select * from customerinfo;

use customer;

UPDATE Customerinfo
SET name='Alfred Schmidt'
WHERE id=3;

alter table customerinfo add dept varchar(20);

insert into customerinfo values(6,"sweety",3000,"IT");
select * from customerinfo;
UPDATE Customerinfo
SET dept='ECE'
WHERE id=3;

UPDATE Customerinfo
SET dept='CSE'
WHERE id=1;