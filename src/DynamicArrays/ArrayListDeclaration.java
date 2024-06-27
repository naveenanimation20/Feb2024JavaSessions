package DynamicArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDeclaration {

	public static void main(String[] args) {

		
		List<Integer> marksList = new ArrayList<Integer>();

		
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(numList);
		
		//Immutable
		List<String> browserList =  Arrays.asList("chrome", "firefox", "safari", "opera");
		System.out.println(browserList.size());
		
//		browserList.add("ie");//UnsupportedOperationException
//		System.out.println(browserList.size());

		//mutable
		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("chrome", "firefox", "safari", "opera"));
		System.out.println(empList.size());
		empList.add("ie");
		System.out.println(empList.size());

	}

}
