
public class StringsReverese {

	public static void main(String[] args) {

		String s = "One Two 'Three' Four Five";

		String[] w = s.split("");
		

		StringBuilder r = new StringBuilder();

		for (int i = w.length - 1; i >= 0; i--) {
			r.append(w[i]).append("");
			
		}
		System.out.println(r);
	}

}
