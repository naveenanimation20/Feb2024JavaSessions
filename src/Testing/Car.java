package Testing;

public class Car {

	String brand;
	String model;
	int year;

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "Toyota";
		car1.model = "Camry";
		car1.year = 2020;

		Car car2 = new Car();
		car2.brand = "Honda";
		car2.model = "Accord";
		car2.year = 2019;

		Car car3 = new Car();
		car3.brand = "Ford";
		car3.model = "Fusion";
		car3.year = 2018;

		Car car4 = new Car();
		car4.brand = "Audi";
		car4.model = "A6";
		car4.year = 2022;

		System.out.println("Original values:");
		System.out.println(car1.brand + " " + car1.model + " " + car1.year);
		System.out.println(car2.brand + " " + car2.model + " " + car2.year);
		System.out.println(car3.brand + " " + car3.model + " " + car3.year);
		System.out.println(car4.brand + " " + car4.model + " " + car4.year);

		System.out.println("----------");

		car1 = car2;
		System.out.println(car1.brand + " " + car1.model + " " + car1.year);
		System.out.println(car2.brand + " " + car2.model + " " + car2.year);
		System.out.println(car3.brand + " " + car3.model + " " + car3.year);
		System.out.println(car4.brand + " " + car4.model + " " + car4.year);
		System.out.println("----------");

		car2 = car3;
		System.out.println(car1.brand + " " + car1.model + " " + car1.year);
		System.out.println(car2.brand + " " + car2.model + " " + car2.year);
		System.out.println(car3.brand + " " + car3.model + " " + car3.year);
		System.out.println(car4.brand + " " + car4.model + " " + car4.year);
		System.out.println("----------");
		
		car3 = car4;
		System.out.println(car1.brand + " " + car1.model + " " + car1.year);
		System.out.println(car2.brand + " " + car2.model + " " + car2.year);
		System.out.println(car3.brand + " " + car3.model + " " + car3.year);
		System.out.println(car4.brand + " " + car4.model + " " + car4.year);
		System.out.println("----------");

		
		car4=car1;
		System.out.println(car1.brand + " " + car1.model + " " + car1.year);
		System.out.println(car2.brand + " " + car2.model + " " + car2.year);
		System.out.println(car3.brand + " " + car3.model + " " + car3.year);
		System.out.println(car4.brand + " " + car4.model + " " + car4.year);
		System.out.println("----------");
		
		

		

	}
}
