package PracticeProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shutterfly.com/");	
		
		// close popup
		driver.findElement(By.xpath("//span[@class='overlay-modal-close']")).click();
				
      JavascriptExecutor js = (JavascriptExecutor) driver;	
		js.executeScript("window.scrollBy(0,2900)");
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"fblikeBox\"]")));
	}

}
