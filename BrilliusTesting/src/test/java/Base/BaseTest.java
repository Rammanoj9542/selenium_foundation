package Base;
import java.net.URL;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static Properties login = new Properties();
	public static Properties logout = new Properties();
	public static Properties superadmin = new Properties();
	public static Properties admin = new Properties();
	public static Properties users = new Properties();
	public static Properties users2trainee = new Properties();
	
	public static FileReader fr;
	public static FileReader fr1;
	public static FileReader fr2;
	public static FileReader fr3;
	public static FileReader fr4;
	public static FileReader fr5;
	public static FileReader fr6;
	public static FileReader fr7;
	
    @BeforeMethod
	public void setUp() throws IOException {

		
		if(driver==null) {
			//System.out.println("The path is: "+ System.getProperty("user.dir"));
			fr = new FileReader(System.getProperty("user.dir") + "/src/test/resources/Configfiles/config.properties");
			fr1 = new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\Configfiles\\locators.properties");
			fr2 = new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\Configfiles\\login.properties");
			fr3 = new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\Configfiles\\logout.properties");
			fr4 = new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\Configfiles\\superadmin.properties");
			fr5 = new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\Configfiles\\admin.properties");
			fr6 = new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\Configfiles\\users.properties");
			fr7 = new FileReader(System.getProperty("user.dir") +"\\src\\test\\resources\\Configfiles\\users2trainee.properties");
			
			prop.load(fr);
	        loc.load(fr1);
	        login.load(fr2);
	        logout.load(fr3);
	        superadmin.load(fr4);
	        admin.load(fr5);
	        users.load(fr6);
	        users2trainee.load(fr7);
	        
		}
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		    WebDriverManager.chromedriver().setup();
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--use-fake-ui-for-media-stream=1");
		    options.setHeadless(false);
		    driver = new ChromeDriver(options);
		    driver.get(prop.getProperty("testurl"));
		    driver.manage().window().maximize();
		    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		    driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}



		  else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			  
			  WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
			  driver.get(prop.getProperty("testurl"));
			  driver.manage().window().maximize();
			  driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			  driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  }
			  
		
	}
	
	@AfterMethod
    public void tearDown() {
    	
    	driver.close();
		
	}

}
