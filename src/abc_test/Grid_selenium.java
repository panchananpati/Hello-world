package abc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grid_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18886/eng-vs-ind-4th-test-india-tour-of-england-2018");
		// Change above to current ended up match link
		WebElement table= driver.findElement(By.xpath("//body/div[@class='page']/div[@id='page-wrapper']/div[@class='cb-col cb-col-100 cb-bg-white']/div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']/div[@id='innings_4']/div[1]"));
		
		//Xpath and css might vary while executing testcase
		
		int count= table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<count-2;i++)
		{
			String st=table.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int stvalue= Integer.parseInt(st);
			sum=sum+stvalue;
		
		}
		System.out.println(sum);
		String Extra=table.findElement(By.xpath("//div[@class='cb-col cb-col-8 text-bold cb-text-black text-right'][contains(text(),'2')]")).getText();
		int Extras =Integer.parseInt(Extra);
		int Totalexpectedsum= sum+Extras;
		System.out.println(Totalexpectedsum);
		
		
		String ActualTotal= driver.findElement(By.xpath("//div[contains(text(),'184')]")).getText();
		int Actualtotal= Integer.parseInt(ActualTotal);// BAs ek T ka difference
		System.out.println(Actualtotal);
		
		
		if(Totalexpectedsum==Actualtotal)
		{
			System.out.println("Yo ma man");
		}
		else
		{
			System.out.println("The F Word for my code");
		}
		driver.quit();
	}

}
