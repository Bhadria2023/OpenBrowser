package practiceOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChrome {
	public void getDriver() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//[@id='APjFqb']")).click();
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Bhadria Tabassum");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='gLFyf']")).click();
		//driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		OpenChrome obj=new OpenChrome();
		obj.getDriver();
		
	}
	

}
