public class Product
{
	private String productName;
	private int productQty;
	private double productPrice;

	public Product()
	{
		System.out.println("Empty Constructor");
	}
	public Product(String productName)
	{
		this.productName = productName;
	}
		
    public void productQty(int productQty) 
    {
		this.productQty = productQty;
    }
	
    public void productPrice(double productPrice)
    {
		this.productPrice = productPrice;
    }
	
	public double calculate()
	{
		double totalValue;
		totalValue = productQty*productPrice;
		return totalValue;
	}
	public void showInfo()
	{
		System.out.println("Product Name: "+productName);
		System.out.println("Product Quantity: "+productQty);
		System.out.println("Per Product's Price: "+productPrice);
		System.out.println("Product's Total Price: "+calculate());
	}	
}