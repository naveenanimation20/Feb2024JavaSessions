package OOPEncapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launching browser....");
		checkBrowserVersion();
		checkBrowserOSCompatibility();
		checkBrowserUpdates();
		checkRAMSpace();
		System.out.println(" browser is launched....");

	}
	
	private void checkBrowserVersion() {
		System.out.println("checking  browser version....");
	}
	
	private void checkBrowserOSCompatibility() {
		System.out.println(" checkBrowserOSCompatibility....");
	}
	
	private void checkBrowserUpdates() {
		System.out.println("checkBrowserUpdates....");
	}
	
	private void checkRAMSpace() {
		System.out.println("checkRAMSpace....");
	}
	
	//public click() --> private chekcing the elem--> visible() --> 
	//amazon --> public payment() ---> BankServer --> debit()
	

}
