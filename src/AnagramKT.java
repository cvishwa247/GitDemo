import java.util.Arrays;
import java.util.Comparator;

public class AnagramKT {

	public static void main(String[] args) {
		// Keep , Peek listen ,silent
		
		String a = "listen";
		String b = "silent";
		
		char[] c= a.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
		
		char[] d= b.toCharArray();
		Arrays.sort(d);
		System.out.println(d);
		
		System.out.println(Arrays.equals(c, d));
		System.out.println(Arrays.equals(c, d));
		System.out.println(Arrays.equals(c, d));

	}

}
