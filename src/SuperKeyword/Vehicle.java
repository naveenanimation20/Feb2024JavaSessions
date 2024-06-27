package SuperKeyword;

public class Vehicle {
	
	int price = 900;
	
	
	public Vehicle() {
		System.out.println("vehicle --  default const...");
	}
	
	
	public Vehicle(String name) {
		System.out.println("vehicle --  const..." + name);
	}
	
	
	public void loading() {
		System.out.println("vehicle loading");
	}
	

}
