
public class Armstrong {

	public static void main(String[] args) {
		// 1 5 3 = 13 + 53 + 33
		
		int a =153;
		
		int g , s =0;
		int digits = countDigit(a);
		
		while(a!= 0) {
			
			int f = (a % 10);
			
			s = (s * 10) + f ;
			
			
		}

	}

	private static int countDigit(int a) {
		return (int) Math.floor(Math.log10(a) + 1);
	}

}
