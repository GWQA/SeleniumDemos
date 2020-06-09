package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FTSE100Test {

	WebDriver driver;

	@Before
	public void init() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void create() {
		driver.manage().window().maximize();
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");

		WebElement cookies = driver.findElement(By.xpath("//*[@id=\"cookie-policy-overlay\"]/div/a[2]"));
		cookies.click();

		WebElement riser = driver.findElement(By.xpath("//*[@id=\"view-constituents\"]/ul/li[2]/a/strong"));
		riser.click();

		WebElement getrise = driver.findElement(By.xpath("//*[@id=\"ls-row-AVV-L\"]/td[2]/a"));
		System.out.println("Top Riser is: " + getrise.getAttribute("title").replace("View equity details for", ""));

		WebElement faller = driver.findElement(By.xpath("//*[@id=\"content_div_40583\"]/ul/li[3]/a/strong"));
		faller.click();

		WebElement getfall = driver.findElement(By.xpath("//*[@id=\"ls-row-ICP-L\"]/td[2]/a"));
		System.out.println("Top Faller is: " + getfall.getAttribute("title").replace("View equity details for", ""));
	}
}
