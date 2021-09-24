
public class FibonacciSeries {

	public static void main(String[] args) {

 int p =0;
 int n =1;
 
 for(int i=0;i<12;i++) {
	 
	 int f = p + n;
	 p =n;
	 n =f;
	 System.out.print(p + " ");
 }


	}

}
