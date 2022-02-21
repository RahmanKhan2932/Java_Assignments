package week2_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart_Register {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@class='form-group']//child::input")).sendKeys("rahman2932");
		driver.findElement(By.xpath("//*[@class=\"form-group required\"]//child::input")).sendKeys("Rahman");
		driver.findElement(By.xpath("//*[@class=\"control-label\"]//following::input[2]")).sendKeys("Khan");
		driver.findElement(By.xpath("//*[@class=\"control-label\"]//following::input[3]")).sendKeys("rahaman2932@gmail.com");
		WebElement country = driver.findElement(By.xpath("//*[@class=\"form-group required\"]//child::select"));
		Select countr=new Select(country);
		countr.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@class=\"form-group\"][3]//child::input")).sendKeys("aswelk");
		//driver.close();

	}

}
