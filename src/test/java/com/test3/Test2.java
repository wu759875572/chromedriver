package com.test3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
	public static ChromeDriver chromeDriver;
	
	  @Test
	  public void f() {
		  chromeDriver.get("http://play-test.bcbfun.com/#/index");
		  chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/div[1]/input")).sendKeys("test001");
		  chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/div[2]/input")).sendKeys("aaaaaaa");
		  chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/button")).click();
		  
		 
              String text = chromeDriver.findElement(By.cssSelector("body > div.mint-toast.is-placemiddle > span")).getText();
              
              
              if(text.contains("密码错误")){
                      System.out.println("测试通过");
              }else{
                      System.out.println("测试不通过");
              }
//              text.contains("密码错误");
              System.out.println("=====================");
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
