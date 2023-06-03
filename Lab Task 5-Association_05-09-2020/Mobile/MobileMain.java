public class MobileMain{
	public static void main(String[] args){
		Mobile mob1 = new Mobile("Fahim", "+8801811112222", 40, "Android", false);
		Mobile mob2 = new Mobile("Mahi", "+8801911112222", 80, "IOS", true);
		mob1.showInfo();
		mob1.recharge(50);
		mob1.callSomeone(40);
		mob2.showInfo();
		mob2.recharge(10);
		mob2.callSomeone(80);
	}
}