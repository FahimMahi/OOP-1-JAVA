import java.util.Scanner;
public class TaskNo4 {
	public static void main(String []args)
    { 
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter A Word: ");
	  String s1 = input.nextLine();
	  StringBuffer s= new StringBuffer(s1);
	  s.reverse();
	  System.out.print("Reverse of this word is "+s);
	}
}	
	  
    