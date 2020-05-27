package com.test4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MyTestNG {
	 private ChromeDriver driver ;

	    @Test
	    public void baidu_search() {
	    	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
	        MyPage myPage = PageFactory.initElements(driver, MyPage.class);
	        driver.get("https://www.baidu.com");
	        driver.manage().window().maximize();//窗口最大化
	        myPage.kw_sendkes("helenMemery");
	        myPage.su_click();
	    }

	    @Test
	    public void f2() {
	        Assert.assertEquals("b", "b");
	    }
	    
	    @AfterMethod
	    public void close(){
	        driver.quit();
	    }

	}
