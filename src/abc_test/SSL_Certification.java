package abc_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Certification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities ch= new DesiredCapabilities();
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, "True");
			 //or     ch.acceptInsecureCerts();
		
		
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("https://www.makemytrip.com/");

	}

}
