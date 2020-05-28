
public class Fibonanci {

	int i=0;
	static int n1=0;
	static int n2=1;
	static int n3;
	static int count=30; 
	
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
