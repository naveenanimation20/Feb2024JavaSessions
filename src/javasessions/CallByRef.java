package javasessions;

public class CallByRef {
	
	String name;
	int age;
	
	public static void test(CallByRef t1) {
		System.out.println("test method");
		System.out.println(t1.name);
		System.out.println(t1.age);
		
		t1.age = 40;
		
		//S --> NS: create the object(ref)
		
	}
	

	public static void main(String[] args) {

		CallByRef obj = new CallByRef();
		obj.name = "Rahul";
		obj.age = 30;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
//		
		CallByRef.test(obj);//call by reference
		
		
		System.out.println(obj.age);

		
		CallByRef obj1 = new CallByRef();
		CallByRef.test(obj1);//call by reference

		
	}

}
