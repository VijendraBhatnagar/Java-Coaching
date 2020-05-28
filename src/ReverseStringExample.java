
public class ReverseStringExample {

	public static void main(String[] args) {

		String s= "JAVAPOINT";
		int word=s.length();
		String rev=" ";
		
		for(int i=word-1;i>0;i--) {
			
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
}
}
