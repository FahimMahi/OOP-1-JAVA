import java.io.*;
	public class Cat {
	private String name;
	private String color;
	private double height;
	private double weight;

  
    public Cat(){
	System.out.println("Empty Constructor");
	}
	public Cat(String name) {
	this.name = name;
	}
   
	public void setColor(String cColor) {
	color = cColor;
	}
	public String getColor()
	{
	return color;
	}
	
	public void setHeight(double cHeight) {
    height = cHeight;
    }
	public double getHeight()
	{
	return height;
	}

	public void setWeight(double cWeight) {
    weight = cWeight;
    }
    public double getWeight()
	{
	return weight;
	}

    public void showInfo() {
	System.out.println("Cat's Info: ");
    System.out.println("Name: "+name );
	System.out.println("Color: "+color);
    System.out.println("Height: "+height+"cm");
    System.out.println("Weight: "+weight+"kg");
    }
}