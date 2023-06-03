import java.io.*;
	public class Duck {
	private String name;
	private String color;
	private double height;
	private double weight;

  
    public Duck(){
	System.out.println("Empty Constructor");
	}
	public Duck(String name) {
	this.name = name;
	}
   
	public void setColor(String dColor) {
	color = dColor;
	}
	public String getColor()
	{
	return color;
	}
	
	public void setHeight(double dHeight) {
    height = dHeight;
    }
	public double getHeight()
	{
	return height;
	}

	public void setWeight(double dWeight) {
    weight = dWeight;
    }
    public double getWeight()
	{
	return weight;
	}

    public void showInfo() {
	System.out.println("Duck's Info: ");
    System.out.println("Name: "+name );
	System.out.println("Color: "+color);
    System.out.println("Height: "+height+"cm");
    System.out.println("Weight: "+weight+"kg");
    }
}