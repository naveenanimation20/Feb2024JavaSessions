package HashMapConcept;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		// Map<String, String> empMap = new HashMap<String, String>();//V=15, pc=0

		// Map<String, String> empMap = new LinkedHashMap<String, String>();//V=15, pc=0

		Map<String, String> empMap = new TreeMap<String, String>();

		System.out.println(empMap.size());// 0

		empMap.put("Peter", "QA");
		empMap.put("Lisa", "SDET");
		empMap.put("Ekta", "Dev");
		empMap.put("Ravi", "Manager");
		empMap.put("Arti", "Fresher");
		empMap.put("aakash", "Fresher");
		empMap.put("1test", "Fresher");
				
		
		
		//K-V: KeySet(EntrySet)
		for(Map.Entry<String, String> entry : empMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("--------");
		
		//foreach method using lambda:
		empMap.forEach((k,v) -> System.out.println(k + ":" + v));
		
		
		System.out.println("--------");


		//empMap.put(null, "trainer");//null key not allowed in TreeMap --> NPE

		System.out.println(empMap.size());// 5

		System.out.println(empMap.get("Lisa"));
		System.out.println(empMap.get("selenium"));

		System.out.println(empMap);
		
		
		//use cases for HashMap:
		//1. RBAC (user roles): seller, partner, distributor, vendor, user, admin
		//2. <String, Integer>: Product Price Data
		//3. Product Meta Data
		//4. Excel Data
		//5. API Testing: Headers in HashMap
		
		//Properties : K,V

	}

}


