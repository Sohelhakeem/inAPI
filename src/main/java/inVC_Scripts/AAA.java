package inVC_Scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class AAA extends BaseClass {
	//Full Features
	@Test
	public void tc7() throws InterruptedException, AWTException {
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sohel@peoplelinkvc.com");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Hyderabad@123");
		
		WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		login.click();
		
		Thread.sleep(2000);
		
		WebElement  myMeetingLink= driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
		myMeetingLink.click();
		Thread.sleep(2000);
		
		WebElement  View_Btn= driver.findElement(By.xpath("//div[@class='mtngActn']//div[2]//button[1]"));
		View_Btn.click();
		Thread.sleep(2000);
		
		WebElement  Edit_Btn= driver.findElement(By.xpath("//button[@class='textIconBtn']"));
		Edit_Btn.click();
		Thread.sleep(3000);
		
		  WebElement MeetingTitleTF = driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		  MeetingTitleTF.clear();
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
			//Thread.sleep(3000);
			
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
				  
				  WebElement Advance_Btn1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]"));
				  Advance_Btn1.click(); 
				  Thread.sleep(2000);
				  Advance_Btn1.click();
				  js.executeScript("arguments[0].scrollIntoView();",Advance_Btn1);
				  Thread.sleep(2000);

		  		
	
	}
}
