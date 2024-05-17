package homeAssignmentWeek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='button']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Kirsten");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industrydd = driver.findElement(By.name("industryEnumId"));
		Select idd=new Select(industrydd);
		idd.selectByIndex(3);
		WebElement ownershipdd = driver.findElement(By.name("ownershipEnumId"));
		Select odd=new Select(ownershipdd);
		odd.selectByVisibleText("S-Corporation");
		WebElement sourcedd = driver.findElement(By.name("dataSourceId"));
		Select sdd=new Select(sourcedd);
		sdd.selectByValue("LEAD_EMPLOYEE");
		WebElement marketingdd = driver.findElement(By.name("marketingCampaignId"));
		Select mdd=new Select(marketingdd);
		mdd.selectByIndex(6);
		WebElement statedd = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stdd=new Select(statedd);
		stdd.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String text = driver.findElement(By.xpath("//span[contains(text(),'Kirsten')]")).getText();
		if (text.contains("Ki")) {
			System.out.println("Account name is displayed correctly");
		}
		else {
			System.out.println("Account name is not displayed correctly");
		}
		driver.close();
		
	}

}