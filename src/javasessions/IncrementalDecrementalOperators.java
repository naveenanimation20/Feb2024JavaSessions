package javasessions;

public class IncrementalDecrementalOperators {

	public static void main(String[] args) {

		//++ and -- 
		
		//1. post increment: first assign and then increse
//		int a = 1;
//		int b = a++;
//		
//		System.out.println(a);//2
//		System.out.println(b);//1
		
		
		int h = -99;
		int g = h++;
		System.out.println(h);//-98
		System.out.println(g);//-99
		
		int s = 5;
		System.out.println(s++);
		System.out.println(s);
		
		int t = 10;
		int f = t++;
		System.out.println(t);
		System.out.println(f);
		
		
		//2. pre increment: first increase then assign
		int x = 1;
		int y = ++x;
		System.out.println(x);//2
		System.out.println(y);//2
		
		int u = -999;
		int p = ++u;
		System.out.println(u);//-998
		System.out.println(p);//-998
		
		int total = 10;
		int pop = total++; 
//		System.out.println(total++);
//		System.out.println(++total);//
//		System.out.println(total);//
		
		int m1 = 0;
		int n1 = ++m1;
		System.out.println(m1);//1
		System.out.println(n1);//1
		
		//3. post decrement: first assign then decrease
		
		int p1 = 2;
		int q1 = p1--;
		System.out.println(p1);//1
		System.out.println(q1);//2
		
		int v = -999;
		System.out.println(v);//-999
		int k = v--;
		System.out.println(v);//-1000
		System.out.println(k);//-999
		
		//4. pre decrement: first decrease then assign
		int o = 2;
		int d = --o;
		System.out.println(o);
		System.out.println(d);
		
//		int pop = 10;
//		System.out.println(--pop);
//		System.out.println(pop);
		
		int bill = -1000;
		int finalBill = --bill;
		
		System.out.println(bill);//-1001
		System.out.println(finalBill);//-1001
		
		int th = 5;
		System.out.println(th--);//5
		System.out.println(th);//4
		
		char ch = 'b';//98
		System.out.println(--ch);
		System.out.println(ch);
		
		
		
		
		
		
		
	}

}
