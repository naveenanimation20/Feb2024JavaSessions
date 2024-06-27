package OOPEncapsulation;

public class CustomerTest {

	public static void main(String[] args) {

		
		//CRUD --> Create Retrieve Update Delete
		
		//POST --> Create
		Customer obj = new Customer("Ayesha", 25, 23.44, true);
		
		//GET --> Retrieve
		System.out.println(obj.getName() + " " +obj.getAge()+ " "+ obj.getSalary() + " " + obj.isActive());
		
		//PUT/PATCH --> Update
		obj.setSalary(35.55);
		obj.setAge(30);
		
		//GET
		System.out.println(obj.getName() + " " +obj.getAge()+ " "+ obj.getSalary() + " " + obj.isActive());

		
		
		//2nd:
		Customer c1 = new Customer();//create a customer without any value
		System.out.println(c1.getName() + " " +c1.getAge()+ " "+ c1.getSalary() + " " + c1.isActive());

		//PUT
		c1.setName("Ravi");
		c1.setAge(40);
		c1.setSalary(34.55);
		c1.setActive(true);
		
		//GET
		System.out.println(c1.getName() + " " +c1.getAge()+ " "+ c1.getSalary() + " " + c1.isActive());
		
		c1.setActive(false);
		
		System.out.println(c1.getName() + " " +c1.getAge()+ " "+ c1.getSalary() + " " + c1.isActive());

	}

}
