
public class ArmstrongNumber {

	public static void isArmstrongNumber(int num) {
		
		int r;
		int t;
		int cube=0;
		
		t=num;
		
		while(num>0) {
			
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("Is palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
	
	public static void main(String[] args) {
		
		isArmstrongNumber(153);
		
	}

}
