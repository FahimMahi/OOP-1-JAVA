import java.util.Scanner;
public class TaskNo3 {
	public static void main(String []args)
    {
		Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter 1st Input: ");
        String s1 = sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter 2nd Input: ");
        String s2 = sc2.nextLine();
		
        String s3 = s1.concat(s2);
        System.out.println("The concatenate string is " + s3);
    }
}
