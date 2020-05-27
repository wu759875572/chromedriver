package com.test2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class NewTest {
	ChromeDriver chromeDriver;

	@Test
	public void OpenBaidu() throws InterruptedException {
		chromeDriver.get("https://www.baidu.com");
		chromeDriver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("²ÆÂ·");
		Thread.sleep(1000);
		chromeDriver.findElement(By.xpath("//*[@id=\"su\"]")).click();
		Thread.sleep(1000);
		chromeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[3]/div[1]/h3/a")).click();;
		
		Set<String> handles = chromeDriver.getWindowHandles();
		System.out.println (handles.size ()); 
		Object[] aa = handles.toArray();
		chromeDriver.switchTo().window(aa[1].toString());
		System.out.println (handles);
		
		WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, 5);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__layout\"]/div/section/div/div[4]/div/section[4]/ul/li[3]/a")));
		chromeDriver.findElement(By.xpath("//*[@id=\"__layout\"]/div/section/div/div[4]/div/section[4]/ul/li[3]/a")).click();
		
		Set<String> aaaa = chromeDriver.getWindowHandles();
		System.out.println (aaaa.size ()); 
		Object[] bb = aaaa.toArray();
		System.out.println (aaaa);
		chromeDriver.switchTo().window(bb[2].toString());
		
		
		Thread.sleep(10000);

	}

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

		chromeDriver = new ChromeDriver();

		chromeDriver.manage().window().maximize();
	}

	@AfterClass
	public void afterClass() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chromeDriver.quit();
	}

}
