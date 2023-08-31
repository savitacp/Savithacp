package genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebUtility wb; 
	public FileUtility fb ;
	WebDriver driver;
	
	
	
	
	@BeforeClass
	public void configbc() throws Throwable
	{
		
		 wb = new WebUtility();
		 fb = new FileUtility();
			

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wb.maximizewindow(driver);
		wb.implicitwait(driver);
        String URL = fb.read_data_from();
        driver.get(URL);
        
       	}
	
	@AfterClass
	public void configac()
	{
		driver.close();
	}

}
