package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Name of the Student : Manivel");
	}
	
	public void studentDept()
	{
		System.out.println("Name of the Department : Computer Science and Applications");
	}
	
	public void studentId()
	{
		System.out.println("Student ID : 20211225");
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to College Portal \n");
		Student info = new Student();
		info.collegeName();
		info.collegeCode();
		info.collegeRank();
		info.departmentName();
		info.studentName();
		info.studentDept();
		info.studentId();
	}
}
