package homeAssignmentWeek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='button']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(5000);
	    WebElement firstlead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	    String text = firstlead.getText();
		System.out.println("Lead ID of the first resulting lead: " +text);
		firstlead.click();
		 driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		 driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		 driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 String searchresult = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		 if (searchresult.equalsIgnoreCase("No records to display")) {
			System.out.println("Deleted Lead successfully");
		} else {
			System.out.println("Lead not deleted");
		}
		 driver.close();
		 

	}

}