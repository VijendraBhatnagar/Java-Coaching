
public class FinallyBlock {
	
	public static void main(String args[]) {
	     
		try{  
			
		 int num=121/0;  
		 System.out.println(num);  
	      }  
	      catch(ArithmeticException e){
	         System.out.println("Number should not be divided by zero");
	      }  
	      /* Finally block will always execute
	       * even if there is no exception in try block
	       */
	      finally{
		 System.out.println("This is finally block 1");
		 System.out.println("This is finally block 2");
		 System.exit(0);
		 System.out.println("This is finally block3");
		 
	      }  
	      System.out.println("Out of try-catch-finally");  
	   }   

}
