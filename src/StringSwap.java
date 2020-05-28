
public class StringSwap {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Strings before swapping");
		System.out.println("String A value is : "+a);
		System.out.println("String B value is : "+b);
		
		// 1. Append a and b.
		
		a=a+b; //HelloWorld
		
		// 2. Store intial String a in String b. 
		
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("Strings after swapping");
		System.out.println("String A value is : "+ a);
		System.out.println("String B value is : "+ b);
		
		
		
		
		
	}

}
