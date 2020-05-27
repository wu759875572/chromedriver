package com.test3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	public static ChromeDriver chromeDriver;
	
  @Test
  public void f() {
	  chromeDriver.get("http://play.bcbfun.com/");
	  
	  boolean flag = chromeDriver.getCurrentUrl().equals("http://play-test.bcbfun.com/#/game_index");
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
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  chromeDriver.quit();
  }

}
