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
 
public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("Selenium Tutorials",Keys.ENTER);
String title=  driver.getTitle();
 Assert.assertTrue(title.contains("Selenium Tutorials "));
  driver.close();	
}	
}
