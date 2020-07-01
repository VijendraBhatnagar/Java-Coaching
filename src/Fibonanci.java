
public class Fibonanci {

	
	static int n1=0;
	static int n2=1;
	static int n3;
	static int count=30; 
	
	//In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. 
	
	public static void main(String[] args) {
		
		System.out.println(n1+" "+n2);
		
		while(n3<=count) {
			
			n3=n1+n2;
			System.out.println(" "+n3);
			
			n1=n2;
			n2=n3;
			
		}
		
	}

}
