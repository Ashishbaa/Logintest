package day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logintest {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.gecko.driver","/home/student/Desktop/st118_rasikaselenium/basicseleium/geckodriver");
		
		WebDriver wd = new FirefoxDriver();
		wd.get("https://testffc.nimapinfotech.com/auth/login");
		wd.findElement(By.id("mat-input-0")).sendKeys("8976103228");//user
		wd.findElement(By.id("mat-input-1")).sendKeys("Ashish@1234");//pass
        wd.findElement(By.xpath("//*[@id=\"kt_login_signin_submit\"]")).click();//signin
        //we cannot validate Captcha using Selenium
        wd.findElement(By.xpath("/html/body/kt-auth/div/div/div[2]/kt-login/div[2]/div/form/div[4]/a")).click();
        
		

	}

}
