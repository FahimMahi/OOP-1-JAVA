public class Contact{
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender;
	
	public Contact(){}
	public Contact(String personName, String personId, int age, String mobileNumber,char Gender){
		this.personName = personName;
		this.personId = personId;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}
	public void setPersonName(String personName){
		this.personName = personName;
	}
	public String getPersonName(){
		return personName;
	}
	public void setPersonId(String personId){
		this.personId = personId;
	}
	public String getPersonID(){
		return personId;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber = mobileNumber;
	}
	public String getMobileNumber(){
		return mobileNumber;
	}
	public void setGender(char gender){
		this.gender= gender;
	}
	public char getGender(){
		return gender;
	}
	public void showInfo(){
		System.out.println("Person's Name: " +personName);
		System.out.println("Person's Id: " +personId);
		System.out.println("Person's Age: " +age);
		System.out.println("Person's Mobile Number: " +mobileNumber);
		System.out.println("Person's Gender: " +gender);
	}
}