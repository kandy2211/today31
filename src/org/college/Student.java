package org.college;

public class Student extends College {
	public void studentName() {
		System.out.println("kkr");
	}

	public void studentDept() {
		System.out.println("civil");
	}

	public void studentId() {
		System.out.println("38483");
	}

	public static void main(String[] args) {
		Student d = new Student();
		d.studentName();
		d.studentDept();
		d.studentId();
		d.collegeName();
		d.collegeCode();
		d.collegeRank();
	
	}
}
