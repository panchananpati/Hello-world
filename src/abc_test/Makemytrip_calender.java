package abc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip_calender {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
		int i=0;
		driver.manage().window().maximize();
			
		driver.switchTo().frame(i);
		int count1= driver.findElements(By.xpath("//div[@id='dp1536066449046']//span[@class='ui-datepicker-month")).size();
		
		for(i=0;i<count1;i++)
		{
		
	
		while(!driver.findElements(By.xpath("//div[@id='dp1536066449046']//span[@class='ui-datepicker-month'][contains(text(),'September')]")).get(i).getText().contains("NOVEMBER"))
		{
			driver.findElements(By.xpath("//div[@id='dp1536066449046']//span[@class='ui-icon ui-icon-circle-triangle-e'][contains(text(),'Next')]")).get(i).click();
		}
		}
		driver.switchTo().defaultContent();
		int count=driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).size();
		
		for(int j=0; j<count; j++)
		{
			String date=driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(j).getText();
			if(date.equals("15"))
			{
				driver.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(j).click();
				break;
			}
			
			}
		driver.quit();
		}
		
}
		
	

