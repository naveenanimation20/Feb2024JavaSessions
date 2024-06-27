package OOPAbstract;

public class LoginPage extends Page {
	
	int timeOut = 5;
	
	public LoginPage() {
		System.out.println("LP -- default const...");
	}
	
	public LoginPage(int a) {
		System.out.println("LP -- one param const..." + a);
	}
	
	public LoginPage(int a, int b) {
		System.out.println("LP -- two param const..." + a + b);
	}
	
	

	@Override
	public void title() {
		System.out.println("LP -- title");
	}

	@Override
	public void url() {
		System.out.println("LP -- url");

	}

	public void doLogin(String un, String pwd) {
		System.out.println("user is logged with : " + un + pwd);
	}

}

