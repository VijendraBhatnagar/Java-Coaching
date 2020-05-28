
public class StringManipulation {
	
	public static void main(String[] args) {
	
		String str= "The rains have started";
		String str1= "The Rains have started";
		String date = "06-06-2022";
		
		
	System.out.println(str.length());
	System.out.println(str.charAt(2));
	System.out.println(str.indexOf('s'));  // 1st Occurance
	System.out.println(str.indexOf("have"));
	System.out.println(str.indexOf('s',str.indexOf('s')+1));
	
	System.out.println(str.indexOf("hello"));  // For word which are not in String ,it will give -1  
	
	//String Comparison
	
	System.out.println(str.equals(str1));
	System.out.println(str.equalsIgnoreCase(str1));
	System.out.println(str.substring(0, 11));
	
	System.out.println(date);
	System.out.println(date.replace("-","/"));
	System.out.println(str.concat("ABC"));
	System.out.println(str.substring(0));
	
	
	}
	
}
