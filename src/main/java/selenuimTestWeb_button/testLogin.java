package selenuimTestWeb_button;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.firefox.FirefoxDriver;
public class testLogin {
    public WebDriver driver;
    public String webURL = "https://github.com/login";
   
    @Parameters("browserName")
	@BeforeTest
    public void setup(  String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			   driver = new ChromeDriver();	
		}
		if(browserName.equalsIgnoreCase("firefox")) {
			//C:\Drivers\geckodriver.exe
			  System.setProperty("webdriver.gecko.driver", "C:/Drivers/geckodriver.exe");
	           driver = new FirefoxDriver();	
		}
		if(browserName.equalsIgnoreCase("edge")) {
			//C:\Drivers\msedgedriver.exes
			  System.setProperty("webdriver.edge.driver", "C:/Drivers/msedgedriver.exe");
		       driver = new EdgeDriver();	
         }
 
    driver.get(webURL);
    driver.manage().window().maximize();
 
    }
	
    @Test(dataProvider="create" ,priority = 1)
    
    public void verifyLogin(String username, String password) {
    driver.findElement(By.id("login_field")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.name("commit")).click();

     }
    
    @AfterTest
    public void endSession() {
    driver.close();		
    }
  	
	
	@DataProvider(name= "create")
	public Object[][] dataSet1(){
	 return new Object[][] {
			{"asaltest19@gmail.com","123456789s*"},
			{"asaltest1646449@gmail.com","123456789s*"},
			{"asaltest19@gmail.com","123456789sgg"},
			{"",""}
		};
		
	}
	
	public class Login {
	    private WebDriver driver;
	    private By usernameField = By.id("login_field");
	    private By passwordField = By.id("password");
	    private By loginButton = By.name("commit");

	    public Login(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterField(String username, String password) {
	        driver.findElement(usernameField).sendKeys(username);
	        driver.findElement(passwordField).sendKeys(password);
	    }


	    public void clickButton() {
	        driver.findElement(loginButton).click();
	    }

	    public void login(String username, String password) {
	    	enterField(username, password);
            clickButton();
	    }
	}
	

}