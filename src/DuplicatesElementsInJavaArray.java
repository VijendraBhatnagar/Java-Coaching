import java.util.HashSet;
import java.util.Set;

public class DuplicatesElementsInJavaArray {

	public static void main(String[] args) {
		
		String names[] = {"Java","C","C#","Python","Python","C"};
		// hashset does not store dupicate values and it is has 0(n) time complexity
		Set<String> store=new HashSet<String>();
		for (String name:names) {
		if(store.add(name)==false) {
			System.out.println("Duplicate value in Array::"+ name);
		}
		}
		
	}

}
