
public class StringReverseKT {

	public static void main(String[] args) {


	// String reverse , checking for palindrome
		
		String s= "Vis";
		String r= "";
		for(int i=0;i<s.length();i++) {
			 r = (s.substring(i+1)) + s.charAt(i);
			 
		}
		System.out.println(r);
		
		for(int i=s.length()-1;i>=0;i--) {
			
			r = r + s.charAt(i);
		}
		
		System.out.println(r);
		if(r.equals(s)) {
			System.out.println("given string is Palindrome");
		}
		
		
	}

}
