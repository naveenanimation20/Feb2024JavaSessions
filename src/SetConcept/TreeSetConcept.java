package SetConcept;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
		Set<String> browserSet = new TreeSet<String>();// vc=16

		browserSet.add("chrome");
		browserSet.add("firefox");
		browserSet.add("ie");
		browserSet.add("opera");
		browserSet.add("CHROME 90");
		browserSet.add("safari");
		browserSet.add("brave");
		browserSet.add("123");
		//browserSet.add(null);//NPE


		System.out.println(browserSet);
	}

}
