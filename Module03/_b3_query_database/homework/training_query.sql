select * from students
where ten = 'Huong';

select ten, sum(sotien) as 'Tổng tiền' from students
where ten = 'Huong'
group by ten; 

select distinct * from students;