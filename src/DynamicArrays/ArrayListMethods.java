package DynamicArrays;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(1900);//0
		marksList.add(200);//1
		marksList.add(3080);//2
		marksList.add(40);//3
		marksList.add(5);//4
		
		//marksList.remove(10);
		marksList.remove((Object)900);
		
		
		System.out.println(marksList);

		
		System.out.println(marksList);
		
//		marksList.remove(0);
//		System.out.println(marksList.get(0));
//		System.out.println(marksList);

		marksList.add(47);
		System.out.println(marksList);
		System.out.println(marksList.size());

		
		marksList.add(1, 2500);
		System.out.println(marksList);
		
		System.out.println(marksList.size());//7 --> 0 to 6
		
		marksList.add(7, 4500);//IndexOutOfBoundsException: IOB
		System.out.println(marksList);
		
//		marksList.remove(0);
//		System.out.println(marksList);
		
		
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Tom");//0
		empData.add(30);//1
		empData.add('m');//2
		empData.add(12.33);//3
		empData.add(true);//4
		
		System.out.println(empData);
//		empData.add(0, "Naveen");
//		System.out.println(empData);
//
//		empData.add(empData.size(), "Google");
//		System.out.println(empData);

		empData.set(0, "Naveen");//update/replace
		System.out.println(empData);
		
		empData.remove(0);
		System.out.println(empData);

		
	}

}
