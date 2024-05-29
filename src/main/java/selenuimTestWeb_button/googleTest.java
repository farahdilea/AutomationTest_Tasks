package selenuimTestWeb_button;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; //
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; //
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
public class googleTest {
    public WebDriver driver;
    public String webURL = "https://www.google.com";
    private googlePage googlePage;

    @BeforeTest
    public void setURL() {
    driver = new ChromeDriver();
    driver.get(webURL);
    driver.manage().window().maximize();
    googlePage = new googlePage(driver);
    }

    @Test
    public void verifySearchButton() {
    googlePage.search("Selenium Tutorials");
    Assert.assertTrue(googlePage.getTitle().contains("Selenium Tutorials"));
    }

    @AfterTest
    public void endSession() {
    driver.quit();
    }
}

class googlePage {
    private WebDriver driver;
    private By searchBox = By.name("q");
    public googlePage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String keyword) {
        WebElement searchInput = driver.findElement(searchBox);
        searchInput.sendKeys(keyword);
        searchInput.sendKeys(Keys.ENTER);
    }

    public String getTitle() {
        return driver.getTitle();
    }
}

