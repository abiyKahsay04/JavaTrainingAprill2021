#1
create database school

#2
create table student ( 
studentid INT NOT NULL,
first_name VARCHAR(250) ,
last_name VARCHAR(250) ,
address VARCHAR(250) ,
PRIMARY KEY (studentid)
);

#3 
 create table course ( courseid INT NOT NULL,
 course_name varchar(250) ,
 course_credit int,
 PRIMARY KEY (courseid)
 );

 #4
 insert into student 
 values ('1', 'Muze' ,'Gebru', 'Eagan'), ('2', 'Kebrom', 'berhe', 'Mekelle'), 
 ('3 ','Sami', 'Anannia', 'St.paul'), ('4', 'Abduselam', 'Husan','Eagan'),
 ('5', 'Yibrah','Kidane', 'Woodberry');
 
 insert into course 
 values ('1', 'Java', '4'),('2', 'MYSQL','3'),('3', 'Mule', '5'), 
 ('4', 'Python', '4'),('5', 'Math', '3');
 
 
 #5
 select* FROM student;
 select * from course;
 

 #6
 select* FROM student 
 WHERE studentid =3;
 
 
 #7
 update course 
 set course_credit = 5 
 where course_credit = 5;
 
 
 #8
 delete from student
 where studentid = '5'
 
 delete from course
 where courseid = '2'

	