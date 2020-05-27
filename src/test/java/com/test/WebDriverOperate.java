package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverOperate extends Father {
	
	public static void main(String[] args) throws InterruptedException {
	
		openChrome("https://www.baidu.com");
		//隐式等待
		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		full();
//		System.out.println("当前的url为："+chromeDriver.getCurrentUrl());
//		System.out.println("当前的标题为："+chromeDriver.getTitle());
//		System.out.println("当前网页的源代码为："+chromeDriver.getPageSource());
		chromeDriver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("bilibili");
//		Thread.sleep(2000);
		chromeDriver.findElement(By.xpath("//*[@id=\"su\"]")).click();
		chromeDriver.findElement(By.xpath("//*[@id=\"1\"]/h3/a[1]")).click();
//		Thread.sleep(2000);
//		chromeDriver.close();
		tourl("https://www.jd.com");
		
		
		quit();
		
	}

}
