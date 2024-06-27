package OOPAbstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10, 20);
		lp.title();
		lp.url();
		Page.displayLogo();
		LoginPage.displayLogo();
		lp.getPageInfo();
		lp.doLogin("admin", "admin");
		System.out.println(lp.timeOut);
		
		System.out.println(Page.TIME_OUT);
		System.out.println(LoginPage.TIME_OUT);
		
		lp.getBillingInfo();
		
		//top casting:
		//child class object can be referred by parent abstract class ref variable
//		Page p = new LoginPage();
//		
//		p.title();
//		p.url();
//		p.getPageInfo();
		
		//down casting: not applicable
		
		
		
		
	}

}
