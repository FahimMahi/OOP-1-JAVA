import java.io.*;
public class DuckInfo {
    public static void main(String []args) {
    Duck d1 = new Duck("Paw"); 
    d1.setColor("White");
	d1.getColor();
    d1.setHeight(60);
	d1.getHeight();
    d1.setWeight(0.8);
	d1.getWeight();
	d1.showInfo();
    }
}