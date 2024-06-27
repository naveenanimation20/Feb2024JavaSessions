package OOPInheritance;

//BMW -- sub class/child class
//Car -- super class/parent class
public class BMW extends Car {
	
	
	int minSpeed = 200;

	
	//method overriding: poly+morphism: RunTime (Dynamic)
	//when we have a method in parent class and the same method in child class with:
	//1. with the same name
	//2. with same number of parameters with the same sequence
	//3. with the same return type
	
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}

	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
	//Method Hiding --> static method in parent class and the same static method in child class
	public static void billing() {
		System.out.println("BMW -- billing");
	}
	
	//not overridden
	private void service() {
		System.out.println("BMW -- service");
	}
	
	public void BMWService() {
		service();
	}
}


