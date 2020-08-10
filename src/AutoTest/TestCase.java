package AutoTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 用于实训平台的自动化脚本;
 * 模块分类：课程资源;
 * 版本：v1.1;
 * @author 张宸铖
 *
 */
public class TestCase     {
	 private static WebDriver driver;

	@BeforeClass
	private static void setUp() {
		System.setProperty("webdriver.chrome.driver", "G:\\关于自动化\\selenium网页自动化测试环境\\服务端\\谷歌Driver\\chromedriver.exe");
		driver = new ChromeDriver(); 
		} 
	@AfterClass
	public static void tearDown() throws InterruptedException  {
		Thread.sleep(3000);
//		driver.quit();	
	}	
		/**
		 * 积分规则自动化测试用例
		 * @throws InterruptedException
		 */
		@Test
		public void ScoreRlueTestCase() throws InterruptedException {	
			Thread.sleep(2000);

			//测试环境地址
			driver.get("http://10.18.3.10:7070");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"frame_box\"]/header/header/div/span/span[2]")).click();
			Thread.sleep(1000);
			//找到登录框对象
			WebElement username = driver.findElement(By.xpath("//*[@id=\"frame_box\"]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/p[1]/div/input"));      
			username.click();
//			username.sendKeys("admin2cc");//学生账号
			username.sendKeys("contestadmin");//商城权限账号
			//找到密码框输入对象
			WebElement password = driver.findElement(By.xpath("//*[@id=\"frame_box\"]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/p[2]/div/input"));
			password.click();
//			password.sendKeys("123456");//学生密码
			password.sendKeys("123456abc");//商城权限密码
			//点击登录
			driver.findElement(By.xpath("//*[@id=\"frame_box\"]/div[1]/div[1]/div[2]/div[2]")).click();
			//点击后台管理
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"frame_box\"]/header/header/div/span/span[2]/span")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.linkText("设置")).click();
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("scrollTo(0,4000)");
			
		    Thread.sleep(2000);
			List<WebElement> xpathlist = DateDrivern.ScoreRuleXpath(driver);
			for(int i = 0 ; i<=xpathlist.size()-1;i ++ ) {
				Thread.sleep(1000);
				FormDateTestDemo.FormTestlenth(xpathlist.get(i), "1111111111111", 11, driver,i);
				driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[2]/button[2]/span")).click();
				Thread.sleep(1000);
				
			}
//			
		}
	
}