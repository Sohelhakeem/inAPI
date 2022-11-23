package inVC_Scripts;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_Schedule_Meeting extends BaseClass{
	@Test
	public void tc1() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(5000);
		
		WebElement scheduleMeetingIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noLeftPdng'])[2]"));
		scheduleMeetingIcon.click();
		
		//Thread.sleep(3000);
//		JavascriptExecutor js=  (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0, 350)");
		
		String year = "2023";
		String month = "January";
		String date = "10";
				
		
		driver.findElement(By.xpath("(//input[@aria-invalid='false'])[2]")).click();//date picker opens
		//Thread.sleep(3000);
		
		while(true) {
			String monthyear = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
			
			String arr[]=monthyear.split(" ");
			String mon =arr[0];
			String yr = arr[1];
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			else {
				driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
			}
			
		}
		
		//Thread.sleep(3000);
		List<WebElement> alldates = driver.findElements(By.xpath("//div[@class='MuiPickersBasePicker-container']//div"));
		
		for(WebElement ele:alldates) {
			String dt = ele.getText();
			if (dt.equals(date))
			{
				ele.click();
				break;
			}
			
		}
		
		        
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	@Test
	public void tc2() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
		myMeetingLink.click();
		
		Thread.sleep(2000);
		
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[1]/div/div[2]/div[3]/button"));
		scheduleMeeting.click();
		
		WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		MeetingTitleTF.sendKeys("SCRUM MEETING");
		
			//Thread.sleep(3000);	
		String actualUrl="https://staging.invc.vc/schedule-meeting";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
	}
	
	@Test
	public void tc3() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
		myMeetingLink.click();
		
		Thread.sleep(2000);
		
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[1]/div/div[2]/div[3]/button"));
		scheduleMeeting.click();
		
		WebElement  invcPRO= driver.findElement(By.xpath("//div[@class='hrztlTabItem ']"));
		invcPRO.click();
		
			//Thread.sleep(3000);	
		String actualUrl="https://staging.invc.vc/schedule-meeting";
		String expectedUrl= driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl,actualUrl);
		
		
		
		}
	@Test
	public void tc4() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
		myMeetingLink.click();
		
		Thread.sleep(2000);
		
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[1]/div/div[2]/div[3]/button"));
		scheduleMeeting.click();
		
		WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		MeetingTitleTF.sendKeys("SCRUM MEETING");
		driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']")).click();		
		Thread.sleep(3000);
	}
	
	@Test
	public void tc5() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
		myMeetingLink.click();
		
		Thread.sleep(2000);
		
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[1]/div/div[2]/div[3]/button"));
		scheduleMeeting.click();
		
		WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		MeetingTitleTF.sendKeys("SCRUM MEETING");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='MuiAccordionSummary-content']")).click();		
		Thread.sleep(3000);
	}
	@Test
	public void tc6() throws InterruptedException, AWTException, IOException {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(p.getPropertyFiledata("mail_id"));
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(p.getPropertyFiledata("password"));
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
		myMeetingLink.click();
		
		Thread.sleep(2000);
		
		WebElement  scheduleMeeting= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div[1]/div/div[2]/div[3]/button"));
		scheduleMeeting.click();
		
		WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		MeetingTitleTF.sendKeys("SCRUM MEETING");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']")).click();		
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']")).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
//		Select day_drp = new Select (driver.findElement(By.xpath("//div[@class='resflexColRow']//div[1]//div[1]//div[1]//div[1]")));
//		day_drp.selectByVisibleText("Daily");
		Thread.sleep(3000);
	}

}

