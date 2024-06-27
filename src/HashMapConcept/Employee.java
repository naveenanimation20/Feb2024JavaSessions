package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	public static void main(String[] args) {
		//Key,Value
		
		Map<String, String> studentMap = new HashMap<String, String>();//Vc=16
		
		studentMap.put("USA", "50");
		studentMap.put("Peter", "B");
		studentMap.put("Lisa", "A++");
		studentMap.put("Ravi", null);
		studentMap.put("Ravi", "C++");
		studentMap.put("Arti", null);
		studentMap.put("Ekta", null);
		studentMap.put(null, "Z++");
		studentMap.put(null, "P++");


		System.out.println(studentMap);
		System.out.println(studentMap.get("Tom"));
		System.out.println(studentMap.get(null));
		System.out.println(studentMap.size());
		
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		empMap.put("Ekta", 1000);
		empMap.put("Ravi", 3000);
		empMap.put("Saurabh", 4000);
		
		System.out.println(empMap.get("Ravi"));
		System.out.println(empMap);


		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

		mp.put(101, 100);
		mp.put(102, 1000);
		mp.put(104, 1090);
		mp.put(108, 1007);
		mp.put(109, 1006);
		mp.put(1110, 400);
		mp.put(null, 400);
		
		System.out.println(mp.get(1));
		
		HashMap<String, Object> empInfoMap = new HashMap<String, Object>();

		empInfoMap.put("Ravi", "SDET");
		empInfoMap.put("Ekta", 1000);
		
		System.out.println(empInfoMap.get("test"));

		HashMap<String, String[]> countryMap = new HashMap<String, String[]>();

		String city[] = {"Bangalore", "Pune", "delhi"};
		countryMap.put("India", city);
		
		String In[] = countryMap.get("India");
		System.out.println(In.length);
		
		System.out.println(countryMap.get("India").length);
		
		
		
		
	}

}
