package PracticeProgram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowProgram {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
        WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com");

		String parent = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {

			if (window.equals(parent)) {
				System.out.println("Do nothing");
			} else {
				driver.switchTo().window(window);
				System.out.println("closing" + driver.getTitle());
				driver.close();
			}

		}		
		
		 driver.switchTo().window(parent);
		 driver.findElement(By.xpath("//input[@value='Register with us']")).click();
		 }
}