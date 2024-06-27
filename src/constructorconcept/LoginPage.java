package constructorconcept;

public class LoginPage {

	String userName;
	String password;
	int age;

//	public LoginPage(String userName, String password) {
//		this.userName = userName;
//		this.password = password;
//		
//	}
	
	public void login(String username, String password) {
		System.out.println("enter username: " + userName);
		System.out.println("enter password: " + password);
		System.out.println("click on login button");
		System.out.println("login is done....");
	}
	
	public LoginPage(int age) {
		this.age = age;
	}
	
	

	public static void main(String[] args) {
		
		
		LoginPage lp1 = new LoginPage(40);
		lp1.age = 45;
		System.out.println(lp1.age);
		
		//LoginPage lp2 = new LoginPage(30);
		

		
//		
//		
//		lp1.userName = "deepak";
//		lp1.password = "deepak@123";
//		
//		lp1.login(lp1.userName, lp1.password);
		
		
		

//		LoginPage lp1 = new LoginPage("deepak", "deepak123");//reg process
//		lp1.login();//login func
//		
//		LoginPage lp2 = new LoginPage("ravi", "ravi234");
//		lp2.login();
		

	}

}




