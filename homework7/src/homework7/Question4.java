
package homework7;

import java.util.*;

public class Question4 {
	
	//Given Student class sort students list with their first name using comparable interface
	// File: Student.java
	// hint implement Comparable interface 
	public static class Student implements Comparable <Student> {

	private String firstName;
	private int age;
	 
	
		public Student(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
		
	}


		// constructor here
	//getter and setters here
	//add toString methode here
	
	
	public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


	@Override
	public String toString() {
		return"Student [name=" + firstName + ", age=" +age + "]";
}


	public int compareTo(Student n) {
		int com = this.firstName.compareTo(n.firstName);
		if(com<0) {
			return -1;
		}
		else if(com > 0) {
			return 1;
		}
		else {
		return 0;
	}
	
	}
}

	public static void main(String [] args) {
		
	
	List<Student> students = new ArrayList<>();
	
	students.add(new Student("Hagos",20));
	students.add(new Student("Zeray",18));
	students.add(new Student("Tirhas",25));
	students.add(new Student("Seble",23));
	
	// Sort the students list with firstName//
	//hint use Collections.sort

	Collections.sort(students);
	for(Student i : students) {
		System.out.println(i);
	}
	
	}
	
}