package com.test3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Father {
	public static ChromeDriver driver = null;

	 public static void quit(){
         try{
                 Thread.sleep(5000);
         } catch(InterruptedException e){
                 e.printStackTrace();
         }
         driver.quit();
 }
 
 public static void test(String username,String passname,String str){
         driver.get("http://play-test.bcbfun.com/#/index");
         driver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/div[1]/input")).sendKeys(username);
         driver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/div[2]/input")).sendKeys(passname);
         driver.findElement(By.xpath("//*[@id=\"_index\"]/div[2]/button")).click();
         
         //�ȴ�һ�룬�ȴ�ҳ��Ԫ�ؼ������
         try{
                 Thread.sleep(1000);
         } catch(InterruptedException e){
                 e.printStackTrace();
         }
         
//         String str = "�˺Ų����ڣ�";
         
         if("��������".equals(str)){
                 boolean flag = driver.getCurrentUrl().equals("http://play-test.bcbfun.com/#/game_index");
                 System.out.println(driver.getCurrentUrl());
                 if(flag){
                         System.out.println("ture");
                 }else {
                         System.out.println("���Բ�ͨ��");
                 }
         }else {
                 String text = driver.findElement(By.cssSelector("body > div.mint-toast.is-placemiddle")).getText();
                 
                 if(text.contains(str)){
                         System.out.println("����ͨ��");
                 }else{
                         System.out.println("���Բ�ͨ��");
                 }
                 System.out.println(text);
         }
 }
}