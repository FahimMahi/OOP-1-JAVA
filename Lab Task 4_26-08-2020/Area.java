class Shape { 
	public String color;
	double area(){
		return 0;
	}
} 
class Circle extends Shape{ 
	public double radius; 
	Circle(){}
	public Circle(double radius) { 
		this.radius = radius; 
	} 
	public double area() { 
		return 3.1416*radius*radius;
	}
} 
class Rectangle extends Shape{ 
	public double length; 
	public double width; 
	Rectangle(){}
	public Rectangle(double length,double width) { 
		this.length = length; 
		this.width = width; 
	} 
    public double area() { 
		return length*width; 
		
    } 
} 
class Triangle extends Shape{ 
    public double base; 
    public double height; 
	Triangle(){}
    public Triangle(double base,double height) { 
        this.base = base; 
        this.height = height; 
    } 
    public double area() { 
        return 0.5*base*height; 
    } 
} 
public class Area { 
    public static void main(String args[]){ 
        Shape c = new Circle(5); 
        Shape r = new Rectangle(10,20); 
		Shape t = new Triangle (12,13);
		System.out.println("Rectangle's Area : "+r.area());
		System.out.println("Triangle's Area : "+t.area());
		System.out.println("Circle's Area : "+c.area());
    } 
} 