package javasessions;

public class Customer {

	// method overloading: OOP -> Poly(many)+Morphism(forms): compile time (static)
	// when in the same class, we have methods:
	// 1. with the same name
	// 2. with different number of params
	// 3. with different sequence of params
	// 4. return type doesnt matter

	public void test() {// 0 param
		System.out.println("test method");
	}

	public void test(int a) {// 1 param
		System.out.println("test method " + a);
	}

	public void test(int a, int b) {// 2 params
		System.out.println("test method " + a + b);
	}

	public void test(int a, String b) {// 2 params
		System.out.println("test method " + a + b);
	}

	public void test(String a, int b) {// 2 params
		System.out.println("test method " + a + b);
	}

	public void test(String a, int b, float f) {// 3 params
		System.out.println("test method " + (a + b + f));
	}

	public void test(float a, int b, String f) {// 3 params
		System.out.println("test method " + a + b);
	}

	// amazon:
	public void search() {
		System.out.println("default search");
	}

	public void search(String name) {
		System.out.println(" search with " + name);
	}

	public void search(String name, int price) {

	}

	public void search(String name, int price, String color) {

	}

	// payment:
	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv) {

	}

	public void doPayment(String cc, int cvv, int otp) {

	}

	public void doPayment(String paypalId, int otp, String pwd) {

	}

	// uber:
	public void booking(String st, String end) {

	}

	public void booking(String st, String end, String carType) {

	}

	public void booking(String st, String end, String carType, int persons) {

	}

	// Login:
	public void doLogin() {

	}

	public boolean doLogin(String un, String pwd) {
		return true;
	}
	
	
	public int doLogin(String un, String pwd, String role) {
		return 100;
	}
	
	public String doLogin(String socialMediaAccount, String pwd, int otp) {
		return "test";
	}
	
	public String doLogin(int t, String a, String b) {
		return "test";
	}

	public static void main(String[] args) {

		Customer obj = new Customer();
		obj.test();
		obj.test(10);//value/argument
		obj.test(10, 20);
		obj.test("testing", 10, 12.33f);
		
		//calling a method by passing a value/argument: call by value
		
	}

}
