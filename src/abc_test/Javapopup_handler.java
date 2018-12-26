package abc_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javapopup_handler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Work//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://echoecho.com/toolcolorpicker.htm");
		
		driver.findElement(By.xpath("//div[@align='Center']//table[1]//tbody[1]//tr[3]//td[15]//a[1]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();//to tap over cancel

	}

}
