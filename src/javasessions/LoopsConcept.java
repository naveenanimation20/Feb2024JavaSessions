package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {

		
		//1. while loop:
		//1 to 10:

		int i = 1;
		while(i<=10) {
			System.out.println(i);//1
				if(i==5) {
					System.out.println("bye");
					break;
					//i++;
				}
				i++;//23456

			//++i;
			//i=i+1;
		}
		
//		while(true) {
//			System.out.println("welcome to Hotel Taj");
//		}
		
		System.out.println("------------");
		//10 to 1:
		int t = 10;
		while(t<=1) {
			System.out.println(t);//109876...1
			t--;
			//--t;
		}
		
		
		System.out.println("------------");
		
		//2. for loop:
		//1 to 10:
		
		for(int k=1; k<=10; k++) {
			System.out.println(k);//12345
				if(k==5) {
					System.out.println("bye");
					break;
				}
				
		}
		
		System.out.println("----------");
		for(double d = 1.0; d<=5.0; d++) {
			System.out.println(d);//1.0 2.0 ....5.0
		}
		
		System.out.println("----------");

		//a = 97
		//b = 98
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch + " = " + (int)ch);//a = 97
		}
		
		System.out.println("----------");

//		for(;;) {
//			System.out.println("hellooooo");
//		}
		
		for(float b=1.3f; b<=4.6; b++) {
			
		}
		
		
		System.out.println(10>5);
		
		System.out.println(10!=5);
		
		
		//diff between for and while:
		
		//while loop use cases: when number of iterations/cycles are not fixed
		//1. wait for element on the page: 10, 5, 20, 3, 2, 15
		//2. wait for page loading: 
		//3. webtable pagination: 
		//4. calendar handling: 
		//5. carousel handling: 
		//6. page scrolling: linkedin, swiggy, zomato
		
		//for loop use cases:when number of iterations/cycles are fixed
		//1. month drop down: 1 to 12
		//2. arrays. arraylist: for loop
		//3.footer of the page: 
		//4. menu sub menu items
		
		
		//do-while:
		// 1 to 10:
		int p = 1;
		do {
			p++;
			System.out.println(p);
			//p++;//12
			break;
		}
		while(p<=10);		

		//use case: 
		// if element is already present on the page, check it and click on it and exit the loop
		
		
		//for-each
		//streams with lambda
		
		
	}

}
