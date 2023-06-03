import java.util.Scanner;
public class DriveHistory {
    public static void main(String []args) {
        DriveHistory s = new DriveHistory();
        s.trip();
    }
    public void trip() {
        double gallons;
        double miles;
        double milespergallon;
        System.out.print("Enter used gallon  ");
        Scanner g = new Scanner(System.in);
        gallons = g.nextDouble();

    while (gallons != 0) {
        System.out.print("Enter recording miles driven  ");
        miles = g.nextDouble();
		milespergallon = miles/gallons;
        System.out.println("Displaying Miles Per Gallon  " +milespergallon);
        }
    }
}