public class Building
{
	private String name;
    private String address;
    private double size;
    private String ownerName;
    private String engineerName;
    private String permitNo;
    private String licenseNo;

    public Building()
    {
    System.out.println("Empty Constructor");
    }
	
    public Building(String name) 
    {
    this.name = name;
    }
	
    public void Address(String Address) 
    {
    this.address = Address;
    }
	
    public void Size(double Size)
    {
    this.size = Size;
    }
	
    public void OwnerName(String OwnerName) 
    {
    this.ownerName = OwnerName;
    }
	
    public void EngineerName(String EngineerName)
    {
    this.engineerName = EngineerName;
    }
	
    public void PermitNo(String PermitNo) 
    {
    this.permitNo = PermitNo;
    }
	
    public void LicenseNo(String LicenseNo) 
    {
    this.licenseNo = LicenseNo;
    }

    public void ShowInfo() {
    System.out.println("Building's Name: "+name );
    System.out.println("Address: "+address);
    System.out.println("Size: "+size+" "+"acre" );
    System.out.println("Owner Name: "+ownerName);
    System.out.println("Permit No: "+permitNo);
    System.out.println("License No: "+licenseNo);
    }
}