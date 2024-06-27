package OOPInterface;

public interface International {
	
	
	int min_fee = 10;
	
	default void educationHelpDesk() {
		System.out.println("int -- educationHelpDesk");
	}
	
	default void testing() {
		System.out.println("int -- testing");
	}
	

}
