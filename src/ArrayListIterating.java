import java.util.ArrayList;

public class ArrayListIterating {
	
	public static void main(String [] args) {
		
		ArrayList<String> tv= new ArrayList<String>();
		
		tv.add("Abc");
		tv.add("xyz");
		tv.add("sdf");
		
		for(String t:tv)
			System.out.println(t);
	}

}
