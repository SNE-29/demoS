package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_over_action1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?");
		Thread.sleep(10000);
          List<WebElement> menus = driver.findElements(By.xpath("// ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menuname : menus) {
			System.out.println(menuname.getText());
			a.moveToElement(menuname).perform();
			Thread.sleep(2000);
		}
	}

}
