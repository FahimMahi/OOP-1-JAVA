import java.io.*;
public class HumanInfo {
   public static void main(String []args) {
    Human h1 = new Human("Mahi"); 
    h1.setColor("White");
	h1.getColor();
    h1.setHeight(5.7);
	h1.getHeight();
    h1.setWeight(66);
	h1.getWeight();
	h1.setAge(20);
	h1.getAge();
	h1.setDateOfBirth("28/10/1999");
	h1.getDateOfBirth();
	h1.showInfo();
   }
}