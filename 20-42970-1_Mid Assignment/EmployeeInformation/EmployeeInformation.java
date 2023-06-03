import java.util.Scanner;
public class EmployeeInformation{
public static void main(String args[]) {
	double managersSalary;
    double adminsalary;
    double salesmanSalary;
    double managers;
    double adminOfficers;
    double salesman;
   
    Scanner s=new Scanner(System.in);
    System.out.print("Enter monthly salary of Managers:");
    managersSalary = s.nextDouble();
    managers=managersSalary*12;
	
    System.out.print("Enter monthly salary of Admin Officer:");
    adminsalary=s.nextDouble();
	adminOfficers=adminsalary*12;
   
    System.out.print("Enter monthly salary of Salesman:");
    salesmanSalary=s.nextDouble();
    salesman=salesmanSalary*12;
 
    System.out.println("Yearly Salary Of Manager:"+managers+"taka");
    System.out.println("Yearly Salary Of Admin Officers:"+adminOfficers+"taka");
    System.out.println("Yearly Salary Of Salesman:"+salesman+"taka");
 }
}