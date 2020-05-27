package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class FristWebTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		//1¡¢´ò¿ªä¯ÀÀÆ÷
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.baidu.com");	
		
		
		chromeDriver.quit();	
	}
}
