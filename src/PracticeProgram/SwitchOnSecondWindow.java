package PracticeProgram;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchOnSecondWindow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		Set<String>allwindow=driver.getWindowHandles();
		ArrayList<String> list=new ArrayList<String>(allwindow);
		for(int i=0;i<list.size();i++)
		{
			if(i==2)
			{
				driver.switchTo().window(list.get(i));
				System.out.println( "Switch to"+driver.getTitle());
				driver.close();
			}
		}
	
		driver.switchTo().window(parent);
	}
}