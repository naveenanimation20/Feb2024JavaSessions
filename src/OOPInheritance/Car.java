package OOPInheritance;


//final class can not be a parent class --> preventing inheritance
public class Car extends Vehicle{
	
	int minSpeed = 100;
	
	
	//final method can not be overridden --> preventing method overridding
	public static final void testDrive() {
		System.out.println("Car - test drive");
	}	
	

	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	@Override
	public void engine() {
		System.out.println("Car -- engine");
	}
	
	
	public static void billing() {
		System.out.println("Car -- billing");
	}
	
	//private method can not be overriden
	private void service() {
		System.out.println("Car -- service");
	}
	

}

