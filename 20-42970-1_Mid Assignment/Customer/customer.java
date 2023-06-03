import java.util.Scanner;
class customer extends product {
	customer(long a,double b,int c,double d,double e){
    super(a,b,c,d,e); 
	}
	public double calculateTax(){
	double d;
	d=price*tax;
	return (price+d);
	}
	public double calculateDiscount(){
	double e;
	e= price*discount;
	return (e);	
	}
	double a=calculateTax();
	double b=calculateDiscount();
	
	public double totalPrice(){
	double t;
	t=(a-b)*quantity;
	return (t);	
	}
  
	public void showInfo(){
	System.out.println("Prouduct number is "+productno);  
	System.out.println("Tax is "+calculateTax());
	System.out.println("Discount is "+calculateDiscount());
	System.out.println("Total price is "+totalPrice());
  }
}