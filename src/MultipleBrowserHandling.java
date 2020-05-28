import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import com.sun.jna.platform.FileUtils;
import org.apache.commons.io.FileUtils;

public class MultipleBrowserHandling {
	
public static void main(String[] args) throws IOException {
		
		WebDriver driver = fnLaunchBrowser("CH");
		driver.get("http://www.google.com");
		String ExpectedResult = "Google";
		
		
		WebElement WE = driver.findElement(By.name("btnK"));
		String ActualResult = WE.getAttribute("value");
		if(ExpectedResult.equalsIgnoreCase(ActualResult)){
			System.out.println("PASS");
		}
			else{
			System.out.println("FAIL");
			TakesScreenshot tss = (TakesScreenshot) driver;
			File srcfileobj = tss.getScreenshotAs(OutputType.FILE);
			File destFileobj = new File("Snapshot/Google.png");
			FileUtils.copyFile(srcfileobj, destFileobj);
			
		}
	}
	
	public static WebDriver fnLaunchBrowser(String BrowserName){
		WebDriver driver = null;
		if(BrowserName=="CH"){
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Code\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(BrowserName=="FF"){
			driver = new FirefoxDriver();
		}
		else if(BrowserName=="IE"){
			System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		return driver;
	}

	

}
