package abc_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		//Entered required web page URL
		
		//Entered required web page URL
		driver.get("https://www.spicejet.com");
		Thread.sleep(5000l);
		
		//Automated static currency selection dropdown
		Select s= new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByIndex(2);
		s.selectByVisibleText("USD");
		driver.quit();

	}

}
