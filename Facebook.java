package homeAssignmentWeek2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sharon");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Moses");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("slilycathay@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Kirsten@005");
		WebElement daydd = driver.findElement(By.id("day"));
		Select ddd = new Select(daydd);
		ddd.selectByValue("29");
		WebElement monthdd = driver.findElement(By.id("month"));
		Select mdd = new Select(monthdd);
		mdd.selectByValue("9");
		WebElement yeardd = driver.findElement(By.id("year"));
		Select ydd = new Select(yeardd);
		ydd.selectByValue("1991");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}