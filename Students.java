package week3.day1;

public class Students 
{
	private void getStudentInfo(int ID) 
	{
		System.out.println("Student ID: "+ID+"\n");
	}
	
	private void getStudentInfo(int ID, String name) 
	{
		System.out.println("Student ID: "+ID);
		System.out.println("Student name: "+name+"\n");
	}
	
	private void getStudentInfo(String email,long phone) 
	{
		System.out.println("Student's Mail: "+email);
		System.out.println("Student's Mobile number: "+phone);
	}

	public static void main(String[] args) 
	{
		Students student = new Students();
		student.getStudentInfo(20211225);
		student.getStudentInfo(20220108, "Manivel");
		student.getStudentInfo("manveloffcl@gmail.com", 8667577944L);
	}

}
