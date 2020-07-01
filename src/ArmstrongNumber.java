
public class ArmstrongNumber {

	public static void isArmstrongNumber(int num) {
		
		//A positive number is called armstrong number if it is equal to the sum of cubes of its digits for 
		//example 0, 1, 153, 370, 371, 407 etc.
		
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
			System.out.println("Number is an Armstrong");
		}else {
			System.out.println("Number is not an Armstrong");
		}
	}
	
	public static void main(String[] args) {
		
		isArmstrongNumber(370);
		
	}

}
