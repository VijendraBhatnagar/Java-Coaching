import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {
	
	int num=0;
	int b = 2;
	
	MyClass(int num){
		System.out.println("Constructor with 1 parameter "+ ""+ num);
	}
	
	MyClass(){
		System.out.println("Constructor with no parameter");
	}
	
	MyClass(int num, int b){
		System.out.println("Constructor with 1 parameter "+ ""+ num +""+b);
	}
	
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
			System.out.println("It's Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
		
	}
	
	
	public static void main(String [] args) {
		
		isArmstrongNumber(30);
		
		MyClass my=new MyClass(1);
		
		System.out.println(my.num);
		System.out.println(my.b);
		
		
//		 // declaration and instantiation of objects/variables
//    	System.setProperty("webdriver.gecko.driver","D:\\Selenium Code\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		//comment the above 2 lines and uncomment below 2 lines to use Chrome
//		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
//		//WebDriver driver = new ChromeDriver();
//    	
//        String baseUrl = "https://dreamcatcher-stage.mirum-apac.com";
//        String expectedTitle = "Welcome: Mercury Tours";
//        String actualTitle = "";
//
//        // launch Fire fox and direct it to the Base URL
//        driver.get(baseUrl);
//        
//        driver.switchTo().alert().sendKeys("hsbc-guest");
//        
//        // get the actual value of the title
//        actualTitle = driver.getTitle();
//
//        /*
//         * compare the actual title of the page with the expected one and print
//         * the result as "Passed" or "Failed"
//         */
//        if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
//       
//        //close Fire fox
//        //driver.close();
       
	}
	
	

 }
