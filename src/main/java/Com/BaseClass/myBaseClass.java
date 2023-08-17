package Com.BaseClass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class myBaseClass {
	
	public static WebDriver driver;
	public static WebDriver browser(String WebBrowser) {
		if (WebBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\WINDOWS\\eclipse-workspace\\Project_1\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if (WebBrowser.equalsIgnoreCase("msedge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\WINDOWS\\eclipse-workspace\\Project_1\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
			
		return driver;		
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void uname(WebElement element, String name) {		
			element.sendKeys(name);					
	}
	public static void pass (WebElement element, String pwd) {		
			element.sendKeys(pwd);		
	}
	public static void Login(WebElement element) {		
			element.click();		
	}
	
	public static void drop (WebElement locator, String type,String value) {
		Select down = new Select (locator);
		if (type.equals("byValue")) {
			down.selectByValue(value);
		}
		else if (type.equals("byIndex")) {
			int parseInt = Integer.parseInt(value);
			down.selectByIndex(parseInt);
		}
		else if (type.equals("byVisibletext")) {
			down.selectByVisibleText(value);
		}
	}
	
	public static void alert(String type, String input) {
		if (type.equals("accept")) {
			driver.switchTo().alert().accept();
		}
		
		else if (type.equals("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
		
		else if (type.equals("Sendkeys")) {
			driver.switchTo().alert().sendKeys(input);
		}
	}
	
	public static void frame(int index) {
		driver.switchTo().frame(index);
	}
	
	public static void navigate_to(String url) {
		driver.navigate().to(url);;
	}
	
	public static void navigate_back() {
		driver.navigate().back();
	}
	
	public static void navigate_forward() {
		driver.navigate().forward();
	}

	public static void navigate_refresh() {
		driver.navigate().refresh();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void quite() {
		driver.quit();
	}
	
	public static void robot (String type) throws AWTException {
		
		Robot r = new Robot ();
		if (type.equals("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		else if (type.equals("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		else if (type.equals("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	}
	
	public static TakesScreenshot screenshot (String path) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dist = new File (path);
		FileUtils.copyDirectory(src, dist);
		return ss;
		
	}
	
	public static void action () {
		//Action act = new Action(driver);
	}

}
















