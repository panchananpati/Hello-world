package abc_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton_softcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		//Entered required web page URL
		
		//Entered required web page URL
		driver.get("https://www.spicejet.com");
		
		//Automated Home page radio buttons
		int count= driver.findElements(By.xpath("//*[@name='ctl00$mainContent$rbtnl_Trip']")).size();
		for(int i=0;i<count-1;i++)
		{
			driver.findElements(By.xpath("//*[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
			
			String s1 = driver.findElements(By.xpath("//*[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
		if(s1.equals("TripPlanner"))
		{

			//driver.findElements(By.xpath("//*[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
		
		driver.close();
		}
		
		}

	}

}
