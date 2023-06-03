import java.util.Scanner;
class main{
public static void main(String args[]){
    customer pro=new customer(98, 120.65, 2,0.02,0.25);
	pro.calculateTax();
	pro.calculateDiscount();
	pro.totalPrice();
	pro.showInfo();
}
}