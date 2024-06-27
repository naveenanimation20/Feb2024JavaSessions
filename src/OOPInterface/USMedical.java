package OOPInterface;

public interface USMedical extends WHO, UN{
	
	
	int MIN_FEE = 10;
	//interface variables are static and final by default
	
	
	//interface methods can not have method body
	//abstract method: no method body
	//can not create the object of interface
	//abs... methods can not be static, final, private
	//const... is not allowed
	
	//abstraction: abstract class
	
	public void physioServices();
	
	public void physioServices(int a);
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
	public void ENTServices();
	
	public int testing(int a);

	
	//after JDK 1.8:
	//1. can have a static method with method body: can not be overridden
	public static void billing() {
		System.out.println("US -- billing");
	}
	
	public static void billing(int a) {
		System.out.println("US -- billing");
	}
	
	
	//2. can have default method with method body: non static
	//it can be overridden
	default void helpDesk() {
		System.out.println("US -- helpDesk");
	}
	
	default void helpDesk(int a) {
		System.out.println("US -- helpDesk");
	}
	
}
