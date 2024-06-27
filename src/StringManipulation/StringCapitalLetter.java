package StringManipulation;

import java.util.Arrays;

public class StringCapitalLetter {

	public static void main(String[] args) {

		String s = "welcome to naveen automation labs";// This Is My Java Code	
		
		
		String ss[] = s.split(" ");
		System.out.println(Arrays.toString(ss));
		System.out.println(ss[2].length());
		String newStr = "";
		
		for (String e : ss) {
			System.out.println(e);
            newStr = newStr + String.valueOf(e.charAt(0)).toUpperCase() + e.substring(1) + " ";
		}

		System.out.println(newStr.trim());
	}

}

//this ---> replace(t->T)
