import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard_Events {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement Flights=driver.findElement(By.linkText("Flights"));
		WebElement hotels=driver.findElement(By.linkText("Hotels"));
		Actions action=new Actions(driver);
		
		Action click_home=action.moveToElement(home).build();
		click_home.perform();
		Thread.sleep(2000);
		
		Action click_Flights=action.moveToElement(Flights).build();
		click_Flights.perform();
		Thread.sleep(2000);
		
		Action click_hotels=action.moveToElement(hotels).build();
		click_hotels.perform();
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
