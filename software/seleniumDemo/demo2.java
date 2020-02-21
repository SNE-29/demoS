package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.xpath("//input[@type = 'email']"));
		user.sendKeys("Alia");
		WebElement pass = driver.findElement(By.xpath("//input[@data-testid = 'royal_email']"));
		pass.sendKeys("snehal");
		WebElement log_in = driver.findElement(By.xpath("//input[@value = 'Log In']"));
		log_in.click();
		/*WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("dhamal");
		WebElement mobileno = driver.findElement(By.placehlder aria-label("Mobile number or email address"));
		mobileno.sendKeys("dhamal");*/
		
	
		
	}
}
