
public class WordsReverse {

	public static void main(String[] args) {

		WordsReverse w = new WordsReverse();
//		w.reverseWordsInString("Hi I am Vishwa");
//	w.reverseOrderOfWords("Hi Vishwa 1 Here ");
		w.reverseString("Vishwanath");
	}

	public static void reverseWordsInString(String input) {
		String[] words = input.split(" ");
		StringBuilder reverseString = new StringBuilder();
		for (String word : words) {
			String reverseWord = new StringBuilder(word).reverse().toString();
			reverseString.append(reverseWord).append(" ");
		}
		System.out.println("reverseWordsString = " + reverseString);
	}

	public StringBuilder reverseOrderOfWords(String input) {
		String[] words = input.split(" ");
		StringBuilder reverseString = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			reverseString.append(words[i]).append(" ");
		}
		System.out.println("reverseOrderOfWordsString = " + reverseString);
		return reverseString;
	}

	public String reverseString(String Vishwanath) {

		
		String r = (Vishwanath.substring(1)) + Vishwanath.charAt(0);
		System.out.println(r);
		return r;
	}
}
