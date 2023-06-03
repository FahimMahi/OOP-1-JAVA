import java.util.Scanner;
public class Digit {
 public static void main(String args[]){
	Scanner myObj = new Scanner(System.in);  
    System.out.print("Enter string");
	String str= myObj.nextLine();
	count(str);
}
	public static void count(String x){
		char[]ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println("String : " + x);
		System.out.println("Letter: " + letter);
		System.out.println("Number: " + num);
		System.out.println("Other Character: " + other);
		System.out.println("Space: " + space);
	}
}