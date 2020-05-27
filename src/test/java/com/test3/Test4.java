package com.test3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test4 {
	static ChromeDriver chromeDriver = null;
	
	@Test
	public void test(){
		chromeDriver.get("http://play-test.bcbfun.com/#/index");
		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/button")).click();
		
		String text = chromeDriver.findElement(By.cssSelector("body > div.mint-toast.is-placemiddle > span")).getText();
		if(text.contains("账号 不能为空。")){
			System.out.println("测试通过");
		}else{
			System.out.println("测试不通过");
		}
		System.out.println("======================");
		System.out.println(text);
	}
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
	}
	
	@AfterClass
	public void afterClass(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chromeDriver.quit();
	}
}
