import java.io.*;
public class StudentInfo {
    public static void main(String []args) {
    Student s1 = new Student("Fahim Mahmud Bhuiyan"); 
    s1.setID("20-42970-1");
	s1.getID();
    s1.setDepartment("CSE");
	s1.getDepartment();
    s1.setCGPA(4);
	s1.getCGPA();
	s1.showInfo();
    }
}