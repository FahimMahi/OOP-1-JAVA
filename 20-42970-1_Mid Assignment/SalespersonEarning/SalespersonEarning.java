import java.util.Scanner;
public class SalespersonEarning {
    public static void main(String args[]){
        double salary = 200;
        double percentage = 9;
        double salesPerson= 0.0;
        double totalSalary= 0.0;

        System.out.print("Enter quantity of sales: ");
        Scanner s = new Scanner(System.in);
        salesPerson = s.nextDouble();
		
        totalSalary = (salesPerson*(percentage/100));

        System.out.println("Salesperson's Earning : " + (totalSalary+salary));
    }
}