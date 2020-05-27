package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveTest extends Father {

	public static void main(String[] args) {
		openChrome("http://www.vcplm.com/#/");
		full();
		chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait webDriverWait = new WebDriverWait(chromeDriver,5);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[2]/div[1]/div[2]")));
		
		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[2]/div[1]/div[2]")).click();
		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/span[1]"))
				.click();;
		chromeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[1]/input")).sendKeys("759875572@qq.com");
		chromeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/input")).sendKeys("wuzhiyu123");;
		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div[4]")).click();

		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div[2]/div[1]/div[2]")).click();
		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/div/div/span")).click();
		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/div/div/ul/li[1]")).click();
		
		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[2]/div[2]/ul/li[5]")).click();
//		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div[3]/div/div[2]/div[1]/div[2]/label/img")).sendKeys("C:\\Users\\Administrator\\Desktop\\bug\\11.png");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		quit();
	}
}
