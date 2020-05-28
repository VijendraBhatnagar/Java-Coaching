import java.util.Arrays;

public class LargestAndSmallestNumInArray {

	public static void main(String[] args) {
		
		int numbers[]= {10,24,-34,100,-101,23,6,15,-90,201,-201};
		
		int largest=numbers[1];
		int smallest=numbers[1];
		//Time complexcity O(n)
		for(int i=0;i<numbers.length;i++) {
			if(largest<numbers[i]) {
				largest=numbers[i];
			
			}else if(smallest>numbers[i]) {
				smallest=numbers[i];
			}
		}
		System.out.println("Array elements::"+ Arrays.toString(numbers));
		System.out.println("Largest element in Array::"+ largest);
		System.out.println("Smallest element in Array::"+ smallest);
		
		
	}

}
