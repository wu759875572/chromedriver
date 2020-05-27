package com.test;

import org.openqa.selenium.By;

public class SelectTest extends Father {
	
	public static void main(String[] args) throws InterruptedException {
		openChrome("https://www.baidu.com");
		full();
		Thread.sleep(1000);
		chromeDriver.findElement(By.xpath("//*[@id=\"s-usersetting-top\"]")).click();
		chromeDriver.findElement(By.xpath("//*[@id=\"s-user-setting-menu\"]/div/a[2]")).click();;
		Thread.sleep(2000);
		chromeDriver.findElement(By.xpath("//*[@id=\"adv-setting-gpc\"]/div/div[1]/i[1]")).click();
		chromeDriver.findElement(By.xpath("//*[@id=\"adv-setting-gpc\"]/div/div[2]/div[2]/p[2]")).click();
		Thread.sleep(1000);
		
		chromeDriver.findElement(By.xpath("//*[@id=\"adv-setting-ft\"]/div/div[1]")).click();
		chromeDriver.findElement(By.xpath("//*[@id=\"adv-setting-ft\"]/div/div[2]/div[2]/p[3]")).click();
		Thread.sleep(1000);
		
		chromeDriver.findElement(By.xpath("//*[@id=\"adv_keyword\"]")).sendKeys("java");
		Thread.sleep(1000);
		
		chromeDriver.findElement(By.xpath("//*[@id=\"adv-setting-8\"]/input")).click();
		quit();
	}
}
