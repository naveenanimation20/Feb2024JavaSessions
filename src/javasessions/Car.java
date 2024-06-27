package javasessions;

public class Car {

	// instance var/object var
	String name;
	String licenseNumber;
	int price;

	// static var: class var
	static final int wheels = 4;//
	static final int specialwheels = 8;//

	// instance vars: n copies
	// static var: 1 common copy will be created---> CMA
	

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "Honda";
		c1.licenseNumber = "12121";
		c1.price = 20;
		c1.name = "Hyundai";

		Car c2 = new Car();
		c2.name = "BMW";
		c2.licenseNumber = "17721";
		c2.price = 50;

		Car c3 = new Car();
		c3.name = "Audi";
		c3.licenseNumber = "19021";
		c3.price = 60;

		System.out.println(c3.name + " " + c3.licenseNumber + " " + c3.price + " " + Car.wheels);

		// how to access static variable?
		// 1. by using class name:
		System.out.println(Car.wheels);

		// 2. direct calling:
		System.out.println(wheels);

		// 3. using obj reference name:
		System.out.println(c1.wheels);// not recommeded

		// final local var
		final int days = 7;
		int salary = days * 100;
		System.out.println(salary);

		// no ref object
		new Car();

		// null ref object
		Car c4 = new Car();
		c4 = null;

		System.gc();// it does not give any gurantee that GC will be called

	}

}
