import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tops-int.com/");
		driver.manage().window().maximize();
		driver.close();
	}
}
