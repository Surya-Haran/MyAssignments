package homeAssignmentWeek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='button']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Arise");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Kirsten");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Susanna");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Susie");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("DEF");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement statedd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select statdd=new Select(statedd);
		statdd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("DEF");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("Title of the resulting page - " +title);
		driver.close();
		

	}

}