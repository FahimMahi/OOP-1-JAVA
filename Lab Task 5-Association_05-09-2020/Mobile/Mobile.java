public class Mobile{
	private String mobileOwnerName;
	private String mobileNumber;
	private int mobileBalance;
	private String mobileOSName;
	private boolean lock;
	
	public Mobile(){}
	public Mobile(String mobileOwnerName, String mobileNumber, int mobileBalance, String mobileOSName, boolean lock){
		this.mobileOwnerName = mobileOwnerName;
		this.mobileNumber = mobileNumber;
		this.mobileBalance = mobileBalance;
		this.mobileOSName = mobileOSName;
		this.lock = lock;
	}
	public void setMobileOwnerName(String mobileOwnerName){
		this.mobileOwnerName = mobileOwnerName;
	}
	public String getMobileOwnerName(){
		return mobileOwnerName;
	}
	public void setMobileNumber(String MobileNumber){
		this.mobileNumber = mobileNumber;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public void setMobileBalance(int mobileBalance){
		this.mobileBalance = mobileBalance;
	}
	public int getMobileBalance(){
		return mobileBalance;
	}
	public void setMobileOSName(String mobileOSName){
		this.mobileOSName = mobileOSName;
	}
	public String getMobileOSName(){
		return mobileOSName;
	}
	public void setLock(boolean lock){
		this.lock = lock;
	}
	public boolean getLock(){
		return lock;
	}
	public boolean Lock(boolean l){
		if(l == lock){
			System.out.println("The phone is locked");
			return true;
		}
		else{
			System.out.println("The phone is not locked");
			return false;
		}
	}
	public void showInfo(){
		System.out.println("Mobile Owner Name: " +mobileOwnerName);
		System.out.println("Mobile Number: " +mobileNumber);
		System.out.println("Mobile Balance: " +mobileBalance);
		System.out.println("Mobile Operating System name: " +mobileOSName);
		System.out.println("Mobile's Lock Condition: " +lock);
	}
	public void recharge(int amount){
		mobileBalance += amount;
		System.out.println("Recharged BDT: " +amount);
		System.out.println("New total mobile balance: " +mobileBalance);
	}
	public void callSomeone(int timeDuration){
		mobileBalance -= timeDuration;
		System.out.println("Call charged: " +timeDuration);
		System.out.println("Total mobile balance: " +mobileBalance);
	}
}