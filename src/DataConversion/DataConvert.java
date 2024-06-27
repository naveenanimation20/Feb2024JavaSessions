package DataConversion;

public class DataConvert {

	public static void main(String[] args) {

		
		String x = "100";
		System.out.println(x+20);
		
		//String to int: using Wrapper class: Integer
		
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);
		
//		String t = "200A";
//		int j = Integer.parseInt(t);//NumberFormatException
//		System.out.println(j+20);
		
		String y = "12.33";
		System.out.println(y+20);
		
		double d = Double.parseDouble(y);//12.33
		System.out.println(d+20);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		//String to boolean:
		
		String execute = "true";
		
		boolean flag = Boolean.parseBoolean(execute);//true
		
		if(flag) {
			System.out.println("Run my test cases");
		}
		else {
			System.out.println("exit");
		}
		
		//int to String:
		int p = 200;
		System.out.println(p+20);
		
		String pr = String.valueOf(p);//"200"
		System.out.println(pr+20);
		
		//boolean to String:
		boolean fg = true;
		String f = String.valueOf(fg);//"true"
		System.out.println(f.length());
		
		
		//
		String tr = "";//blank and empty
		System.out.println(tr.isEmpty());//true
		System.out.println(tr.isBlank());//true
		
		String tr1 = " ";//blank
		System.out.println(tr1.isEmpty());//false
		System.out.println(tr1.isBlank());//true

		String tr2 = "     ";//blank
		System.out.println(tr2.isEmpty());//false
		System.out.println(tr2.isBlank());//true

		String tr3 = "  v   ";//blank
		System.out.println(tr3.isEmpty());//false
		System.out.println(tr3.isBlank());//false

		
	}

}
