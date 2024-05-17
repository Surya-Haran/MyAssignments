package homeAssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Click']")).click();
        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().back();
        boolean enabled = driver.findElement(By.xpath("(//div[@class='card']/button)[2]")).isEnabled();
        System.out.println("Is the button enabled? " +enabled);
        Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
        System.out.println(location);
        String bg = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
        System.out.println(bg);
        String Hex = Color.fromString(bg).asHex();
        System.out.println(Hex);
        Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getSize();
        System.out.println(size);
        driver.close();
	}

}