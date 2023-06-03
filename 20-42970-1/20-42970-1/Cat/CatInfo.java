import java.io.*;
public class CatInfo {
   public static void main(String []args) {
    Cat c1 = new Cat("Paw"); 
    c1.setColor("White");
	c1.getColor();
    c1.setHeight(25);
	c1.getHeight();
    c1.setWeight(3.8);
	c1.getWeight();
	c1.showInfo();
   }
}