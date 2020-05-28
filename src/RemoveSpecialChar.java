
public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String s= "@@@$%^&& check letter *&^%$#@!!!";
				
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.print(s);
				
				
	}

}
