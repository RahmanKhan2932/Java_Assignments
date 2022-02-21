package week2_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce_CRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.findElement(By.name("UserFirstName")).sendKeys("Sam");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Nohara");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("samnohara2932@example.com");

		WebElement dropdown1 = driver.findElement(By.name("UserTitle"));
		Select ele = new Select(dropdown1);
		ele.selectByIndex(1);

		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");

		WebElement dropdown2 = driver.findElement(By.name("CompanyEmployees"));
		Select ele2 = new Select(dropdown2);
		ele2.selectByIndex(2);

		driver.findElement(By.name("UserPhone")).sendKeys("9876521436");
		driver.findElement(By.className("checkbox-ui")).click();

	}

}
