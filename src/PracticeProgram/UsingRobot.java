package PracticeProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

//AWT using java
public class UsingRobot {
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.naukri.com");

	String parent = driver.getWindowHandle();

	Set<String> allWindows = driver.getWindowHandles();

	
	for(String window:allWindows)
	{
		if(!window.equals(parent))
		{
			driver.switchTo().window(window);
			driver.close();
		}
	}
	driver.switchTo().window(parent);
	
	Robot robo=new Robot();
	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);
	
	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
}
}
