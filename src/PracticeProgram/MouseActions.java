package PracticeProgram;
//thses chrome version is not support for these program these only supports shift,alter and control not for tab
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;

public class MouseActions {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Actions action=new Actions(driver);
	action.keyDown(Keys.TAB);
	action.keyUp(Keys. TAB);
	action.build().perform();
	
	action.keyDown(Keys.RETURN);
	action.keyUp(Keys.RETURN);
	action.build().perform(); 
	
	  
}
}
