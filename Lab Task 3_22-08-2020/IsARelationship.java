class Person {
	private String name;
	private String email;
	Person(){
		System.out.println("Default Constructor");
    }
	public void setPerson(String n, String e){
		this.name = n;
		this.email = e; }
	public String getName(){
	   return name;
    }
    public String getEmail(){
	   return email;
    }
    public void showPerson(){
        System.out.println("Printing Person--------");
		System.out.println("Name: "+getName());
		System.out.println("Email: "+getEmail());
		System.out.println("-----------------------");
    }
}
class Student extends Person{
	private String studentId;
	private String admissionDate;
	Student(){
		System.out.println("Default Constructor");
    }
	public void setStudent(String sID, String addDate){
		this.studentId = sID;
		this.admissionDate = addDate; 
	}
	public String getStudentId(){
		return studentId;
    }
	public String getAdmissionDate(){
		return admissionDate;
	}
    public void showStudent(){
        System.out.println("\nPrinting Student----------");
		System.out.println("ID: "+getStudentId());
		System.out.println("Admission Date: "+getAdmissionDate());
		System.out.println("Name: "+getName());
		System.out.println("Email: "+getEmail());
		System.out.println("--------------------------");
    }
}
class Teacher extends Person{
	private String employeeId;
	private String joiningDate;
	private String employeeName;
	private String employeeEmail;
	Teacher(){
		System.out.println("Default Constructor");
    }
	public void setTeacher(String eID, String JoD,String eName,String eEmail){
		this.employeeId = eID;
		this.joiningDate = JoD;
		this.employeeName= eName;
		this.employeeEmail=eEmail;   
	}
	public String getEmployeeId(){
		return employeeId;
	}
	public String getJoiningDate(){
		return joiningDate;
	}
	public String getEmployeeName(){
		return employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
    public void showTeacher(){
        System.out.println("\nPrinting Teacher----------");
		System.out.println("ID: "+getEmployeeId());
		System.out.println("Joining Date: "+getJoiningDate());
		System.out.println("Name: "+getEmployeeName());
		System.out.println("Email: "+getEmployeeEmail());
		System.out.println("--------------------------");
    }
}
public class IsARelationship {
    public static void main(String args[]){
		Student b = new Student();
        b.setPerson("James Bond", "bond@aiub.edu");
        b.setStudent("20-42085-1", "13/01/2015");
		b.showStudent();

        Teacher c = new Teacher();
        c.setTeacher("1-47811-1", "13/01/2015 ", "Karl Ei", "karl@aiub.edu");
        c.showTeacher();
    }
}