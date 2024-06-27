package OOPInterface;

public interface UKEdu extends International{
	
	int min_fee = 50;

	@Override
	default void educationHelpDesk() {
		System.out.println("int -- educationHelpDesk");
	}
	
	
}
