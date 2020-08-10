package AutoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FormDateTestDemo {
	/**
	 * 输入框检验方法，输入长度检测，输入数据前会双击输入框。
	 * @param webelement
	 * :传入找到元素对象;
	 * @param input
	 * :输入框的值;
	 * @param manxlenth
	 * :需求中输入框限定最大长度;
	 */
	public static void FormTestlenth(WebElement webelement,String input,int maxlenth,WebDriver driver,int number) {
	
	Actions ac = new Actions(driver);
	ac.doubleClick(webelement).perform();
	webelement.sendKeys(input);
	if(webelement.getAttribute("value").length()>maxlenth) {
		Assert.assertEquals(webelement.getAttribute("value"),input.substring(0,maxlenth));
		System.out.println(number+"号元素已通过测试");
	}else {
		Assert.assertEquals(webelement.getAttribute("value"),input);
		System.out.println(number+"号元素已通过测试");

		}
	}
}
