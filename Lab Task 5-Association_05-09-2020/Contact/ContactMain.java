public class ContactMain{
	public static void main(String[] args){
		Contact con1 = new Contact ("Fahim", "10",20,"+8801811112222",'M');
		Contact con2 = new Contact ("Mahi", "11", 20,"+8801911111222",'F');
        con1.showInfo();
		con2.showInfo();
	}
}