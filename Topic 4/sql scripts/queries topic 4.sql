-- item number 3, 4 and 5
select cs.name, tc.first_name, tc.last_name, st.first_name, st.last_name from course cs
	inner join teacher tc
    on cs.idcourse=tc.course_idcourse
    inner join student st inner join course_has_student chs
    on st.idstudent=chs.student_idstudent
    order by st.last_name, st.first_name;


select format(count(*)*100/(select count(*) from course_has_student),2) as passed,
format(100 - count(*)*100/(select count(*) from course_has_student),2) as failed,
cs.name from  student st
	inner join course_has_student chs
    on st.idstudent=chs.student_idstudent
    inner join course cs
    on chs.course_idcourse = cs.idcourse
    where chs.final_note>=6;





select tc.first_name as name, wkd.weekday, sct.start_time, sct.end_time, cs.name from teacher tc
	inner join course cs 
    on tc.idteacher=cs.teacher_idteacher
    inner join schedule_time sct 
    on cs.idcourse = sct.course_idcourse
    inner join weekday wkd
    on wkd.idweekday=sct.weekday_idweekday
    where tc.idteacher=1
    order by wkd.idweekday, sct.start_time;
    


select * from course;
select * from teacher;
select * from course_has_student;
select * from student;
select * from schedule_time;