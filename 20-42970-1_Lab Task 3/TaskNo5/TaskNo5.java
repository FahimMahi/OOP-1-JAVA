import java.util.Scanner;
public class TaskNo5{
	public static void main(String []args){ 
		System.out.println("StringBuffer");
		Scanner s= new Scanner(System.in);
		System.out.print("Enter First Input: ");
		String s1=s.nextLine();
		System.out.print("Enter Second Input: ");
		String str=s.nextLine();
		int b=s1.length();
		StringBuffer sb = new StringBuffer(s1);
		sb.insert(b,str);
		System.out.print("The concatenate string is "+sb);
   }  
}