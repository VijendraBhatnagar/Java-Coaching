import java.util.HashSet;
import java.util.Set;

public class PraticePlatform {
	
	public static void main(String [] args) {
	
		int num=12345;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			}
		System.out.println("Reverse integer:"+ rev);
		
	}
	
}