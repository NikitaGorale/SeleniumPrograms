package PracticeProgram;
//to take screen shot for attachment for proof

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.util.Set;

import javax.imageio.ImageIO;



//import com.gargoylesoftware.htmlunit.javascript.host.file.File;

//import com.gargoylesoftware.htmlunit.javascript.host.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotMethod {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {
			if (!window.equals(parent)) {
				driver.switchTo().window(window);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Rectangle rect = new Rectangle();
		rect.setRect(0, 0, 800, 300);
		Robot robo = new Robot();
		BufferedImage image = robo.createScreenCapture(rect);
		File destFile= new File( "C:\\Users\\Santosh\\Desktop\\screenshot\\Second.png");
		
		
          ImageIO.write(image, "png",destFile );
		
		driver.close();
		driver.quit();
		
	}
}
