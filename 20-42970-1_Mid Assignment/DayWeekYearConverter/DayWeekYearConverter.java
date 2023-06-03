import java.util.Scanner;
public class DayWeekYearConverter{
    public static void main(String []args){
        int m, y, w, d;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Days:");
        m = s.nextInt();
		d = m;
        System.out.println("Days:"+d);
        w = m / 7;
        m = m % 7;
        System.out.println("Weeks:"+w);
		y = m / 365;
        m = m % 365;
        System.out.println("Years:"+y); 
    }
}