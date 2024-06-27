package HashMapConcept;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SortedLinkedHashMap {

	public static void main(String[] args) {
        LinkedHashMap<String, Integer> unsortedMap = new LinkedHashMap<>();
        unsortedMap.put("Charlie", 5);
        unsortedMap.put("Alice", 3);
        unsortedMap.put("Bob", 1);
        unsortedMap.put("Dave", 4);

          //Convert LinkedHashMap to TreeMap to sort the keys
          //TreeMap<String, Integer> sortedMap = new TreeMap<>(unsortedMap);
         //sortedMap.forEach((key, value) -> System.out.println(key + " => " + value));        
        
        //Convert LinkedHashMap to TreeMap with a comparator for descending order
        TreeMap<String, Integer> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.putAll(unsortedMap);
        sortedMap.forEach((key, value) -> System.out.println(key + " => " + value));
    }

}
