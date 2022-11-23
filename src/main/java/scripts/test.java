package scripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class test extends BaseClass {
	//Health_Care
	@Test
	public void tc3() throws IOException, InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Enter_Name = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpName']"));
		Enter_Name.sendKeys("sohel&*");
		
		WebElement Enter_email_address = driver.findElement(By.xpath("//input[@id='outlined-size-small signUpEmail']"));
		Enter_email_address.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement Phone = driver.findElement(By.xpath("//div[@class='react_phneInput PhoneInput']"));
		Phone.sendKeys("8088229102");
		
		WebElement Enter_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpPass']"));
		Enter_Pass.sendKeys("Inshop");
		
		WebElement Confirm_Pass = driver.findElement(By.xpath("//input[@id='outlined-adornment-password signUpConfPass']"));
		Confirm_Pass.sendKeys("Inshop");
		
		WebElement CREATE = driver.findElement(By.xpath("//button[normalize-space()='CREATE']"));
		js.executeScript("arguments[0].scrollIntoView();", CREATE);
		CREATE.sendKeys("Inshop");
		Thread.sleep(2000);
		
		String exp_Error = "An account with the given email already exists.";
		WebElement error = driver.findElement(By.xpath("//span[@class='errorMsg textCntr pdngSM']" ));
		String actual_error = error.getText();
		Assert.assertEquals(exp_Error, actual_error);
		
	}
	
	

	}