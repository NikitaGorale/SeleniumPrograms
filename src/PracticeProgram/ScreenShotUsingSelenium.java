package PracticeProgram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotUsingSelenium {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.testingshastra.com/"); 
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
	   File scr=ts.getScreenshotAs(OutputType.FILE);
	     
	   FileUtils.copyFile(scr, new File("C:\\Users\\Santosh\\Desktop\\screenshot\\first.jpg"));
	}

}
