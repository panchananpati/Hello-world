package abc_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Ui {
	
	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		//Entered required web page URL
		driver.get("https://www.spicejet.com");
		driver.findElement(By.xpath("//*[@id='flightSearchContainer']/div[4]/button")).click();
		
		
		
		//List<WebElement> date= driver.findElements(By.xpath("//a[@class='ui-state-default']"));
	
			
		while(!driver.findElement(By.cssSelector("[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left'] [class='ui-datepicker-month']")).getText().contains("December"))
		{
			driver.findElement(By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		int count= driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
		for(int i=0;i<count;i++)
		{
			String ss= driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();
			if(ss.equalsIgnoreCase("18"))  //equalsIgnoreCase() is for string element
			{
				driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
				break;
			}
		}
		
}
	
}