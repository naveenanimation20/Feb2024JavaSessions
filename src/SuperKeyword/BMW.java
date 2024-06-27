package SuperKeyword;

public class BMW extends Car {

	int speed = 200;
	int price = 500;


	public BMW() {
		//super(20,30);
		System.out.println("BMW -- default const...");
		//this.drive();
	}

	public BMW(int a) {
		System.out.println("BMW -- one param const..." + a);

	}
	
	@Override
	public void loading() {
		System.out.println("BMW loading");
	}

	@Override
	public void display() {
		super.display();
		System.out.println(speed);// 200
		int carSpeed = super.speed;
		System.out.println(carSpeed);// 100
		System.out.println("BMW -- display");
		
		System.out.println(price);//500
		System.out.println(super.price);//300
		
		super.loading();
		
	}
	
	
	public void drive() {
		System.out.println(speed);//200
		System.out.println(this.speed);//200
		super.display();
		System.out.println(super.speed);//100
	}

}


//super:
//1. to call the parent class const... but should be the first statement
//2. to call parent class properties (methods/vars)









