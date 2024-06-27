package BuilderPattern;


public class Ecommerce {
	
	int orderId;

	public Ecommerce login() {
		System.out.println("user logged in");
		return this;
	}

	public Ecommerce login(String username, String password) {
		System.out.println("user logged in with : " + username + " " + password);		
		return this;
	} 

	public Ecommerce search() {
		System.out.println("search with default products");
		return this;
	}

	public Ecommerce search(String productName) {
		System.out.println("search with product " + productName);
		return this;

	}

	public Ecommerce search(String productName, int price) {
		System.out.println("search with product " + productName + " price " + price);
		return this;

	}

	public Ecommerce addToCart(String productName) {
		System.out.println("add to cart : " + productName);
		return this;

	}

	public Ecommerce payment(String upi) {
		System.out.println("make payment via upi : " + upi);
		return this;

	}

	public Ecommerce payment(String cc, int cvv) {
		System.out.println("make payment via CC : " + cc + " " + cvv);
		return this;

	}

	public Ecommerce generateOrder() {
		System.out.println("your order id is : " + 12345);
		this.orderId = 12345;
		return this;

	}

	public Ecommerce logout() {
		System.out.println("user is logged out...");
		return this;

	}

}
