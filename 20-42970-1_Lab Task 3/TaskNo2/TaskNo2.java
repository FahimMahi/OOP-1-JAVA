import java.util.Scanner;
public class TaskNo2 {
	public static void main(String []args)
    {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter 1st Input: ");
		String s1 = sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter 2nd Input: ");
		String s2 = sc2.nextLine();
		int result = s1.compareToIgnoreCase(s2);

		if (result < 0){
		System.out.println(s1 + " is less than " + s2);
		}
		else if (result > 0){
		System.out.println(s1 + " is greater than " + s2);
        }
		else 
		{
        System.out.println(s1 + " is equal than " + s2);
		}
		}
}