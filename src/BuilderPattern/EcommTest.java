package BuilderPattern;

public class EcommTest {

	public static void main(String[] args) {

		Ecommerce obj = new Ecommerce();
		
		obj.login("naveen", "naveen123")
					.search("Apple Macbook Pro")
						.addToCart("Apple Macbook Pro")
							.payment("1212 2121 2122 3333", 333)
								.generateOrder()
									.logout();
		
		System.out.println(obj.orderId);
		
		
		System.out.println("-------");
		
		//
		obj.login("naveen", "naveen123")
			.search("Nike Shoes", 5000)
				.logout();

		System.out.println("-------");

		obj.login("naveen", "naveen123")
				.search("TV", 10000)
						.search("Keyboard")
								.search("Bottle")
									.addToCart("TV")
											.payment("naveen@hdfc")
													.generateOrder()
														.logout();
		
		System.out.println("-------");
		obj.login("ekta", "ekta234")
			.logout();

		System.out.println("-------");
		obj.login("ekta", "ekta234");
		
		System.out.println("-------");
		obj.search("Apple Macbook Pro")
			.addToCart("Apple Macbook Pro")
				.payment("1212 2121 2122 3333", 333)
					.generateOrder()
						.logout();
		

		
	}

}
