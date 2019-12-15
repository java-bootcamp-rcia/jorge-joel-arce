-- item number 2

-- inserts into course table

select * from course;
insert into course (name, asigned_teacher, hours_by_week, schedule_time_idschedule_time, schedule_time_weekday_idweekday, teacher_idteacher) values("course 1", "teacher 1", 8, 1, 1,1);
insert into course (name, asigned_teacher, hours_by_week, schedule_time_idschedule_time, schedule_time_weekday_idweekday, teacher_idteacher) values("course 2", "teacher 2", 2, 2, 3,2);
insert into course (name, asigned_teacher, hours_by_week, schedule_time_idschedule_time, schedule_time_weekday_idweekday, teacher_idteacher) values("course 3", "teacher 3", 3, 3, 2,3);
insert into course (name, asigned_teacher, hours_by_week, schedule_time_idschedule_time, schedule_time_weekday_idweekday, teacher_idteacher) values("course 4", "teacher 1", 3, 4, 5,2);
insert into course (name, asigned_teacher, hours_by_week, schedule_time_idschedule_time, schedule_time_weekday_idweekday, teacher_idteacher) values("course 5", "teacher 1", 3, 5, 4,1);


-- inserts into teacher table
select * from teacher;
insert into teacher (first_name, last_name, date_of_birth) values ("teacher 1 name ", "teacher 1 last name", "2019-11-02");
insert into teacher (first_name, last_name, date_of_birth) values ("teacher 1 name ", "teacher 1 last name", "2019-11-02");
insert into teacher (first_name, last_name, date_of_birth) values ("teacher 1 name ", "teacher 1 last name", "2019-11-02");
insert into teacher (first_name, last_name, date_of_birth) values ("teacher 2 name ", "teacher 2 last name", "2018-10-15");
insert into teacher (first_name, last_name, date_of_birth) values ("teacher 3 name ", "teacher 3 last name", "2015-05-27");


-- inserts into student table
select * from student;
insert into student (first_name, last_name, date_of_birth) values ("student 1 name", "student 1 last name", "2019-11-02");
insert into student (first_name, last_name, date_of_birth) values ("student 2 name ", "student 2 last name", "2018-10-15");
insert into student (first_name, last_name, date_of_birth) values ("student 3 name ", "student 3 last name", "2015-05-27");
update student set registration_number = 1234 where idstudent = 1;
update student set registration_number = 0420 where idstudent = 2;
update student set registration_number = 9637 where idstudent = 3;



-- inserts into course_has_student table (intermediate table between course and student)
select * from course_has_student;
insert into course_has_student(course_idcourse, student_idstudent, partial_1, partial_2, partial_3, final_note) values (1, 1, 6, 7, 7, 7);
insert into course_has_student(course_idcourse, student_idstudent, partial_1, partial_2, partial_3, final_note) values (1, 2, 2, 10, 6, 6);
insert into course_has_student(course_idcourse, student_idstudent, partial_1, partial_2, partial_3, final_note) values (1, 3, 9, 9, 9, 9);

insert into course_has_student(course_idcourse, student_idstudent, partial_1, partial_2, partial_3, final_note) values (2, 1, 6, 7, 7, 7);
insert into course_has_student(course_idcourse, student_idstudent, partial_1, partial_2, partial_3, final_note) values (2, 2, 3, 7, 10, 7);
insert into course_has_student(course_idcourse, student_idstudent, partial_1, partial_2, partial_3, final_note) values (2, 3, 5, 6, 4, 5);

insert into course_has_student(course_idcourse, student_idstudent, partial_1, partial_2, partial_3, final_note) values (3, 1, 6, 6, 6, 6);
insert into course_has_student(course_idcourse, student_idstudent, partial_1, partial_2, partial_3, final_note) values (3, 2, 10, 10, 9, 10);
insert into course_has_student(course_idcourse, student_idstudent, partial_1, partial_2, partial_3, final_note) values (3, 3, 7, 8, 8, 8);




-- inserts into schedule_time
select * from schedule_time;
update schedule_time set weekday_idweekday = 3 where idschedule_time=9;
insert into schedule_time(start_time, end_time, weekday_idweekday, course_idcourse, course_teacher_idteacher) values ("09:00","11:00",1,5,1);
insert into schedule_time(start_time, end_time, weekday_idweekday, course_idcourse, course_teacher_idteacher) values ("08:00","10:00",2,4,3);
insert into schedule_time(start_time, end_time, weekday_idweekday, course_idcourse, course_teacher_idteacher) values ("07:00","09:00",3,3,3);
insert into schedule_time(start_time, end_time, weekday_idweekday, course_idcourse, course_teacher_idteacher) values ("17:00","19:30",4,2,2);
insert into schedule_time(start_time, end_time, weekday_idweekday, course_idcourse, course_teacher_idteacher) values ("19:00","22:30",5,1,1);
insert into schedule_time(start_time, end_time, weekday_idweekday, course_idcourse, course_teacher_idteacher) values ("16:00","17:00",4,2,2);
insert into schedule_time(start_time, end_time, weekday_idweekday, course_idcourse, course_teacher_idteacher) values ("20:00","21:00",3,3,2);
insert into schedule_time(start_time, end_time, weekday_idweekday, course_idcourse, course_teacher_idteacher) values ("17:00","19:00",2,4,1);
insert into schedule_time(start_time, end_time, weekday_idweekday, course_idcourse, course_teacher_idteacher) values ("16:00","18:00",1,5,3);


-- inserts into weekday
select * from weekday;
insert into weekday(weekday) values ("Monday");
insert into weekday(weekday) values ("Tuesday");
insert into weekday(weekday) values ("Wednesday");
insert into weekday(weekday) values ("Thursday");
insert into weekday(weekday) values ("Friday");


