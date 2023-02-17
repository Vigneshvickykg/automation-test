package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		// launch the site

		driver.get("https://uibank.uipath.com/register-account");

		// max the size

		driver.manage().window().maximize();

		// apply implicitly wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		// enter your name

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vignesh");

		// select your title

		WebElement title = driver.findElement(By.xpath("//select[@id='title']"));

		Select selectTitle = new Select(title);

		selectTitle.selectByVisibleText("Mr");

		// enter your initial

		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("v");

		// enter your last name

		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("bhavan");

		// select gender

		WebElement gender = driver.findElement(By.xpath("//select[@id='sex']"));

		Select selectGender = new Select(gender);

		selectGender.selectByVisibleText("Male");

		// select employment status

		WebElement status = driver.findElement(By.xpath("//select[@id='employmentStatus']"));

		Select selectStatus = new Select(status);

		selectStatus.selectByVisibleText("Full-time");

		// enter your username

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ggygs");

		// enter your email

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("manual@gmail.com");

		// enter password

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hihjsklans");

		// close the browser

		driver.close();
	}

}
