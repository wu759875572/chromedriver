package com.test3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Test5 {
	static ChromeDriver chromeDriver;
  @Test
  public void test() {
	  chromeDriver.get("http://play-test.bcbfun.com/#/index");
	  chromeDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/div[1]/input")).sendKeys("test002");
	  chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/button")).click();
	  
	  String text = chromeDriver.findElement(By.cssSelector("body > div.mint-toast.is-placemiddle > span")).getText();
	  if(text.contains("密码 不能为空。")){
		  System.out.println("true");
	  }else{
		  System.out.println("false");
	  }
	  System.out.println("=================");
	  System.out.println(text);
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
		Thread.sleep(2500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  chromeDriver.quit();
  }

}
