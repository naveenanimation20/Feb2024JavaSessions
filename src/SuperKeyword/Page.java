package SuperKeyword;

public class Page {

	String name;
	String title;

	public Page() {
		this("loginpage");//1st statement
		System.out.println("default const...");

	}
	
	public Page(String name) {
		this("homepage", "amazon");
		System.out.println("1 param const...");
		System.out.println(name);
	}

	public Page(String name, String title) {
		//this();
		System.out.println("2 param const...");
		System.out.println(name);
		System.out.println(title);
	}

}

//this use cases:
//1. to init the instance vars with local vars in const
//2. used with getter/setter
//3. builder pattern: method returns this
//4. const calling within the same class





