class Person{
	private String name;
	private String email;
    Person() {
	   System.out.println("This is default constructor");
	   System.out.println("\n");
   }
  public void setPerson(String X, String Y) {
	this.name = X;
	this.email = Y; }
	public String getName(){
	   return name;
    }
    public String getEmail(){
	   return email;
    }
    public void showPerson(){
	   System.out.println("Printing Person------ ");
	   System.out.println("Name: "+getName());
	   System.out.println("Email: "+getEmail());
	   System.out.println("----------------------");
    }
}
class Student extends Person{
	private String studentId;
	private String admissionDate;
   Student()
   {
	   System.out.println("This is default constructor");
	   System.out.println("\n");
   }
  public void setStudent(String A, String B)
   {this.studentId = A;
   this.admissionDate = B; }
   public String getStudentId()
   {
	   return studentId;
   }
   public String getAdmissionDate()
   {
	   return admissionDate;
   }
   public void showStudent()
   {
	   System.out.println("Printing Student--------");
	   System.out.println("ID : "+getStudentId());
	   System.out.println("Admission Date: "+getAdmissionDate());
	   System.out.println("Name: "+getName());
	   System.out.println("Email: "+getEmail());
	   System.out.println("-----------------------");
   }
}
class Teacher{
	private String employeeId;
	private String joiningDate;
	private String name1;
	private String email1;
   Teacher()
   {
	   System.out.println("This is default constructor");
   }
  public void setTeacher(String C, String D,String E,String F)
   {this.employeeId = C;
   this.joiningDate = D;
   this. name1= E;
   this. email1=F;   
   }
   public String getEmployeeId()
   {
	   return employeeId;
   }
   public String getJoiningDate()
   {
	   return joiningDate;
   }
   public String getTname()
   {
	   return name1;
   }
   public String getTemail()
   {
	   return email1;
   }
   public void showTeacher()
   {  System.out.println("\n");
	  System.out.println("Printing Teacher-------- ");
	  System.out.println("ID: "+getEmployeeId());
	  System.out.println("Joining Date: "+getJoiningDate());
	  System.out.println("Name: "+getTname());
	  System.out.println("Email: "+getTemail());
	  System.out.println("-----------------------");
   }
}
public class Info {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setPerson("James Bond", "bond@aiub.edu");
		s1.setStudent("20-42085-1", "13/01/2015");
		s1.showStudent();
        Teacher t1 = new Teacher();
		t1.setTeacher("1-47811-1", "13/01/2015 ", "Karl Ei","karl@aiub.edu");
		t1.showTeacher();
	}
}