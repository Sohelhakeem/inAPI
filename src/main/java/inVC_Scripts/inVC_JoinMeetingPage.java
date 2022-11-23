package inVC_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_JoinMeetingPage extends BaseClass {
	//Verifying the functionality of joinmeeting
	@Test
	public void tc1() throws InterruptedException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(5000);
		
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		
		String actualUrl="https://staging.invc.vc/join-meeting";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
		}
	//Verifying the functionality of joinmeeting - my Meeting TF
	@Test
	public void tc2() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(5000);
		
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		String actualUrl="https://staging.invc.vc/join-meeting";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
	}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon
	@Test
	public void tc3() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(5000);
		
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		//URL changes with meeting Id
		Thread.sleep(2000);
//		String actualUrl="https://apps.invc.vc/6315cb7a9713525ee7396458";
//		String expectedUrl= driver.getCurrentUrl();
//		Assert.assertEquals(expectedUrl,actualUrl);
		
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon-EnterName.
	@Test
	public void tc4() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(5000);
		
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		
		//URL changes with meeting Id
		Thread.sleep(2000);
//		String actualUrl="https://apps.invc.vc/6315cb7a9713525ee7396458";
//		String expectedUrl= driver.getCurrentUrl();
//		Assert.assertEquals(expectedUrl,actualUrl);
//		
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon - enterName- join
	@Test
	public void tc5() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(5000);
		
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		
		WebElement joinButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		joinButton.click();
		//URL changes with meeting Id
		Thread.sleep(2000);
//		String actualUrl="https://apps.invc.vc/6315cb7a9713525ee7396458";
//		String expectedUrl= driver.getCurrentUrl();
//		Assert.assertEquals(expectedUrl,actualUrl);
		
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon - enterName- join-Leave-No
	@Test
	public void tc6() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(5000);
		
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		
		WebElement joinButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		joinButton.click();
		
		Thread.sleep(3000);
		WebElement leaveButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		leaveButton.click();

		Thread.sleep(2000);
		WebElement NoButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[4]"));
		NoButton.click();
		
		//URL changes with meeting Id
//		String actualUrl="https://apps.invc.vc/6315cb7a9713525ee7396458";
//		String expectedUrl= driver.getCurrentUrl();
//		Assert.assertEquals(expectedUrl,actualUrl);
		
		}
	//Verifying the functionality of joinmeeting - Meeting Id TF - join Meeting Butoon - enterName- join-Leave-YES
	@Test
	public void tc7() throws InterruptedException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(5000);
		
		WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
		joinMeetingIcon.click();
		
		WebElement meetingIdTf = driver.findElement(By.id("outlined-basic"));
		meetingIdTf.sendKeys(p.getPropertyFiledata("Meeting_Id"));
		
		WebElement joinMeetingButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[2]/div/div[4]/button/span[1]"));
		joinMeetingButton.click();
		
		WebElement yournameTf = driver.findElement(By.id("displayname"));
		yournameTf.sendKeys("SOHAIL");
		
		WebElement joinButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		joinButton.click();
		
		Thread.sleep(3000);
		WebElement leaveButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[2]"));
		leaveButton.click();

		Thread.sleep(2000);
		WebElement YesButton = driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[5]"));
		YesButton.click();
		Thread.sleep(5000);
		String actualUrl="https://app.invc.vc/";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
		}
	
}
