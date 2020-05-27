package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementOperate {
	
	public static ChromeDriver chromeDriver;	
	
	public static void main(String[] args) throws InterruptedException {
		openChrome();
		
		WebElement webElement1 = chromeDriver.findElement(By.id("kw"));
		System.out.println("得到元素的标签名："+webElement1.getTagName());
		System.out.println("得到元素的maxlength属性："+webElement1.getAttribute("maxlength"));
		WebElement webElement2 = chromeDriver.findElement(By.xpath("//*[@id=\"s-top-left\"]/a[2]"));
		System.out.println("得到元素的文本值："+webElement2.getText());
		System.out.println("元素是否显示："+webElement2.isDisplayed());
		
		chromeDriver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("123456");
		Thread.sleep(3000);
		chromeDriver.findElement(By.xpath("//*[@id=\"kw\"]")).clear();
		quit();
	}
	
	public static void openChrome(){
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		//1、打开浏览器
		chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.baidu.com");	
	}
	
	public static void quit(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chromeDriver.quit();
	}
}
