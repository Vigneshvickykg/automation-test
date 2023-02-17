package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
	

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement element = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
		Select selectProfile = new Select(element);
		selectProfile.selectByVisibleText("Myself");
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Vignesh");
		driver.findElement(By.xpath("//input[@id='gendermale']")).click();
		WebElement findElement = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
		Select selectDate = new Select(findElement);

		selectDate.selectByVisibleText("8");
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));

		Select selectMonth = new Select(findElement2);

		selectMonth.selectByVisibleText("July");
		WebElement findElement3 = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));

		Select selectYear = new Select(findElement3);

		selectYear.selectByVisibleText("2001");

		WebElement findElement4 = driver.findElement(By.xpath("//select[@id='RELIGION']"));

		Select selectReligion = new Select(findElement4);

		selectReligion.selectByVisibleText("Hindu");
		WebElement tougue = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));

		Select selectTougue = new Select(tougue);

		selectTougue.selectByVisibleText("Tamil");
		WebElement findElement5 = driver.findElement(By.xpath("//select[@id='COUNTRY']"));

		Select selectCountry = new Select(findElement5);

		selectCountry.selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("63696768777");
		
	    driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("automation@gmail.com");

	

		driver.close();
	}
}
	

	
		