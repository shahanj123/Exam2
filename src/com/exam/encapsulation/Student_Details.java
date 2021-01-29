package com.exam.encapsulation;

public class Student_Details {

	public static void main(String[] args) {
		Student s = new Student();
		s.setStudent_name("Bill Collins");
		s.setStudent_age(20);
		s.setDepartment("Engineering");
		System.out.println(s.getStudent_name());
		System.out.println(s.getStudent_age());
		System.out.println(s.getDepartment());
	}

}
