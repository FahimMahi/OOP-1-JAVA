import java.util.Scanner;
public class TaskNo1 {  
	public static void main(String []args)
	{  
		Scanner a = new Scanner(System.in);
		System.out.print("Enter a line: ");
		String s = a.nextLine();
		System.out.print("Enter index number: "); 
		int n = a.nextInt(); 
		char ch= s.charAt(n); 
		System.out.print("Character of index is "+ch);  
	}
}