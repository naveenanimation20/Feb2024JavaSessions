package OOPAbstract;

public abstract class Page {
	
	//can not create the object of abstract class
	
	
	//can we have the const... of abstract class?? YES
	//this will be called when you create the object of its child class
	
	//can have abstract + non abstract methods

	//only abstract methods: 100% abstraction
	//only non abstract methods: 0% abstraction
	//abs + non abs methods: partial abstraction [0-100%]
	
	
	static final int TIME_OUT = 10;
	
	public Page() {
		System.out.println("Page -- default const...");
	}
	
	public Page(int a) {
		System.out.println("Page -- one param const..." + a);
	}
	
	public Page(int a, int b) {
		System.out.println("Page -- two param const..." + a + b );
	}
	
	
	public abstract void title();
	public abstract void url();

	
	public static final void displayLogo() {
		System.out.println("Page -- display logo");
	}
	
	public void getPageInfo() {
		System.out.println("Page -- getPageInfo");
	}
	
	
	private void billing() {
		System.out.println("Page -- billing");
	}
	
	public void getBillingInfo() {
		billing();
	}
	
	
	
	

}
