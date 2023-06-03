import java.util.Scanner;
public class TaskNo7 {
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter A Phone Number: ");
		String num = input.nextLine();
		
		boolean CheckThisNumber1 = num.contains("017");
		boolean CheckThisNumber2 = num.contains("016");
		boolean CheckThisNumber3 = num.contains("018");
		boolean CheckThisNumber4 = num.contains("019");
		boolean CheckThisNumber5 = num.contains("015");
		
		if(CheckThisNumber1 == true)
		{
			System.out.println("This is GrameenPhone Number");
		}
		
		else if(CheckThisNumber2 == true)
		{
			System.out.println("This is Airtel Number");
		}
		
		else if(CheckThisNumber3 == true)
		{
			System.out.println("This is Robi Number");
		}
		
		else if(CheckThisNumber4 == true)
		{
			System.out.println("This is Banglalink Number");
		}
		
		else if(CheckThisNumber5 == true)
		{
			System.out.println("This is Teletalk Number");
		}
		
		else
		{
			System.out.println("This is Invalid Number");
		}
	}
}