import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapKT {

	public static void main(String[] args) {

		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(0, "Zero");
		h.put(1, "One");
		h.put(2, "Two");
		h.put(10, " ");
		
//		System.out.println(h.get(0));
		
		Set s = h.entrySet();
		Iterator it =s.iterator();
		
		while(it.hasNext()){
		Map.Entry m = (Map.Entry) it.next();
		System.out.print(m.getKey());
		System.out.print("\t");
		System.out.print(m.getValue());
		System.out.println("");
	}
		System.out.println("");

}
	
}
