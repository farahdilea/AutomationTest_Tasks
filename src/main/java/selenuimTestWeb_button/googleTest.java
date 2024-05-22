package selenuimTestWeb_button;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleTest {
    public	WebDriver driver;
	public String webURL="https://www.google.com";

	
	@BeforeTest
	public void setURL() {
	driver = new ChromeDriver();
	driver.get(webURL);
	driver.manage().window().maximize();
	}
		

    @Test
    public void verifySearchButton() {
	String expectedString="Selenium Tutorials";
    driver.findElement(By.name("q")).sendKeys("Selenium Tutorials",Keys.ENTER);

    }
    
    @AfterTest
    public void endSession() {
    driver.quit();		
    }
  

}