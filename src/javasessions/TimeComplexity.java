package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {

		//TC -- BIG O --> O
		
		int i = 10;
		//O(1) -- Constant time
		
		System.out.println(i);//O(1)
		
		//50 secs --> 0.000001
		for(int k=1; k<=10; k++) {
			System.out.println(k);
		}
		//1+n+n+n => 3n+1 -> Linear Equation
		//3n+1 ==> 3n ==> n ==> O(n)
		
		
		
		int p=1;//0.000001
		while(p<=10) {
			System.out.println(p);
			p++;
			System.out.println("hello world");
		}
		//1+n+n+n+n => 4n+1 => 4n=> O(n)
		
		
		//3n+1+4n+1=> 7n+2 --> Linear Equation
		//7n+2 --> 7n ==> O(n)
		
		
		//
		for(int l=1; l<=10; l++ ) {
			System.out.println(l);
				if(l==5) {
					System.out.println("bye");
					break;
				}
		}
		
		//1+n+n+n+n+1+1 ==> 4n+3==> 4n==> O(n)
		
		//nested loops: mxn
		for(int t=1; t<=5; t++) {
			for(int s=1; s<=5; s++) {
				System.out.println(t+""+s);
			}
		}
		//(1+n+n)(1+n+n+n)=> (1+2n)(1+3n)=> 1+3n+2n+6n^2 => 6n^2+5n+1 -- Quadratic equation
		//6n^2+5n+1 ==> 6n^2+5n ==> n(6n+5) => 6n^2 ==> O(n^2)
		
		for(int t=1; t<=5; t++) {
			for(int s=1; s<=5; s++) {
				for(int f=1; f<=5; f++) {
					System.out.println(t+""+s+f);

				}
			}
		}
		//cubic -- O(n^3)
		
		//
		int y=1;
		while(y<=10) {
			for(int k=1; k<=10; k++) {
				System.out.println(k);
			}
			y++;
		}
		//(1+n+n)(1+n+n+n)==> O(n^2)
		
		//O(log n) --> 
		//k = n/2
		//log k = log(n/2)
		//log k = log n - log 2
		//log k = log n -1 
		//log k = log n
		
		
		
	}

}
