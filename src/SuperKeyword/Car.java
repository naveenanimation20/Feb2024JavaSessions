package SuperKeyword;

public class Car extends Vehicle{
	
	int speed = 100;
	int price = 300;

	
	public Car() {
		super("MG");
		System.out.println("Car -- default const...");
	}

	public Car(int a) {
		System.out.println("Car -- one param const..." + a);

	}
	
	public Car(int a, int b) {
		System.out.println("Car -- two param const..." + a+b);

	}
	
	
	public void display() {
		System.out.println("car -- display");
	}
	
	@Override
	public void loading() {
		System.out.println("CAR loading");
		super.loading();
	}
	
	

}
