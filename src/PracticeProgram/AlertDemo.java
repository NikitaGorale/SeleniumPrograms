package PracticeProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.testingshastra.com/");
		driver.findElement(By.xpath("//*[@id=\"menu-item-354\"]/a")).click();
		driver.findElement(By.xpath("//a")).click();
	driver.findElement(By.xpath("//*[@id=\"user\"]")).sendKeys("nikita");
		driver.findElement(By.xpath("/html/body/button")).click();
		
	Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("");
		
	}

}
