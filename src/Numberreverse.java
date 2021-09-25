public class Numberreverse {
		
  public static void main(String[] args) {
	  /*   int num = 10025;
    System.out.println("Input - " + num + " Output:" + 
reverseNo(num));
  }  
 
public static int reverseNo(int number) {
    int reversed = 0;    
     
     while(number != 0) {
          int digit = number % 10;
          reversed = reversed * 10 + digit;
          number /= 10;
    }
    return  reversed;
  }*/
	int a =12345670;
	long s = 0;
	
	while(a != 0) {
		
		long l = (a % 10);
		s = (s * 10) + l;
		a = a/10;
		
	}

	System.out.println(s);
	System.out.println(s);
	
}
}