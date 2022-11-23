package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class CtreateProject extends BaseClass{
	//testing with valid user name and valid password.
	//it wont work ..why? ->we cannot automate captcha. 
@Test
public void tc1() throws IOException, InterruptedException {
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys(p.getPropertyFiledata("email"));
	
	WebElement passwrd = driver.findElement(By.id("password"));
	passwrd.sendKeys(p.getPropertyFiledata("pass"));
	//Thread.sleep(20000);
	//Thread.sleep(2000);
	WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
	Login.click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
	//Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
	//Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys(p.getPropertyFiledata("project_Name"));
	//Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@id='application']")).click();;
	//Thread.sleep(3000);
	
	WebElement drp = driver.findElement(By.xpath("//li[normalize-space()='Collaboration']"));
	drp.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();",drp);
	 Thread.sleep(3000);
	 
		driver.findElement(By.xpath("//input[@name='conferenceToggleBtn']")).click();
		//Thread.sleep(3000);
		
		WebElement cancel =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/button[1]/span[1]"));
		 js.executeScript("arguments[0].scrollIntoView();",cancel);
		 Thread.sleep(1000);
		 cancel.click();
		Thread.sleep(1000);
		
		String exp = "https://testapp.inapi.vc/my-projects";
		String act =driver.getCurrentUrl();
		Assert.assertEquals(act, exp);
		
	}
@Test
public void tc2() throws IOException, InterruptedException {
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys(p.getPropertyFiledata("email"));
	
	WebElement passwrd = driver.findElement(By.id("password"));
	passwrd.sendKeys(p.getPropertyFiledata("pass"));
	//Thread.sleep(20000);
	Thread.sleep(2000);
	WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
	Login.click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys(p.getPropertyFiledata("project_Name"));
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@id='application']")).click();;
	Thread.sleep(3000);
	
	WebElement drp = driver.findElement(By.xpath("//li[normalize-space()='Collaboration']"));
	drp.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();",drp);
	 Thread.sleep(3000);
	 
		driver.findElement(By.xpath("//input[@name='conferenceToggleBtn']")).click();
		Thread.sleep(3000);
		
		WebElement cancel =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[2]/button[1]/span[1]"));
		 js.executeScript("arguments[0].scrollIntoView();",cancel);
		 Thread.sleep(3000);
		 cancel.click();
		Thread.sleep(3000);
		
		String exp = "https://testapp.inapi.vc/my-projects";
		String act =driver.getCurrentUrl();
		Assert.assertEquals(act, exp);
		
}

@Test
public void tc3() throws IOException, InterruptedException {
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys(p.getPropertyFiledata("email"));
	
	WebElement passwrd = driver.findElement(By.id("password"));
	passwrd.sendKeys(p.getPropertyFiledata("pass"));
	//Thread.sleep(20000);

	Thread.sleep(2000);
	WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
	Login.click();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys(p.getPropertyFiledata("project_Name"));
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//div[@id='application']")).click();;
	Thread.sleep(3000);
	
	WebElement drp = driver.findElement(By.xpath("//li[normalize-space()='Collaboration']"));
	drp.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].scrollIntoView();",drp);
	 Thread.sleep(3000);
	 
		driver.findElement(By.xpath("//input[@name='conferenceToggleBtn']")).click();
		Thread.sleep(3000);
		
		WebElement create_project =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/button[1]/span[1]"));
		 js.executeScript("arguments[0].scrollIntoView();",create_project);
		 Thread.sleep(3000);
		 create_project.click();
		Thread.sleep(3000);
		
		WebElement get_started = driver.findElement(By.xpath("//span[normalize-space()='Get Started']"));
		get_started.click();
		Thread.sleep(3000);
		
		
//		String exp = "https://testapp.inapi.vc/get-started/?projectName=inAPI&projectId=63215842ba995fc04b0cb659";
//		String act =driver.getCurrentUrl();
//		Assert.assertEquals(act, exp);
//		
	}

}
