package DynamicArrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTraverse {

	public static void main(String[] args) {
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(1900);//0
		marksList.add(200);//1
		marksList.add(3080);//2
		marksList.add(40);//3
		marksList.add(5);//4

		
		System.out.println(marksList);
		
		for(int i=0; i<marksList.size(); i++) {
			System.out.println(marksList.get(i));
		}
		System.out.println("-----");
		for(Integer e : marksList) {
			System.out.println(e);
		}
		
		System.out.println("-----");
		Collections.sort(marksList);//ASC
		System.out.println(marksList);
		
		Collections.sort(marksList, Collections.reverseOrder());//DESC
		System.out.println(marksList);

		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("tom");//0
		empList.add("peter");//1
		empList.add("naveen");//2
		empList.add("ravi");//3
		System.out.println(empList);
//		Collections.sort(empList);
//		System.out.println(empList);

		Collections.swap(empList, 0, 1);
		System.out.println(empList);


	}

}
