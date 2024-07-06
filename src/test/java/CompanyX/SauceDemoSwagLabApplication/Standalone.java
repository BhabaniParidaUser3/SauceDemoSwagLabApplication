package CompanyX.SauceDemoSwagLabApplication;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CartPage;

public class Standalone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-autofill");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		HashMap<Integer, String> usernames = new HashMap<Integer, String>();
		usernames.put(0, "standard_user:secret_sauce");
		usernames.put(1, "locked_out_user:secret_sauce");
		usernames.put(2, "problem_user:secret_sauce");
		usernames.put(3, "performance_glitch_user:secret_sauce");
		usernames.put(4, "error_user:secret_sauce");
		usernames.put(5, "visual_user:secret_sauce");

		for (int i = 0; i < usernames.size(); i++) {
			String Idpwd = usernames.get(i);
			String[] useridpwd = Idpwd.split(":");
			System.out.println(useridpwd[0]);
			System.out.println(useridpwd[1]);
			driver.findElement(By.cssSelector("#user-name")).sendKeys(useridpwd[0]);
			driver.findElement(By.cssSelector("#password")).clear();
			driver.findElement(By.cssSelector("#password")).sendKeys(useridpwd[1]);
			driver.findElement(By.cssSelector("#login-button")).click();
			if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
				driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			} else {
				driver.findElement(By.cssSelector(".error-button")).click();
				driver.findElement(By.cssSelector("#user-name")).clear();
				driver.findElement(By.cssSelector("#password")).clear();
			}

		}

		driver.quit();

	}

}
