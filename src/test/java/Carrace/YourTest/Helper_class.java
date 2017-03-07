package Carrace.YourTest;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import Auto.Homepage_inti;

public class Helper_class extends drivers implements Homepage_inti{
	
	public void launch_url(){
		driver.get(Base_url);
	}

	public void do_click(String button) {
		driver.findElement(By.id(button)).click();
		
		//Thread.sleep(5000);
	}
	
	public void send_text(String sendtext_locator, String sendtext){
		driver.findElement(By.name(sendtext_locator)).sendKeys(sendtext);
	}
	public void browser_set_up(){
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	public void assert_text(String text){
		  String Actual_Title = driver.getTitle();
		   String Expected_Title = text;
		   Assert.assertEquals(Actual_Title, Expected_Title);
	}
	public void close_browser(){
		driver.close();
	}

}
