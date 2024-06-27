package constructorconcept;

public class Customer {

	String name;
	int age;
	String devices[];

	public Customer(String name, int age, String[] devices) {
		this.name = name;
		this.age = age;
		this.devices = devices;
	}
	
	public String[] getDevicesInfo() {
		return devices;
	}
	
	public int getDevicesCount() {
		return devices.length;
	}
	
	

}


