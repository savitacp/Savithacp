package genericutility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WebUtility {
	
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

public void implicitwait(WebDriver driver)	
{
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}


}
