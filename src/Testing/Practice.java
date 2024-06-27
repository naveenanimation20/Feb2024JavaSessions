package Testing;

public class Practice {

	public static void main(String[] args) {

		int test[] = {1,3,4,5,61,2,33,44};//0-8
		
		int count = test.length-1;//7
		for(int e : test) {
			e=count;
			System.out.println(test[e]);//test[7]
			count--;
		}
		
	}

}
