
public class PalindomeNumber {

	public static void isPalindromeNumber(int num) {
		
		int sum=0;
		int t;
		
		t=num;
		while(num>0) {
			
			sum=sum*10+num%10;
			num=num/10;
		}
		if(t==sum) {
			System.out.println(sum+" " +"Number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}
		
	}
	public static void main(String[] args) {
		
		isPalindromeNumber(121);
		
	}

}
