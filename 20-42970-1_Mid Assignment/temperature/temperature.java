import java.util.Scanner;
public class temperature {
public static void main(String args[]) {
	int city=2;
	int week=7;
	double temperature[][]= new double[city][week];
	Scanner myObj= new Scanner(System.in);
	System.out.println("Enter the temperature of 2 city day by day of a week");
 
	for(int i = 0; i < city; ++i){
	for(int j = 0; j < week; ++j){
	System.out.print("City " +(i + 1)+  " Day " +(j + 1) );
	temperature[i][j]=myObj.nextDouble();
    }
    }
    System.out.println("Displaying Values in monitor: ");
    for(int i = 0; i < city; ++i){
    for(int j = 0; j < week; ++j){
    System.out.print("City " +(i + 1)+ " Day "+(j + 1)+  " = "  +temperature[i][j]);  
    }	
    }
}
}