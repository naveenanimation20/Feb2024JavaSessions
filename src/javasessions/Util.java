package javasessions;

public class Util {

	String name;
	int age;
	static final String compName = "Google";

	public void getInfo() {
		System.out.println("get info");
	}

	public static void sendMail() {
		System.out.println("send mail");
	}

	public static void main(String[] args) {

		Util u = new Util();
		//how to access non static var and method:
		u.name = "Ekta";
		u.age = 35;
		u.getInfo();
		
		//how to access static var and method:
		//using class name:
		System.out.println(Util.compName);
		Util.sendMail();
		
		//access directly:
		System.out.println(compName);
		sendMail();
		
		
	}

}
