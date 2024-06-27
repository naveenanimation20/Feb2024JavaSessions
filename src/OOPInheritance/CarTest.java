package OOPInheritance;

public class CarTest {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();//overridden
		BMW.billing();//child class name can access parent class static method
		Car.billing();
		b.BMWService();
	
		System.out.println(b.minSpeed);//200
		
		System.out.println("-----");
		
		Audi au = new Audi();
		au.start();//inherited
		au.stop();//inherited
		au.refuel();//inherited
		au.engine();//inherited
		au.theftSafety();//individual
		
		
		System.out.println("-----");

		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//System.out.println(c.minSpeed);
		
		System.out.println("-----");

		//child class object can be referred by parent class ref variable
		//Top Casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		c1.drive();
		
		
		
		
		System.out.println("-----");
		//child class object can be referred by grand parent class ref variable

		Vehicle v1 = new BMW();
		v1.engine();
		v1.drive();

		//down casting:
		//BMW b1 = (BMW)new Car();//class cast exception
		//BMW b1 = (BMW)new Vehicle();//ClassCastException
		//Car c2 = (Car)new Vehicle();//ClassCastException
		
		
		//
		Truck tr = new Truck();
		tr.engine();
		tr.drive();
		tr.heavyLoading();
	
		
		//final:
		//1. constants
		//2. final class
		//3. final method
		
		
		
		
		
		
	}

}
