package com.test3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class Test1 {
	  public static WebDriver chromeDriver = null;
	
  @Test
  public void test1() {
	  
	  chromeDriver.get("http://play-test.bcbfun.com/#/index");
	  chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/div[1]/input")).sendKeys("test001");
	  chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/div[2]/input")).sendKeys("aaaaaa");
	  chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/button")).click();
	  
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
          boolean flag = chromeDriver.getCurrentUrl().equals("http://play-test.bcbfun.com/#/game_index");
          System.out.println(chromeDriver.getCurrentUrl());
          if(flag){
                  System.out.println("测试通过");
          }else {
                  System.out.println("测试不通过");
          }
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