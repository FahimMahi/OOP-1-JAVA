public class AccountMain{
	public static void main(String[] args){
		Account a1 = new Account ("Fahim", "18-55042-2", 50000);
		Account a2 = new Account ("Mahi", "20-41521-1", 80000);
		a1.showInfo();
		a1.deposite(50000);
		a1.withdraw(600);
		a1.showInfo();
		a2.showInfo();
		a2.deposite(60000);
		a2.withdraw(12000);
		a2.showInfo();
	}
}