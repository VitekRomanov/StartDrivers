package drive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForChrome {

	public WebDriver driver;
	
	public WebDriver startChromeDriver(){
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe"); 
	    this.driver = new ChromeDriver();
		return driver;	    
	}

	
}
