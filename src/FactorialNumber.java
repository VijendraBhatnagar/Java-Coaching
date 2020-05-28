
public class FactorialNumber {
	
	// non recursive 
	public static int factorialNum(int num) {
		
		int sum=1;
		
		if(num==0) {
			return 1;
		}
		for (int i=1;i<=num;i++) {
			sum=sum*i;
		}
		return sum;
	}
	
	// Recursive method - a function is calling itself
	public static int factNum(int num) {
		
		if(num==0)
			return 1;
		else
			return (num*factNum(num-1));
	}

	public static void main(String[] args) {
		
		System.out.println(factorialNum(3));
		System.out.println("Test");
		System.out.println(factNum(4));
	}

}
