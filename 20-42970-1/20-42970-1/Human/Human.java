import java.io.*;
	public class Human {
	private String name;
	private String color;
	private double height;
	private double weight;
	private double age ;
	private String dateOfBirth;

  
   public Human(){
	   System.out.println("Empty Constructor");
   }
   public Human(String name) {
      this.name = name;
   }
   
      public void setColor(String hColor) {
      color = hColor;
   }
   public String getColor()
	{
	return color;
	}
	
	public void setHeight(double hHeight) {
    height = hHeight;
    }
	public double getHeight()
	{
	return height;
	}

	public void setWeight(double hWeight) {
    weight = hWeight;
    }
    public double getWeight()
	{
	return weight;
	}
    
	public void setAge(double hAge) {
    age = hAge;
    } 
    public double getAge()
	{
	return age;
	}

    
    public void setDateOfBirth(String hDateOfBirth) {
    dateOfBirth = hDateOfBirth;
    }
    public String getDateOfBirth()
	{
	return dateOfBirth;
	}

   

    public void showInfo() {
	System.out.println("Human's Info: ");
    System.out.println("Name: "+name );
	System.out.println("Color: "+color);
    System.out.println("Height: "+height+"ft");
    System.out.println("Weight: "+weight+"kg");
	System.out.println("Age: "+age );
	System.out.println("Date of Birth: "+dateOfBirth);
    }
}