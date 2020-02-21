package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick_FB {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Actions a = new Actions(driver);
	
	WebElement LOGIN = driver.findElement(By.xpath("//input[@value='Log In']"));
	a.contextClick(LOGIN).perform();
	


}
}

