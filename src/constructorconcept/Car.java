package constructorconcept;

public class Car {

	String name;
	int price;
	String color;
	String licenseNumber;
	String brand;

	public Car(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	public Car(String name, String brand) {
		this.name = name;
		this.brand = brand;
	}

	public Car(String name, int price, String licenseNumber, String brand) {
		this.name = name;
		this.price = price;
		this.licenseNumber = licenseNumber;
		this.brand = brand;
	}

	public Car(String name, int price, String color, String licenseNumber, String brand) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.brand = brand;
	}

}
