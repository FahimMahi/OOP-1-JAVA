public class Triangle
{
	private int x;
	private int y;
	private int z;
	public Triangle()
	{
		System.out.println("Empty Constructor");
	}
	public Triangle(int x)
	{
		this.x = x;
	}
	
	    public void y(int y) 
    {
		this.y = y;
    }
	
    public void z(int z)
    {
		this.z = z;
    }
	
	public void testTriangle()
	{
		if(x==y&&y==z)
			System.out.println("This Triangle is Equilateral.");
		else if(x==y||x==z||y==z)
			System.out.println("This Triangle is Isosceles.");
		else
			System.out.println("This Triangle is Scalene.");
	}
  public void showInfo()
    {
	   System.out.println("X: "+x);
	   System.out.println("Y: "+y);
	   System.out.println("Z: "+z);
	   testTriangle();
    }	
	
}