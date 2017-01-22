package drive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForFirefox {
	
	public WebDriver driver;
	
	public WebDriver startMozilaDriver(){
		System.setProperty("webdriver.gecko.driver", "D:\\Workspace\\drivers\\geckodriver.exe"); 
	    return driver = new FirefoxDriver();
	}

}
