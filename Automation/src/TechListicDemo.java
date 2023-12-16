import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TechListicDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("bansri");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("kapadia");
		Thread.sleep(2000);
		driver.findElement(By.id("sex-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("exp-0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).sendKeys("12-12-2012");
		Thread.sleep(2000);
		driver.findElement(By.id("profession-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tool-2")).click();
		Thread.sleep(2000);
		Select continents=new Select(driver.findElement(By.name("continents")));
		continents.selectByVisibleText("Australia");
		Thread.sleep(2000);
		
		driver.close();
	}
}