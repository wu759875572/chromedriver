package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TimeTest extends Father {
	public static void main(String[] args) throws InterruptedException {
		openChrome("https://www.feizhu.com");
		full();
		chromeDriver.findElement(By.xpath("//*[@id=\"J_FlightForm\"]/fieldset/div[3]/div/div/input"))
				.sendKeys("2020-5.5");
		quit();		
		
		openChrome("https://www.12306.cn/index/");
		full();
		chromeDriver.findElement(By.xpath("//*[@id='train_date']"))
		.sendKeys("2020-5.5");
		
		JavascriptExecutor javascriptExecutor = chromeDriver;
		javascriptExecutor.executeScript("document.getElementById(\"train_date\").removeAttribute(\"readonly\")");
		chromeDriver.findElement(By.xpath("//*[@id=\"train_date\"]")).clear();
		Thread.sleep(1000);
		chromeDriver.findElement(By.xpath("//*[@id=\"train_date\"]")).sendKeys("2020-05-05");
		Thread.sleep(5000);
		quit();	
		
	}
}
