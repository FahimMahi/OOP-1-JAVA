class Shape{
	int a;
	int b;
	public void calculateArea(){
		System.out.println("Empty Constructor");
	}
}
class Triangle extends Shape {
	void setA(int a){
    this.a = a;
	}
	void setB(int b){
	this.b = b;
	}
	public void calculateArea() {
		double area=0.5*(a*b);
		System.out.println("Triangle's Area is "+area);
	}
}
class Rectangle extends Shape{
	void setA(int a){
	this.a = a;
	}
	void setB(int b){
	this.b = b;
	}
	public void calculateArea(){
		double area=(a*b);
		System.out.println("Rectangle's Area is "+area);
	}
}
class Square extends Rectangle {
	public void calculateArea(){
		double area=(a*a);
		System.out.println("Square's Area is "+area);
	}
}
class Circle extends Rectangle{
	public void calculateArea(){
		double area=3.1416*(a*a);
		System.out.println("Circle's Area is "+area);
	}
}
