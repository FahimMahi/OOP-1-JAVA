public class Account{
	private String accName;
	private String acid;
	private int balance;
	
	public Account(){}
	public Account(String accName, String acid, int balance){
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}
	public void setAccName(String accName){
		this.accName = accName;
	}
	public String getAccName(){
		return accName;
	}
	public void setAcid(String acid){
		this.acid = acid;
	}
	public String getAcid(){
		return acid;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}
	public int getBalance(){
		return balance;
	}
	public void deposite(int amount){
		balance += amount;
		System.out.println("You Deposited Balance in BDT: " +amount);
		System.out.println("Your New Balance In BDT: " +balance);
	}
	public void withdraw(int amount){
		if(balance >= amount + 500){
			balance -= amount;
			System.out.println("You have withdrawn BDT: " +amount);
			System.out.println("Your new balance is BDT: " +balance);
		}
		else{
			System.out.println("Sorry. You do not have enough money.");
		}
	}
	public void showInfo(){
		System.out.println("Account Name: " +accName);
		System.out.println("Account ID: " +acid);
		System.out.println("Account Balance BDT: " +balance);
	}
}