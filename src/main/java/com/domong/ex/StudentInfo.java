package com.domong.ex;

public class StudentInfo {
	
	private Student student; //������ DI
	
	public StudentInfo(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) { //setter DI
		this.student = student;
	}

	public void getStudentInfo() {
		
		System.out.println("�̸� : " + student.getName());
		System.out.println("���� : " + student.getAge());
		System.out.println("�г� : " + student.getGradeNum());
		System.out.println("�� : " + student.getClassNum());
	}
}