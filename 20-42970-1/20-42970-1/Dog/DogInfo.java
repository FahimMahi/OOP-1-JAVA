import java.io.*;
public class DogInfo {
    public static void main(String []args) {
    Dog d1 = new Dog("Paw"); 
    d1.setColor("White");
	d1.getColor();
    d1.setHeight(32);
	d1.getHeight();
    d1.setWeight(9.2);
	d1.getWeight();
	d1.showInfo();
    }
}