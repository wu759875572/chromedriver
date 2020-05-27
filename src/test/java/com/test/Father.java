package com.test;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class Father {
	
	public static ChromeDriver chromeDriver;
	public static JavascriptException javascriptException;
	
	public static void openChrome(String url){
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		//1¡¢´ò¿ªä¯ÀÀÆ÷
		chromeDriver = new ChromeDriver();
		
		chromeDriver.get(url);	
	}
	
	public static void quit(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chromeDriver.quit();
	}
	
	public static void full(){
		Options options = chromeDriver.manage();
		options.window().maximize();
	}
	
	public static void tourl(String url){
		Navigation navigation = chromeDriver.navigate();
		navigation.to(url);
	}
}
