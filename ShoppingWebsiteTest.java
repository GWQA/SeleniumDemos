package com.qa.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingWebsiteTest {

	WebDriver driver;

	@Before
	public void init() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void SearchTest() {
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		WebElement searchBar = driver.findElement(By.id("search_query_top"));
		searchBar.sendKeys("Dress");
		searchBar.sendKeys(Keys.ENTER);

		WebElement searchBar2 = driver.findElement(By.id("search_query_top"));
		assertEquals("Dress", searchBar2.getAttribute("value"));

		WebElement dress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]"));
		dress.click();

		WebElement add = driver.findElement(By.id("add_to_cart"));
		add.click();

		WebElement proceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		proceed.click();

		WebElement proceed2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		proceed2.click();

		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("robotorobert1@gmail.com");
		email.sendKeys(Keys.ENTER);
	}

}
