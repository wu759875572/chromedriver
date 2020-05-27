package com.test2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.tree.ExpandVetoException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	public static ChromeDriver chromeDriver;
	
	public static void openChrome(String url){
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.get(url);
	}
	
	public static void quit(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chromeDriver.quit();
	}
	
	public static void main(String[] args) {
		openChrome("http://play-test.bcbfun.com/#/index");
		chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		chromeDriver.findElement(By.xpath("//*[@id='_index']/div[2]/div[1]/input")).sendKeys("test002");
		chromeDriver.findElement(By.xpath("//*[@id='_index']/div[2]/div[2]/input")).sendKeys("aaaaaa");
		chromeDriver.findElement(By.xpath("//*[@id='_index']/div[2]/button")).click();
		
		WebDriverWait webDriverWait = new WebDriverWait(chromeDriver,5);
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_game_index\"]/ul/li[1]")));
		chromeDriver.findElement(By.xpath("//*[@id=\"_game_index\"]/ul/li[1]")).click();

//		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[4]/img[2]")));
//		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[4]/img[2]")).click();
		for(int i=0;i<100;i++){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[4]/img[2]")).click();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			chromeDriver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("我要赢，我要赢");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div/div/div[2]/img")).click();;
		}
		
		//实例化Actions
//		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[4]/div/span")).click();
//		boolean a = true;
//		if(a)
//		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div/div/ul/li[1]/div[2]")).click();
//		else
//		chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div/div/ul/li[2]/div[2]")).click();
//		quit();
	}
}
