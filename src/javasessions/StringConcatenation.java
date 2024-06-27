package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		
		System.out.println("the value of a : " + a);
		System.out.println("the value of b : " + b);
		System.out.println("sum of a and b : " + (a+b));//sum of a and b : 300
		
		String x = "hello";
		String y = "world";
				
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+x);//100hello
		System.out.println(a+b+x+y);//300HelloWorld
		System.out.println(x+y+a+b);//helloworld100200
		System.out.println(x+y+(a+b));//helloworld300
		
		System.out.println(a+b+x+y+a+b);//300helloworld100200
		
		double c = 12.33;
		double d = 23.44;
		System.out.println(x+y+c+d);//helloworld12.3323.44
		
		System.out.println(a+b+c+d+x+y);
		
		char c1 = 'a';//97
		char c2 = 'b';//98
		System.out.println(c1+c2+x+y);//195helloworld
		
		
		System.out.println(c1+c2);//195
		//ab
		System.out.println(c1+""+c2);//ab
		
		System.out.println(x+" "+y);//hello world
		
		String t1 = "a";
		String t2 = "b";
		System.out.println(t1+t2);//ab
		
		System.out.println(c1+' '+c2);//227
		
		
		System.out.println(true+x);
		
		System.out.println('a'+'b'+"hello"+"selenium"+100+200+12.33);//195helloselenium10020012.33
		
		
	}

}
