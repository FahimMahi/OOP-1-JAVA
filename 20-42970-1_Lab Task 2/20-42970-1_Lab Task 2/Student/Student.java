import java.io.*;
	public class Student {
	private String name;
	private String id;
	private String department;
	private float cgpa;

  
    public Student(){
	System.out.println("Empty Constructor");
	}
	public Student(String name) {
	this.name = name;
	}
   
	public void setID(String sid) {
	id = sid;
	}
	public String getID()
	{
	return id;
	}
	
	public void setDepartment(String sdepartment) {
    department = sdepartment;
    }
	public String getDepartment()
	{
	return department;
	}

	public void setCGPA(float scgpa) {
    cgpa = scgpa;
    }
    public float getCGPA()
	{
	return cgpa;
	}

    public void showInfo() {
	System.out.println("Student's Info: ");
    System.out.println("Name: "+name);
	System.out.println("ID: "+id);
    System.out.println("Department: "+department);
    System.out.println("CGPA: "+cgpa);
    }
}