package abc_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticdynamicdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke chrome browser
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		//Entered required web page URL
		driver.get("https://www.spicejet.com");
		
		//commented uncommented code part to run programme properly
		
		//Added information about trip ex- single way multicity or roundtrip using radio button
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		 //Automated Dynamic drop down of origin and destination
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='CCU']")).click();
		driver.findElement(By.cssSelector("[id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		// Add calender automation part- remaining to add
		
		//Automated no. of passenger dropdown  
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		driver.findElement(By.xpath("//div[@text() ='4 Adult, 3 Child, 2 Infant']"));
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		// automating checkboxes and verifying it is selected or not
		System.out.println("Armed Force check box is selecetd");
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
		System.out.println("Armed Force check box is selecetd");
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
		
	
		

	}

}
