package com.qa.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteTest {

	WebDriver driver;

	@Before
	public void init() {
		driver = new ChromeDriver();
	}

	@Test
	public void Usertest() {
		driver.manage().window().maximize();
		driver.get("https://www.thedemosite.co.uk/addauser.php");

		WebElement advance = driver.findElement(By.xpath("//*[@id=\"details-button\"]"));
		advance.click();

		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"proceed-link\"]"));
		proceed.click();

		WebElement username = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		username.sendKeys("User123");

		WebElement password = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		password.sendKeys("Pass123");

		WebElement save = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		save.click();
	}

	@Test
	public void LoginTest() {
		driver.manage().window().maximize();
		driver.get("https://www.thedemosite.co.uk/login.php");

		WebElement advance = driver.findElement(By.xpath("//*[@id=\"details-button\"]"));
		advance.click();

		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"proceed-link\"]"));
		proceed.click();

		WebElement user = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		user.sendKeys("User123");

		WebElement pass = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		pass.sendKeys("Pass123");

		WebElement login = driver.findElement(By.xpath(
				"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		login.click();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
