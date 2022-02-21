package week2_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Signup {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rahman");
		driver.findElement(By.name("lastname")).sendKeys("Khan");
		driver.findElement(By.name("reg_email__")).sendKeys("8563325987");
		driver.findElement(By.name("reg_passwd__")).sendKeys("ragu@2000");
		
		WebElement day = driver.findElement(By.id("day"));
		Select index = new Select(day);
		index.selectByIndex(3);
		
		WebElement month = driver.findElement(By.id("month"));
		Select kambu = new Select(month);
		kambu.selectByVisibleText("Apr");
		
		WebElement year = driver.findElement(By.id("year"));
		Select sombu = new Select(year);
		sombu.selectByValue("2000");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		//kumbi.findElement(By.name("websubmit")).click();
	}

}
