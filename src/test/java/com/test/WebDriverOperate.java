package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverOperate extends Father {
	
	public static void main(String[] args) throws InterruptedException {
	
		openChrome("https://www.baidu.com");
		//��ʽ�ȴ�
		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		full();
//		System.out.println("��ǰ��urlΪ��"+chromeDriver.getCurrentUrl());
//		System.out.println("��ǰ�ı���Ϊ��"+chromeDriver.getTitle());
//		System.out.println("��ǰ��ҳ��Դ����Ϊ��"+chromeDriver.getPageSource());
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
