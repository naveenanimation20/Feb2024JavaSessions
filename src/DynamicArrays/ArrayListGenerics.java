package DynamicArrays;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(12.33);
		ar.add("testing");
		ar.add('g');
		ar.add(true);

		// Integer type of arraylist:
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(120);

		ArrayList<Double> mList = new ArrayList<Double>();
		mList.add(12.33);
		mList.add(100.00);

		ArrayList<String> browserList = new ArrayList<String>();
		browserList.add("CHROME");
		browserList.add("FIREFOX");

		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Tom");
		empData.add(30);
		empData.add('m');
		empData.add(12.33);
		empData.add(true);
		
		System.out.println(empData.size());
		System.out.println(empData.get(0));

	}

}
