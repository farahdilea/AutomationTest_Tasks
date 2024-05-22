package selenuimTestWeb_button;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleTest {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
Thread.sleep(1000);

WebElement searchButton = driver.findElement(By.name("btnK"));
searchButton.click();
Thread.sleep(1000);
driver.close();	
}	
}