package com.test3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
        public static WebDriver driver = null;
        public static void init(){
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
                driver = new ChromeDriver();
        }
        
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
                
                //等待一秒，等待页面元素加载完毕
                try{
                        Thread.sleep(1000);
                } catch(InterruptedException e){
                        e.printStackTrace();
                }
                
//                String str = "账号不存在！";
                
                if("正向用例".equals(str)){
                        boolean flag = driver.getCurrentUrl().equals("http://play-test.bcbfun.com/#/game_index");
                        System.out.println(driver.getCurrentUrl());
                        if(flag){
                                System.out.println("ture");
                        }else {
                                System.out.println("测试不通过");
                        }
                }else {
                        String text = driver.findElement(By.cssSelector("body > div.mint-toast.is-placemiddle")).getText();
                        
                        if(text.contains(str)){
                                System.out.println("测试通过");
                        }else{
                                System.out.println("测试不通过");
                        }
                        System.out.println(text);
                }
        }
        
        public static void main(String[] args) throws Exception {
        		init();
        	
//                test("00","00","账号不存在");
//                driver.navigate().refresh();
//                
//                
//                test("test001","00","密码错误");
//                driver.navigate().refresh();
//               
//                
//                test("","","账号 不能为空");
//                driver.navigate().refresh();
               
                
                test("test001","aaaaaa","正向用例"); 
                quit();
        }
}
