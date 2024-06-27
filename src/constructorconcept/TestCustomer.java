package constructorconcept;

import java.util.Arrays;

import javasessions.Page;

public class TestCustomer {

	public static void main(String[] args) {

		String d[] = {"Macbook Pro", "iPhone 14", "Keyboard"};
		Customer obj = new Customer("Rahul", 30, d);
		
		String rahulDev[] = obj.getDevicesInfo();
		System.out.println(Arrays.toString(rahulDev));
		
		int count = obj.getDevicesCount();
		System.out.println(count);
		
		//Browser br = new Browser("chrome");
		Browser.get();
		Browser.close();
		
//		Page pg = new Page();
//		System.out.println(pg.age);
		
		System.out.println(Page.age);
		
	}

}
