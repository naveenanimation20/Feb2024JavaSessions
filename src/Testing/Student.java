package Testing;

public class Student {

	String name;
	int age;
	static int totalStudent = 0;

	public Student() {
		totalStudent++;
	}

	public Student(String name) {
		this.name = name;
		totalStudent++;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		totalStudent++;
	}

	public static double addition(double a, double b) {
		return a + b;
	}

	public static double calculateCircumference(double radius) {
		return 2 * Math.PI * radius;// 2*pi*r
	}

	public static double calculateArea(double radius) {
		return Math.PI * radius * radius;// pi*r*r
	}

	public static String calculateGrade(int marks) {

		if (marks <= 40) {
			return "FAIL";
		}

		if (marks >= 91 && marks <= 100) {
			return "AA";
		} else if (marks >= 81 && marks <= 90) {
			return "AB";
		} else if (marks >= 71 && marks <= 80) {
			return "BB";
		} else if (marks >= 61 && marks <= 70) {
			return "BC";
		} else if (marks >= 51 && marks <= 60) {
			return "CD";
		} else if (marks >= 41 && marks <= 50) {
			return "DD";
		} else {
			System.out.println("plz pass the right marks....");
			return "FAIL";
		}
	}

	public static boolean compareStrings(String str1, String str2) {
		// Check if both strings are null
		if (str1 == null && str2 == null) {
			return true;
		}
		// Check if one string is null while the other is not
		else if (str1 == null || str2 == null) {
			return false;
		}
		// Compare the strings
		return str1.trim().equalsIgnoreCase(str2.trim());
	}
	
	
	
	
	

	public static double calculateAverage(double[] numbers) {

		double sum = 0.0;
		
		for (double e : numbers) {
			sum = sum + e;
		}

		return sum / numbers.length;
	}

	public static void main(String[] args) {
		
		
		double d[] = {1.2,1.3,1.4,1.5};
		
		double avg = calculateAverage(d);
		System.out.println(avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		System.out.println(compareStrings("Naveen", "naveen"));

		addition(2.2, 3.2);

		Student s1 = new Student();
		Student s2 = new Student("test", 20);

		Student s3 = new Student("testing", 30);

		Student s4 = new Student();

		Student s5 = new Student("rahul");
		Student s6 = new Student();
		Student s7 = new Student();
		Student s8 = new Student();
		new Student();

		System.out.println(Student.totalStudent);

	}

}
