package day4exercise;

public class day4Exer {

		-- Practice
		-- -----------------------------------------------------------------------------------------------------------

		-- Create the DB ,tables and load the data in the example
		-- Q1 
		-- -----------------------------------------------------------------------------------------------------------
		-- select first and last name of employees with salaries greater than 10000 and hired after 1998 
		-- and do not include employees from Administration and the employees should be from Australia or Canada.

		select first_name, last_name 
		from employees 
		inner join departments on departments.department_id = employees.employee_id
		where salary > 10000 and hire_date >'1946-01-01' and not (departments.department_id = 1);
		 


		-- Q2
		-- -----------------------------------------------------------------------------------------------------------
		-- Select the first 6 higly paid employees who are Accountants,Administration Assistant

		select *from employees
		inner join departments on departments.department_id = employees.employee_id
		order by salary desc limit 0,6;


		-- Q3 
		-- -----------------------------------------------------------------------------------------------------------
		-- Select dependents of the employees whose salaries are between 10000 and 20000

		select *from employees
		where salary between 10000 and 20000



	}

}
