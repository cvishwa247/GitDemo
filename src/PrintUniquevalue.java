import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintUniquevalue {

	public static void main(String[] args) {

//		int a[] = { 1, 2, 1, 1, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 9 };
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		for (int i = 0; i < a.length; i++) {
//
//			int k = 0;
//			if (!al.contains(a[i])) {
//
//				al.add(a[i]);
//				k++;
//
//				for (int j = i + 1; j < a.length; j++) {
//
//					if (a[i] == a[j]) {
//						k++;
//					}
//				}
//				
//				if(k==1) {
//					
//					System.out.println(a[i] + " " + "is unique number");
//				}
//			}
//
//		}
		
		
//		String s[] = {"a","a","b","b","b","c","d","d","d","d"};
//		
//		ArrayList<String> as = new ArrayList<String>();
//		
//		for(int i=0;i<s.length;i++) {
//			
//			int k=0;
//			
//			if(!as.contains(s[i])) {
//				
//				as.add(s[i]);
//				k++;
//				
//				for(int j=i+1;j<s.length;j++) {
//					
//					if(s[i].equals(s[j])) {
//						k++;
//					}
//				}
////				System.out.println(s[i]);
////				System.out.println(k);
//				
//				if(k==1)
////					s[i].replace("c", "g");
//				System.out.println(as.get(i));
//					System.out.println(s[i]+ " " + "is the unique value");
//				
//			}
//		}
//
//	}
	
	int a[] = { 1, 2, 1, 1, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 9 };
	List<Integer> values = Arrays.asList(1, 2, 1, 1, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 9 );
	values.stream().distinct().sorted().forEach(v->System.out.println(v));

}
	
}
