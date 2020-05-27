package com.test3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test6 {
	public static ChromeDriver chromeDriver;
	
  @Test
  public void f() {
	  chromeDriver.get("http://play-test.bcbfun.com/");
	  chromeDriver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	  chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/div[1]/input")).sendKeys("test002");
	  chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/div[2]/input")).sendKeys("aaaaaa");
	  chromeDriver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/button")).click();
	  chromeDriver.findElement(By.xpath("//*[@id=\"_game_index\"]/ul/li[2]/div")).click();
	  chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div[6]/div[1]/div[1]/div[1]")).click();
	  chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div[6]/div[1]/div[1]/div[2]/ul/li[2]/div")).click();
	  for(int i = 0;i <10;i++){
		  chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[3]/div[6]/div[1]/ul/li[1]/div/div[2]/div[2]")).click();
		 
	  }
	  
  }
  
  @BeforeTest
  public void before(){
	  System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
	  chromeDriver = new ChromeDriver();
	  chromeDriver.manage().window().maximize();
  }
  
  @AfterTest
  public void afte(){
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  chromeDriver.quit();
  }
}
