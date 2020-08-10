package AutoTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 每一个模块的数据驱动
 * @author yidaoyun
 *
 */
public class DateDrivern    {
	/**
	 * 
	 * @param driver
	 * @return 返回v3.0-4.2-积分规则输入框的xpath
	 */
	public static List ScoreRuleXpath(WebDriver driver) {
		List<WebElement> xpathlist = new ArrayList<WebElement>();
		//新手任务-注册
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[1]/form/div[1]/div/div[1]/div/div/p/input")));
		//新手任务-完善个人资料
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[1]/form/div[1]/div/div[2]/div/div/p/input")));
		
		//日常任务-每日登录一道云平台
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[1]/form/div[2]/div[1]/div[1]/div/div/p/input")));
		//日常任务-每提交一份实验报告
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[1]/form/div[2]/div[1]/div[2]/div/div/p/input")));
		//日常任务-连续七天登录一道云平台
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[1]/form/div[2]/div[2]/div[1]/div/div/p/input")));
		//日常任务-当天实验时长达到三小时
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[1]/form/div[2]/div[2]/div[2]/div/div/p/input")));
		//日常任务-连续七天实验时长超过一小时
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[1]/form/div[2]/div[3]/div[1]/div/div/p/input")));
		//日常任务-连续七天理论学习时长超过一小时
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[1]/form/div[2]/div[3]/div[2]/div/div/p/input")));
		
		//比赛-外部赛-报名参赛
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[2]/div[1]/div/div/p/input")));
		//比赛-外部赛-成功邀请好友参赛比赛
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[3]/div[1]/div/div/p/input")));
		//比赛-外部赛-第一名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[4]/div[1]/div/div/p/input")));
		//比赛-外部赛-第二名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[5]/div[1]/div/div/p/input")));
		//比赛-外部赛-第三名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[6]/div[1]/div/div/p/input")));
		//比赛-外部赛-第四到十名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[7]/div[1]/div/div/p/input")));
		//比赛-外部赛-第十一到五十名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[8]/div[1]/div/div/p/input")));
		//比赛-外部赛-第五十一到一百名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[8]/div[2]/div/div/p/input")));
		
		//比赛-内部赛-第一名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[2]/div[2]/div/div/p/input")));
		//比赛-内部赛-第二名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[3]/div[2]/div/div/p/input")));
		//比赛-内部赛-第三名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[4]/div[2]/div/div/p/input")));
		//比赛-内部赛-四到十名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[5]/div[2]/div/div/p/input")));
		//比赛-内部赛-十一到五十名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[6]/div[2]/div/div/p/input")));
		//比赛-内部赛-五十一到一百名
		xpathlist.add(driver.findElement(By.xpath("//*[@id=\"content-side\"]/div[1]/div[1]/div[2]/form/div/div[7]/div[2]/div/div/p/input")));
		//注册输入框
	
		return xpathlist;
		}
	}
		

