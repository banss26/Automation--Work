import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement r1=driver.findElement(By.id("vfb-7-1"));
		WebElement r2=driver.findElement(By.id("vfb-7-2"));
		WebElement r3=driver.findElement(By.id("vfb-7-3"));
		Thread.sleep(2000);
		r1.click();
		System.out.println("Radio Button 1 Clicked");
		Thread.sleep(2000);
		r2.click();
		System.out.println("Radio Button 2 Clicked");
		Thread.sleep(2000);
		r3.click();
		System.out.println("Radio Button 3 Clicked");
		
		WebElement C1=driver.findElement(By.id("vfb-6-0"));
		WebElement C2=driver.findElement(By.id("vfb-6-1"));
		WebElement C3=driver.findElement(By.id("vfb-6-2"));
		Thread.sleep(2000);
		C1.click();
		System.out.println("Checkbox 1 checked");
		Thread.sleep(2000);
		C2.click();
		System.out.println("Checkbox 2 checked");
		Thread.sleep(2000);
		C3.click();
		System.out.println("Checkbox 3 checked");
		Thread.sleep(2000);
		C1.click();
		System.out.println("Checkbox 1 Unchecked");
		Thread.sleep(2000);
		C2.click();
		System.out.println("Checkbox 2 Unchecked");
		Thread.sleep(2000);
		C3.click();
		System.out.println("Checkbox 3 Unchecked");
		Thread.sleep(2000);
driver.close();
		

		

		
		
	}
}
