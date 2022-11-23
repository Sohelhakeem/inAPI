package inVC_Scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_Recurring_Schedule extends BaseClass {
	@Test
	public void tc1() throws InterruptedException, AWTException, IOException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
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
		
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		WebElement  Recuring_Schedule_btn= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
		Recuring_Schedule_btn.click();
		
		Thread.sleep(3000);
		
	}
	
	@Test
	public void tc2() throws InterruptedException, AWTException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
		
		WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
		Recuring_Schedule.click();
		Thread.sleep(3000);
		
		 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
		 Thread.sleep(3000);
		 
		//selectslot 15 min
		 WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 selectslot_15.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
			Thread.sleep(3000);
			
	}
	
	@Test
	public void tc3() throws InterruptedException, AWTException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
		
		WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
		Recuring_Schedule.click();
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
		Thread.sleep(3000);
		
		//selectslot 15 min
		WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		selectslot_15.click();
		js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
		Thread.sleep(3000);
		
		//select 4 Seats 
		WebElement  selectseats_4= driver.findElement(By.xpath("(//div[@class='radioGroup'])[4]"));
		selectseats_4.click();
		js.executeScript("arguments[0].scrollIntoView();", selectseats_4);
		Thread.sleep(3000);
		
	}
	@Test
	public void tc4() throws InterruptedException, AWTException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
		
		WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
		Recuring_Schedule.click();
		Thread.sleep(3000);
		
		 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
		 Thread.sleep(3000);
		//selectslot 15 min
		 WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 selectslot_15.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
			Thread.sleep(3000);
			
			//selectslot 30 min
			WebElement  selectslot_30= driver.findElement(By.xpath("(//div[@class='radioGroup'])[2]"));
			selectslot_30.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_30);
			Thread.sleep(3000);
			
			//select 4 Seats 
			WebElement  selectseats_4= driver.findElement(By.xpath("(//div[@class='radioGroup'])[4]"));
			selectseats_4.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_4);
			Thread.sleep(3000);
			
			//select 2 Seats 
			WebElement  selectseats_2= driver.findElement(By.xpath("(//div[@class='radioGroup'])[3]"));
			selectseats_2.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_2);
			Thread.sleep(3000);
			
	}
	@Test
	public void tc5() throws InterruptedException, AWTException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
		
		WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
		Recuring_Schedule.click();
		Thread.sleep(3000);
		
		 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
		 Thread.sleep(3000);
		//selectslot 15 min
		 WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 selectslot_15.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
			Thread.sleep(3000);
			
			//selectslot 30 min
			WebElement  selectslot_30= driver.findElement(By.xpath("(//div[@class='radioGroup'])[2]"));
			selectslot_30.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_30);
			Thread.sleep(3000);
			
			//select 4 Seats 
			WebElement  selectseats_4= driver.findElement(By.xpath("(//div[@class='radioGroup'])[4]"));
			selectseats_4.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_4);
			Thread.sleep(3000);
			
			//select 2 Seats 
			WebElement  selectseats_2= driver.findElement(By.xpath("(//div[@class='radioGroup'])[3]"));
			selectseats_2.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_2);
			Thread.sleep(3000);
			
			//select 8 Seats 
			WebElement  selectseats_8= driver.findElement(By.xpath("(//div[@class='radioGroup'])[5]"));
			selectseats_8.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_8);
			Thread.sleep(3000);
			
			//select Custom Seats 
			WebElement  selectseats_Custom= driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
			selectseats_Custom.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
			Thread.sleep(3000);
			
	}
	@Test
	public void tc6() throws InterruptedException, AWTException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
		
		WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
		Recuring_Schedule.click();
		Thread.sleep(3000);
		
		 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
		 Thread.sleep(3000);
		
			
		 	//selectslot 15 min
		 	WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 	selectslot_15.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
			Thread.sleep(3000);
			
			//select Custom Seats 
			WebElement  selectseats_Custom= driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
			selectseats_Custom.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
			Thread.sleep(3000);
			
			//participant_Seats_drp_Down
			Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
			participant_drp.selectByVisibleText("6 Participant Seats");
			js.executeScript("arguments[0].scrollIntoView();", participant_drp);
			Thread.sleep(3000);
			
	}
	
	@Test
	public void tc7() throws InterruptedException, AWTException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
		
		WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
		Recuring_Schedule.click();
		Thread.sleep(3000);
		
		 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
		 Thread.sleep(3000);
		
			
		 	//selectslot 15 min
		 	WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 	selectslot_15.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
			Thread.sleep(3000);
			
			//select Custom Seats 
			WebElement  selectseats_Custom= driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
			selectseats_Custom.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
			Thread.sleep(3000);
			
			//participant_Seats_drp_Down
			Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
			participant_drp.selectByVisibleText("6 Participant Seats");
			js.executeScript("arguments[0].scrollIntoView();", participant_drp);
			Thread.sleep(3000);
			
			//Cancel_Button
			WebElement  Cancel_Button= driver.findElement(By.xpath("//div[@class='selectTimeBlock width50']//span[@class='MuiButton-label'][normalize-space()='CANCEL']"));
			Cancel_Button.click();
			js.executeScript("arguments[0].scrollIntoView();", Cancel_Button);
			Thread.sleep(3000);
	}
	
	@Test
	public void tc8() throws InterruptedException, AWTException, IOException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
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
		
		WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
		Recuring_Schedule.click();
		Thread.sleep(3000);
		
		 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
		 Thread.sleep(3000);
		
			
		 	//selectslot 15 min
		 	WebElement  selectslot_15= driver.findElement(By.xpath("//div[@class='radioGroup']"));
		 	selectslot_15.click();
			js.executeScript("arguments[0].scrollIntoView();", selectslot_15);
			Thread.sleep(3000);
			
			//select Custom Seats 
			WebElement  selectseats_Custom= driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
			selectseats_Custom.click();
			js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
			Thread.sleep(3000);
			
			//participant_Seats_drp_Down
			Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
			participant_drp.selectByVisibleText("6 Participant Seats");
			js.executeScript("arguments[0].scrollIntoView();", participant_drp);
			Thread.sleep(3000);
			
			//Save_Button
			WebElement  Save_Button= driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
			Save_Button.click();
			js.executeScript("arguments[0].scrollIntoView();", Save_Button);
			Thread.sleep(3000);
	}
	
	//REAPEAT ON ALL DAYS OF WEEK
		@Test
		public void tc9() throws InterruptedException, AWTException, IOException {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
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
			
			WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
			Recuring_Schedule.click();
			Thread.sleep(3000);
			
			 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
			 Thread.sleep(3000);
			 
			//participant_Seats_drp_Down
				WebElement news = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
				news.click();
				js.executeScript("arguments[0].scrollIntoView();", news);
				Thread.sleep(3000);
				
				//to SELECT WEEK FROM DROP DOWN
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(3000);
				
				//Select Sun_CheckBox
				WebElement  Sun_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[4]"));
				Sun_CheckBox.click();
				Thread.sleep(1000);
				Sun_CheckBox.click();
				
				//Select Mon_CheckBox
				WebElement  Mon_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[5]"));
				Mon_CheckBox.click();
				Thread.sleep(1000);
				Mon_CheckBox.click();
				
				//Select Tue_CheckBox
				WebElement  Tue_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[6]"));
				Tue_CheckBox.click();
				Thread.sleep(1000);
				Tue_CheckBox.click();
				
				//Select Wed_CheckBox
				WebElement  Wed_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[7]"));
				Wed_CheckBox.click();
				Thread.sleep(1000);
				Wed_CheckBox.click();
				
				//Select Thu_CheckBox
				WebElement  Thu_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[8]"));
				Thu_CheckBox.click();
				Thread.sleep(1000);
				Thu_CheckBox.click();
				
				//Select Fri_CheckBox
				WebElement  Fri_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[9]"));
				Fri_CheckBox.click();
				Thread.sleep(1000);
				Fri_CheckBox.click();
				
				//Select Sat_CheckBox
				WebElement  Sat_CheckBox= driver.findElement(By.xpath("(//span[@class='MuiIconButton-label'])[10]"));
				Sat_CheckBox.click();
				Thread.sleep(1000);
				Sat_CheckBox.click();
				Thread.sleep(3000);
				
				  //selectslot 15 min 
				WebElement selectslot_15=driver.findElement(By.xpath("//div[@class='radioGroup']"));
				  selectslot_15.click(); js.executeScript("arguments[0].scrollIntoView();",
				  selectslot_15); Thread.sleep(3000);
				  
				  //select Custom Seats 
				  WebElement selectseats_Custom=driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
				  selectseats_Custom.click();
				  js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
				  Thread.sleep(3000);
				  
				  //participant_Seats_drp_Down 
				  Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
				  participant_drp.selectByVisibleText("6 Participant Seats");
				  js.executeScript("arguments[0].scrollIntoView();", participant_drp);
				  Thread.sleep(3000);
				  
				  //Save_Button 
				  
				  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
				  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();",
				  Save_Button); Thread.sleep(3000);
				 
		}
		//Select Frequency Month and repeat 3 Months
		@Test
		public void tc10() throws InterruptedException, AWTException, IOException {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
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
			Thread.sleep(2000);
			
			WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
			Recuring_Schedule.click();
			Thread.sleep(2000);
			
			 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
			 Thread.sleep(2000);
			 
			//participant_Seats_drp_Down
				WebElement FREQUENCY_DD = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
				FREQUENCY_DD.click();
				js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
				Thread.sleep(2000);
				
				//to SELECT MONTH FROM DROP DOWN
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(1000);
				WebElement Repeat_Every = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]"));
				Repeat_Every.click();
				js.executeScript("arguments[0].scrollIntoView();", Repeat_Every);
				Thread.sleep(2000);
				
				//to SELECT  3 MONTHS FROM DROP DOWN
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(1000);
				
				  //selectslot 15 min 
				WebElement selectslot_15=driver.findElement(By.xpath("//div[@class='radioGroup']"));
				  selectslot_15.click(); js.executeScript("arguments[0].scrollIntoView();",
				  selectslot_15); Thread.sleep(3000);
				  
				  //select Custom Seats 
				  WebElement selectseats_Custom=driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
				  selectseats_Custom.click();
				  js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
				  Thread.sleep(2000);
				  
				  //participant_Seats_drp_Down 
				  Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
				  participant_drp.selectByVisibleText("6 Participant Seats");
				  js.executeScript("arguments[0].scrollIntoView();", participant_drp);
				  Thread.sleep(2000);
				  
				  //Save_Button 
				  
				  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
				  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();",
				  Save_Button);
				  Thread.sleep(2000);
				 
		}
		//Select Frequency yearly and repeat 3 Years
		@Test
		public void tc11() throws InterruptedException, AWTException, IOException {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
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
			Thread.sleep(2000);
			
			WebElement  Password_Enable_Button= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]/span[1]/span[1]/input[1]"));
			Password_Enable_Button.click();
			
			WebElement  Password_Enable_Button_TF= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]"));
			Password_Enable_Button_TF.sendKeys("Sohel@123");
			
			Thread.sleep(3000);
			
			WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
			Recuring_Schedule.click();
			Thread.sleep(2000);
			
			 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
			 Thread.sleep(2000);
			 
			//participant_Seats_drp_Down
				WebElement FREQUENCY_DD = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
				FREQUENCY_DD.click();
				js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
				Thread.sleep(2000);
				
				//to SELECT yesrly FROM DROP DOWN
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(1000);
				WebElement Repeat_Every = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]"));
				Repeat_Every.click();
				js.executeScript("arguments[0].scrollIntoView();", Repeat_Every);
				Thread.sleep(2000);
				
				//to SELECT  3 YEAR FROM DROP DOWN
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(1000);
				
				
				
			
				
				  //selectslot 15 min 
				WebElement selectslot_15=driver.findElement(By.xpath("//div[@class='radioGroup']"));
				  selectslot_15.click(); js.executeScript("arguments[0].scrollIntoView();",
				  selectslot_15); Thread.sleep(3000);
				  
				  //select Custom Seats 
				  WebElement selectseats_Custom=driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
				  selectseats_Custom.click();
				  js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
				  Thread.sleep(2000);
				  
				  //participant_Seats_drp_Down 
				  Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
				  participant_drp.selectByVisibleText("8 Participant Seats");
				  js.executeScript("arguments[0].scrollIntoView();", participant_drp);
				  Thread.sleep(2000);
				  
				  //Save_Button 
				  
				  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
				  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();",
				  Save_Button);
				  Thread.sleep(2000);
				 
		}
		//ALL FEATURES RECURRING SCHEDULE.
		@Test
		public void tc12() throws InterruptedException, AWTException, IOException {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
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
			Thread.sleep(2000);
			
			WebElement  Password_Enable_Button= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]/span[1]/span[1]/input[1]"));
			Password_Enable_Button.click();
			
			WebElement  Password_Enable_Button_TF= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]"));
			Password_Enable_Button_TF.sendKeys("Sohel@123");
			
			Thread.sleep(3000);
			
			WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
			Recuring_Schedule.click();
			Thread.sleep(2000);
			
			 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
			 Thread.sleep(2000);
			 
			//participant_Seats_drp_Down
				WebElement FREQUENCY_DD = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
				FREQUENCY_DD.click();
				js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
				Thread.sleep(2000);
				
				//to SELECT yesrly FROM DROP DOWN
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(1000);
				WebElement Repeat_Every = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]"));
				Repeat_Every.click();
				js.executeScript("arguments[0].scrollIntoView();", Repeat_Every);
				Thread.sleep(2000);
				
				//to SELECT  3 YEAR FROM DROP DOWN
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(1000);
				
				WebElement Occurance_Ends = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/input[1]"));
				Occurance_Ends.clear();
				Occurance_Ends.sendKeys("15");
				Thread.sleep(2000);
			
				
				  //selectslot 15 min 
				WebElement selectslot_15=driver.findElement(By.xpath("//div[@class='radioGroup']"));
				  selectslot_15.click(); js.executeScript("arguments[0].scrollIntoView();",
				  selectslot_15); Thread.sleep(3000);
				  
				  //select Custom Seats 
				  WebElement selectseats_Custom=driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
				  selectseats_Custom.click();
				  js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
				  Thread.sleep(2000);
				  
				  //participant_Seats_drp_Down 
				  Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
				  participant_drp.selectByVisibleText("8 Participant Seats");
				  js.executeScript("arguments[0].scrollIntoView();", participant_drp);
				  Thread.sleep(2000);
				  
				  //Save_Button 
				  
				  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
				  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();",Save_Button);
				  Thread.sleep(2000);
				  
				  WebElement Advance_Btn=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]"));
				  Advance_Btn.click(); 
				  Thread.sleep(2000);
				  Advance_Btn.click();
				  js.executeScript("arguments[0].scrollIntoView();",Advance_Btn);
				  Thread.sleep(2000);
				  
		}
		//ALL FEATURES OF SCHEDULE_MEETING INCLUDING RECURRING SCHEDULE.
		@Test
		public void tc13() throws InterruptedException, AWTException, IOException {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
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
			Thread.sleep(2000);
			
			WebElement  Password_Enable_Button= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/span[1]/span[1]/span[1]/input[1]"));
			Password_Enable_Button.click();
			
			WebElement  Password_Enable_Button_TF= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]"));
			Password_Enable_Button_TF.sendKeys("Sohel@123");
			
			Thread.sleep(3000);
			String year = "2023";
			String month = "January";
			String date = "10";
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")).click();//date picker opens
			
			while(true) {
				String monthyear = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
				
				String arr[]=monthyear.split(" ");
				String mon =arr[0];
				String yr = arr[1];
				
				if(mon.equalsIgnoreCase(month) && yr.equals(year))
					break;
				else {
					driver.findElement(By.xpath("//div[@class='MuiPickersBasePicker-pickerView']//button[2]//span[1]//*[name()='svg']")).click();
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
		
			WebElement  Recuring_Schedule= driver.findElement(By.xpath("//div[@class='flexRow resrowFlexEnd']//input[@type='checkbox']"));
			Recuring_Schedule.click();
			Thread.sleep(2000);
			
			 js.executeScript("arguments[0].scrollIntoView();", Recuring_Schedule);
			 Thread.sleep(2000);
			 
			//participant_Seats_drp_Down
				WebElement FREQUENCY_DD = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
				FREQUENCY_DD.click();
				js.executeScript("arguments[0].scrollIntoView();", FREQUENCY_DD);
				Thread.sleep(2000);
				
				//to SELECT yesrly FROM DROP DOWN
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(1000);
				WebElement Repeat_Every = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]"));
				Repeat_Every.click();
				js.executeScript("arguments[0].scrollIntoView();", Repeat_Every);
				Thread.sleep(2000);
				
				//to SELECT  3 YEAR FROM DROP DOWN
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(1000);
				
				WebElement Occurance_Ends = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/input[1]"));
				Occurance_Ends.clear();
				Thread.sleep(2000);
				Occurance_Ends.sendKeys("20");
				Thread.sleep(2000);
			
				
				  //selectslot 15 min 
				WebElement selectslot_15=driver.findElement(By.xpath("//div[@class='radioGroup']"));
				  selectslot_15.click(); js.executeScript("arguments[0].scrollIntoView();",
				  selectslot_15); Thread.sleep(3000);
				  
				  //select Custom Seats 
				  WebElement selectseats_Custom=driver.findElement(By.xpath("//button[normalize-space()='Custom']"));
				  selectseats_Custom.click();
				  js.executeScript("arguments[0].scrollIntoView();", selectseats_Custom);
				  Thread.sleep(2000);
				  
				  //participant_Seats_drp_Down 
				  Select participant_drp = new Select(driver.findElement(By.id("selecSeats")));
				  participant_drp.selectByVisibleText("100 Participant Seats");
				  js.executeScript("arguments[0].scrollIntoView();", participant_drp);
				  Thread.sleep(2000);
				  
				  //Save_Button 
				  
				  WebElement Save_Button=driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
				  Save_Button.click(); js.executeScript("arguments[0].scrollIntoView();",Save_Button);
				  Thread.sleep(2000);
				  
				  WebElement Advance_Btn=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]"));
				  Advance_Btn.click(); 
				  Thread.sleep(2000);
				  Advance_Btn.click();
				  js.executeScript("arguments[0].scrollIntoView();",Advance_Btn);
				  Thread.sleep(2000);
				  
		}
		
	
}
