import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//String data=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/h4[1]")).getText();
		String data=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div")).getText();
		System.out.println(data);
		Thread.sleep(2000);
		driver.close();
		
	}
}
