package org.student;

import org.department.Department;

public class Student_Details extends Department {

	public void stu_name() {
		System.out.println("Rahman Khan M");
	}

	public void stu_dept() {
		System.out.println("IT");
	}

	public void stu_id() {
		System.out.println("412517");
	}

	public static void main(String[] args) {
		Student_Details stu = new Student_Details();
		stu.collegeCode();
		stu.collegeName();
		stu.depName();
		stu.stu_name();
		stu.stu_dept();
		stu.stu_id();
		stu.collegeRank();

	}

}
