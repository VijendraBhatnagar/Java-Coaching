
public class ThirdLargest {

	public static void main(String[] args) {
		
		int temp,size;
		int arr[]= {10,20,34,3,2,67,99,1};
		
		size=arr.length;
		
		for(int i=0;i<size;i++) {
			for(int j=1;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		System.out.println("Third largest value of array :"+ arr[size-3]);
		
	}

}
