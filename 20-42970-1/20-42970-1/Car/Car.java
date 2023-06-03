public class Car 
{
    private String name;
    private String color;
    private String model;
    private double yearOfUse;
    private String ownerName ;

    public Car()
    {
    System.out.println("Empty Constructor");
    }

  
    public Car(String name) 
    {
    this.name = name;
    }
    public void Color(String Color) 
    {
    this.color = Color;
    }
    public void Model(String Model) {
    this.model = Model;
    }
    public void YearOfUse(double YearOfUse) {
    this.yearOfUse = YearOfUse;
    }
    public void OwnerName(String OwnerName) {
    this.ownerName = OwnerName;
    }


   
	public void ShowInfo() {
	System.out.println("Car's Name: "+name );
	System.out.println("Car's Color: "+color);
	System.out.println("Car's Model: "+model );
	System.out.println("Year Of Use: "+yearOfUse);
	System.out.println("Owner: "+ownerName);
	}
}