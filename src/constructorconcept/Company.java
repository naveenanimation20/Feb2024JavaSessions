package constructorconcept;

public class Company {
	
	//global
	String name;
	int empCount;
	
	public Company(String name, int empCount) {//local
		this.name = name;
		this.empCount = empCount;
		
	}
	

	public static void main(String[] args) {

		Company c1 = new Company("IBM", 10000);
		System.out.println(c1.name);
		System.out.println(c1.empCount);
	}

}
