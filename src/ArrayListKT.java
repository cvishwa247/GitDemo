import java.util.ArrayList;

public class ArrayListKT {

	public static void main(String[] args) {
		
		
		ArrayList <String> al= new ArrayList<String>();
		
		al.add("Vishwa");
		al.add("Srikala");
		al.add("Sahasra");
		al.add("Sweet Home");
		
		System.out.println(al.contains("Sahasra"));
		System.out.println(al.indexOf("Srikala"));
		System.out.println(al.get(0));
		System.out.println(al.size());
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.size());
		
	}

}
