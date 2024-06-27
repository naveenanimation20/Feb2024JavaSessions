package javasessions;

public class Casting {

	public static void main(String[] args) {

		// range: -128 to 127
		byte a = 100;//1
		byte b = 120;//1

		// int, long
		int c = a + b;// 220 --4
		System.out.println(c);

		int d = a-b;

		// range: -32768 to 32767
		short s1 = 100;
		short s2 = 200;

		int s3 = s1 + s2;// 300

		int i = 200;
		int j = 300;
		int k = i + j;

		byte g = 10;
		int u = g;

		int r1 = 130;
		byte r2 = (byte) r1;// (byte)130
		System.out.println(r2);
		
		char c1 = 'a';//97
		byte b1 = (byte)((int)c1);//97
		System.out.println(b1);
		
		double dr = 1112.33;
		short tr = (short)dr;//1112
		System.out.println(tr);
		
		
		char c4 = 'c';//99
		char c5 = 'd';//100
		
		System.out.println(c4*c5);//9900
		System.out.println(c4+c5);//199
		System.out.println(c4-c5);//-1
		System.out.println(c4/c5);//99/100=0
		
		//space - 32
		System.out.println(c4+" "+c5);//c d
		System.out.println(c4+' '+c5);//99+32+100=231

		
		System.out.println(' ' + ' ');//32+32
		System.out.println(" " + ' ');//
		System.out.println(' '+ " ");//  
		
		System.out.println((byte)1000);
		
		System.out.println(((' '+' ') + "  "));
		
		
		int a1 =(byte)20;//-110
		System.out.println(a1);//-110
		
		double dw = 97.33;
		char cw = (char)dw;//97->a
		System.out.println(cw);
		
		
	}

}
