
public class StringKT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Vishwa123";
		
//		System.out.println(a.charAt(5));
//		System.out.println(a.codePointCount(6, 8));
//		System.out.println(a.indexOf("s"));
//		System.out.println(a.repeat(2));
//		System.out.println(a.split("w", 0));
//		System.out.println(a.replace("h", "H"));
		
		String b = "";
		for(int i=a.length()-1;i>=0;i--) {
			
			b= b+a.charAt(i);
		
		}
		
		System.out.println(b);
	}

}
