package constructorconcept;

public class Registration {
	String name;
	String emailId;
	String phone;
	int age;
	String city;
	String dob;
	static String compName = "IBM";	//class static 

	// hidden - default cost.. will be added by Java

	public Registration(String name, String emailId) {
		this.name = name;
		this.emailId = emailId;
		
	}
	

	public Registration(String name, String emailId, String phone) {
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
	}

	public Registration(String name, String emailId, String phone, int age, String city) {
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.age = age;
		this.city = city;
	}

	public Registration(String name, String emailId, String phone, int age, String city, String dob) {
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.age = age;
		this.city = city;
		this.dob = dob;
	}

	public static void main(String[] args) {
		
		Registration r1 = new Registration("naveen", "naveen@gmail.com");
		System.out.println(r1.name + " " + r1.age + " "  + r1.emailId + " "  + r1.city + " "  + r1.dob + " "  + r1.phone);
		
		//Registration r2 = new Registration("Akansha", "Akansha@gmail.com", "98765432123", 30, "Bangalore", "01-09-2003");
		
		Registration r2 = new Registration("Akansha", "Akansha@gmail.com", null, 30, "Bangalore", null);
		System.out.println(r2.name + " " + r2.age + " "  + r2.emailId + " "  + r2.city + " "  + r2.dob + " "  + r2.phone);
		r2.phone = "98765432345";
		System.out.println(r2.name + " " + r2.age + " "  + r2.emailId + " "  + r2.city + " "  + r2.dob + " "  + r2.phone);

		r2.emailId = "ak@yahoo.com";
		System.out.println(r2.name + " " + r2.age + " "  + r2.emailId + " "  + r2.city + " "  + r2.dob + " "  + r2.phone);


	}
	

	
	
}
