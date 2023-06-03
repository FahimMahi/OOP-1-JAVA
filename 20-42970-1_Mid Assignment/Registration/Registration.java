import java.util.Scanner;
public class Registration{
public static void main(String args[]){
	System.out.println("Kuratoli Software Solutions");
	System.out.println("List Of your eligible Courses ");
	System.out.println("English 1 = 789");
	System.out.println("English 2 = 795");
	System.out.println("Diff Calculas = 315");
	System.out.println("Integral = 348");
	System.out.println("Physics 1 = 911");
	System.out.println("Physics 2 = 931");
	System.out.println("Java = 169");
	System.out.println("Discrete Math = 98");
	
	String y[]=new String [5];
	int x[]=new int [5];
	Scanner c = new Scanner(System.in);
	for(int i=0;i<5;i++){
		System.out.print("Enter course code: ");
		x[i] = c.nextInt();
		
	if(x[i]==789){
		y[i]= "English 1";
		System.out.println(y[i]);
	}
	else if(x[i]==795){
		y[i]= "English 2";
		System.out.println(y[i]);
	}
	else if(x[i]==315){
		y[i]= "Diff Calculas ";
		System.out.println(y[i]);
	}
	else if(x[i]==348){
		y[i]= "Integral";
		System.out.println(y[i]);
	}
	else if(x[i]==911){
		y[i]= "Physics 1";
		System.out.println(y[i]);
	}
	else if(x[i]==931){
		y[i]= "Physics 2";
		System.out.println(y[i]);
	}
	else if(x[i]==169){
		y[i]= "Java";
		System.out.println(y[i]);
	}
	else if(x[i]==98){
		y[i]= "Discrete Math";
		System.out.println(y[i]);
	}
	else{
		System.out.println("Invalid");
	}
}
	System.out.println("List of your courses ");
	for(int i=0;i<5;i++){
	System.out.println(y[i]+": "+x[i]);
	}
} 
}