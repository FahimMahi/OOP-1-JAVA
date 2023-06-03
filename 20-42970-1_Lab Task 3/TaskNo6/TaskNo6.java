import java.util.Scanner;
public class TaskNo6 {
	public static void main(String []args){
		Scanner inputStr = new Scanner (System.in);
		System.out.print("Enter A Email Address: ");
		String Str = inputStr.nextLine();
		boolean checkEmail = Str.contains("@");
		
		if(checkEmail == true)
		{
			System.out.println("This Email Is Valid");
		}
		
		else
		{
			System.out.println("This Email Is Invalid");
		}
	}
}	