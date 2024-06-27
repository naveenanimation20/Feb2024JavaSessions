package constructorconcept;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car("x1", 40, "BMW");
		System.out.println(c1.name  + " "  + c1.brand  + " "  + c1.color + " "  + c1.licenseNumber + " "  + c1.price);
		
		Car c2 = new Car("A6", 60, "6789", "Audi");
		System.out.println(c2.name  + " "  + c2.brand  + " "  + c2.color + " "  + c2.licenseNumber + " "  + c2.price);
		c2.color = "White";
		System.out.println(c2.name  + " "  + c2.brand  + " "  + c2.color + " "  + c2.licenseNumber + " "  + c2.price);

		Car c3 = new Car("civic", 20, "Red", "98989", "Honda");
		System.out.println(c3.name  + " "  + c3.brand  + " "  + c3.color + " "  + c3.licenseNumber + " "  + c3.price);

		c3.price = 24;
		System.out.println(c3.name  + " "  + c3.brand  + " "  + c3.color + " "  + c3.licenseNumber + " "  + c3.price);

		

	}

}
