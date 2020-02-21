package seleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urban {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		close.click();
		Thread.sleep(10000);

		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		for (WebElement menuname : menus) {
			String s = menuname.getText();
			System.err.println(s);

			a.moveToElement(menuname).perform();
			Thread.sleep(2000);
			List<WebElement> submenus = driver.findElements(
					By.xpath("//span[contains(.,'" + s + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for (WebElement sub : submenus) {
				System.out.println(sub.getText());

			}

		}
		/*
		 * WebElement sale =
		 * driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		 * sale.click(); List<WebElement> submenus = driver.findElements(By.
		 * xpath("//li[@class='topnav_item saleunit']/descendant::ul[@class='taxonslist']/li"
		 * )); Actions b = new Actions(driver); Thread.sleep(2000); for
		 * (WebElement submenu : submenus) {
		 * System.out.println(submenu.getText());
		 * b.moveToElement(submenu).perform();
		 * 
		 * 
		 * 
		 * WebElement login = driver.findElement(By.
		 * xpath("//a[@class='google-auth']/span[text() ='Connect']"));
		 * login.click(); Thread.sleep(10000); WebElement email =
		 * driver.findElement(By.xpath("//input[@type='email']"));
		 * email.sendKeys("snehaljagtap620@gmail.com", Keys.ENTER);
		 * Thread.sleep(10000); WebElement password =
		 * driver.findElement(By.xpath("//input[@type='password']"));
		 * password.sendKeys("snehal29", Keys.ENTER);
		 */

	}
}
