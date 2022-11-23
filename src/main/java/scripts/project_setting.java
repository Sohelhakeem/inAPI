package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class project_setting extends BaseClass {
	@Test
	public void tc1() throws IOException, InterruptedException {

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		//Thread.sleep(10000);
		Thread.sleep(3000);
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys(p.getPropertyFiledata("project_Name"));
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='application']")).click();;
		//Thread.sleep(3000);
		
		WebElement drp = driver.findElement(By.xpath("//li[normalize-space()='Collaboration']"));
		drp.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",drp);
		 Thread.sleep(2000);
		 WebElement des = driver.findElement(By.xpath("//textarea[@id='projectDescription']"));
			des.click();
			Thread.sleep(2000);
			des.sendKeys(p.getPropertyFiledata("description"));
			Thread.sleep(2000);
		 
			driver.findElement(By.xpath("//input[@name='conferenceToggleBtn']")).click();
			Thread.sleep(2000);
			
			WebElement create_project =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/button[1]/span[1]"));
			 js.executeScript("arguments[0].scrollIntoView();",create_project);
			 Thread.sleep(2000);
			 create_project.click();
			//Thread.sleep(3000);
			
			WebElement get_started = driver.findElement(By.xpath("//span[normalize-space()='Get Started']"));
			get_started.click();
			Thread.sleep(2000);
		//my project
		driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
		Thread.sleep(3000);
		
		WebElement setting_icon = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[3]/img[1]"));
		setting_icon.click();
		
		WebElement OK_Btn = driver.findElement(By.xpath("//div[contains(@class,'flexCol alignCntr')]//button[contains(@type,'button')]"));
		OK_Btn.click();
		
		WebElement Start_building = driver.findElement(By.xpath("//div[@class='startBuildButton']//button[@type='button']"));
		js.executeScript("arguments[0].scrollIntoView();", Start_building);
		Thread.sleep(2000);
		Start_building.click();
		
		WebElement Collaboration = driver.findElement(By.xpath("//span[normalize-space()='Collaboration']"));
		js.executeScript("arguments[0].scrollIntoView();", Collaboration);
		Thread.sleep(2000);
		Collaboration.click();
		
//		WebElement Back_Btn = driver.findElement(By.xpath("//div[@class='flexInline pdngRMD']"));
//		js.executeScript("arguments[0].scrollIntoView();", Back_Btn);
//		Thread.sleep(2000);
//		Back_Btn.click();
//		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView();", Collaboration);
//		Thread.sleep(2000);
//		Collaboration.click();
//		Thread.sleep(2000);
WebElement Next_Btn = driver.findElement(By.xpath("//div[@class='flexInline']//button[@type='submit']"));
		js.executeScript("arguments[0].scrollIntoView();", Next_Btn);
		Next_Btn.click();
		Thread.sleep(2000);
		Thread.sleep(1000);
		WebElement subDomain_TF = driver.findElement(By.xpath("//input[@id='subDomain']"));
		subDomain_TF.sendKeys("proaccess");
		subDomain_TF.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Thread.sleep(2000);
		
		String expectedErrorMsg = "Alphanumeric of length 2-15, starting with alphabet allowed.";
		WebElement exp = driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiFormControl-marginDense']//p[@id='txtLastname-error']"));
		String actualErrorMsg = exp.getText();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
		subDomain_TF.sendKeys(p.getPropertyFiledata("domain"));
		
		
		WebElement Check_Availability = driver.findElement(By.xpath("//span[normalize-space()='Check Availability']"));
		js.executeScript("arguments[0].scrollIntoView();", Check_Availability);
		Thread.sleep(1000);
		Check_Availability.click();
		Thread.sleep(1000);
		Check_Availability.click();
		Thread.sleep(1000);
		//make it later
		String expectedMsg = "Subdomain is available";
		WebElement expp = driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiFormControl-marginDense']//p[@id='txtLastname-error']"));
		String actualMsg = expp.getText();
		Assert.assertEquals(actualMsg, expectedMsg);
		
		WebElement SAVE_Btn = driver.findElement(By.xpath("//div[@class='flexInline pdngRMD']//button[@type='submit']"));
		js.executeScript("arguments[0].scrollIntoView();", SAVE_Btn);
		Thread.sleep(2000);
		SAVE_Btn.click();
		
		WebElement Nextt_Btn = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		js.executeScript("arguments[0].scrollIntoView();", Nextt_Btn);
		Thread.sleep(2000);
		Nextt_Btn.click();
		Thread.sleep(2000);
		//////////////////////////////////////////////
		
		//1
				WebElement setup_webhook = driver.findElement(By.xpath("//body/div[@id='root']/div[contains(@class,'baseBlockCntnr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol innerMainCntnr innerCntnrWidth')]/div[contains(@class,'flexCol pdngSM')]/div[contains(@class,'flexCol respdngSM')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol stepperContr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol whiteBg brdrRadiusXSM fullWidth')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol pdngSM brdrRadiusXSM modeWhite')]/div[contains(@class,'flexCol pdngTSM')]/div[1]/div[1]"));
				setup_webhook.click();
				
				WebElement webhookUrl = driver.findElement(By.xpath("//input[@id='webhookUrl']"));
				js.executeScript("arguments[0].scrollIntoView();", webhookUrl);
				Thread.sleep(2000);
				webhookUrl.sendKeys("proprocess.com");
				WebElement w_SAVE_Btn = driver.findElement(By.xpath("//div[@class='pdngRMD']//button[@type='button']"));
				w_SAVE_Btn.click();
				
				
				String expectedErrorMsg1 = "*Please enter valid webhook url eg. https://www.projectname.com/";
				WebElement exp1 = driver.findElement(By.xpath("//p[@id='txtLastname-error']"));
				String actualErrorMsg1 = exp1.getText();
				Assert.assertEquals(actualErrorMsg1, expectedErrorMsg1);
				Thread.sleep(2000);
				
				WebElement subDomain_TF2 = driver.findElement(By.xpath("//input[@id='webhookUrl']"));
				js.executeScript("arguments[0].scrollIntoView();", subDomain_TF2);
				Thread.sleep(1000);
				subDomain_TF2.click();
				subDomain_TF2.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				subDomain_TF2.sendKeys("https://www.maven.com");
				Thread.sleep(1000);
				w_SAVE_Btn.click();
				Thread.sleep(2000);
				
				//2
				WebElement meeting_webhook = driver.findElement(By.xpath("//div[contains(@class,'flexCol pdngTSM')]//div[2]//div[1]//div[1]//div[1]"));
				js.executeScript("arguments[0].scrollIntoView();", meeting_webhook);
				Thread.sleep(2000);
				meeting_webhook.click();
				
				WebElement meetingUrl = driver.findElement(By.xpath("//input[@id='meetingUrl']"));
				js.executeScript("arguments[0].scrollIntoView();", meetingUrl);
				Thread.sleep(2000);
				meetingUrl.sendKeys("proprocess.com");
				WebElement meeting_SAVE_Btn = driver.findElement(By.xpath("//div[@class='pdngRMD']//button[@type='button']"));
				meeting_SAVE_Btn.click();
				
				
				String expectedErrorMsg2 = "*Please enter valid meeting url eg. https://www.projectname.com/";
				WebElement exp2 = driver.findElement(By.xpath("//p[@id='txtLastname-error']"));
				String actualErrorMsg2 = exp2.getText();
				Assert.assertEquals(actualErrorMsg2, expectedErrorMsg2);
				Thread.sleep(2000);
				meetingUrl.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				meetingUrl.sendKeys("https://www.maven.com");
				Thread.sleep(2000);
				meeting_SAVE_Btn.click();
				
				//3
				WebElement recordings_webhook = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]"));
				js.executeScript("arguments[0].scrollIntoView();", recordings_webhook);
				Thread.sleep(2000);
				recordings_webhook.click();
				
				WebElement record_SAVE_Btn = driver.findElement(By.xpath("//div[contains(@class,'flexCol brdrRadiusXSM brdrBlackSM pdngVSM mrgnVXS resMrgnVXS')]//div[contains(@class,'flexRow')]//div[1]//button[1]"));
				js.executeScript("arguments[0].scrollIntoView();", record_SAVE_Btn);
				Thread.sleep(2000);
				record_SAVE_Btn.click();
				Thread.sleep(2000);
				
				//4
				WebElement branding_webhook = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/span[1]"));
				js.executeScript("arguments[0].scrollIntoView();", branding_webhook);
				Thread.sleep(2000);
				branding_webhook.click();
				
				WebElement upload_image_Btn = driver.findElement(By.xpath("//div[contains(@class,'flexInline')]//button[contains(@type,'button')]"));
				js.executeScript("arguments[0].scrollIntoView();", upload_image_Btn);
				Thread.sleep(2000);
				//later add
				upload_image_Btn.isDisplayed();
				
				WebElement NEXT = driver.findElement(By.xpath("//span[normalize-space()='NEXT']"));
				NEXT.click();
				Thread.sleep(3000);
				
				//Edit Template
				WebElement Aspect_Ratio = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
				js.executeScript("arguments[0].scrollIntoView();", Aspect_Ratio);
				Thread.sleep(2000);
				Aspect_Ratio.click();
				
				WebElement ratio = driver.findElement(By.xpath("//li[contains(@class,'MuiButtonBase-root MuiListItem-root MuiMenuItem-root Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected')]"));
				ratio.click();
				
				WebElement Default_Layout = driver.findElement(By.xpath("//body//div[@id='root']//div[@class='flexCol ']//div[@class='flexCol ']//div[2]//div[1]//div[2]//div[2]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]"));
				js.executeScript("arguments[0].scrollIntoView();", Default_Layout);
				Thread.sleep(2000);
				Default_Layout.click();
				
				WebElement Layout = driver.findElement(By.xpath("//li[contains(@class,'MuiButtonBase-root MuiListItem-root MuiMenuItem-root Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected')]"));
				Layout.click();
				
//				WebElement Visible_Videos = driver.findElement(By.xpath("//div[2]//div[1]//div[2]//div[3]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]"));
//				js.executeScript("arguments[0].scrollIntoView();", Visible_Videos);
//				Thread.sleep(2000);
//				Visible_Videos.click();
//				
//				WebElement Visible = driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root jss17 Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected']"));
//				js.executeScript("arguments[0].scrollIntoView();", Visible_Videos);
//				Thread.sleep(1000);
//				Visible.click();
//				Thread.sleep(2000);
//				
				//Exit URL
				WebElement Exit_URL = driver.findElement(By.xpath("//input[@id='exitUrlStatus']"));
				Exit_URL.click();
				
				WebElement exitUrl = driver.findElement(By.xpath("//input[@id='exit URL']"));
				js.executeScript("arguments[0].scrollIntoView();", exitUrl);
				Thread.sleep(2000);
				exitUrl.sendKeys("proprocess.com");
				
				WebElement next = driver.findElement(By.xpath("//span[normalize-space()='NEXT']"));
				next.click();
				Thread.sleep(2000);
				
				//Theme
				WebElement Theme_Reset = driver.findElement(By.xpath("//body/div[@id='root']/div[contains(@class,'baseBlockCntnr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol innerMainCntnr innerCntnrWidth')]/div[contains(@class,'flexCol pdngSM')]/div[contains(@class,'flexCol respdngSM')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol stepperContr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol whiteBg brdrRadiusXSM fullWidth')]/div[contains(@class,'')]/div[contains(@class,'flexRow pdngSM justifyBtwn mrgnTXLG')]/div[contains(@class,'flexInline pdngRMD')]/button[1]"));
				js.executeScript("arguments[0].scrollIntoView();", Theme_Reset);
				Thread.sleep(2000);
				Theme_Reset.click();
				
				WebElement Theme_Reset_ok = driver.findElement(By.xpath("//div[contains(@class,'flexAutoCol pdngLSM')]//button[contains(@type,'button')]"));
				Theme_Reset_ok.click();
				Thread.sleep(2000);
				WebElement Theme_Reset_next = driver.findElement(By.xpath("//body/div[@id='root']/div[contains(@class,'baseBlockCntnr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol innerMainCntnr innerCntnrWidth')]/div[contains(@class,'flexCol pdngSM')]/div[contains(@class,'flexCol respdngSM')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol stepperContr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol whiteBg brdrRadiusXSM fullWidth')]/div[contains(@class,'')]/div[contains(@class,'flexRow pdngSM justifyBtwn mrgnTXLG')]/div[contains(@class,'flexAutoRow')]/div[contains(@class,'flexInline')]/button[1]"));
				Theme_Reset_next.click();
				Thread.sleep(2000);
				
				//iFRAME
				WebElement configure = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained configure MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
				configure.click();
				Thread.sleep(2000);
				
				WebElement oneMeetingRoom = driver.findElement(By.xpath("//input[@id='oneMeetingRoom']"));
				js.executeScript("arguments[0].scrollIntoView();", oneMeetingRoom);
				Thread.sleep(2000);
				oneMeetingRoom.click();
				Thread.sleep(2000);
				
				WebElement sessionName = driver.findElement(By.xpath("//input[@id='sessionName']"));
				sessionName.sendKeys("Meeting");
				WebElement noOfParticipants = driver.findElement(By.xpath("//input[@id='noOfParticipants']"));
				noOfParticipants.sendKeys("5");
				WebElement hostEmail = driver.findElement(By.xpath("//input[@id='hostEmail']"));
				hostEmail.sendKeys("testingteam@gmail.com");
				Thread.sleep(2000);
				WebElement create = driver.findElement(By.xpath("//div[@class='flexInline']//button[@type='button']"));
				js.executeScript("arguments[0].scrollIntoView();", create);
				Thread.sleep(2000);
				create.click();
				Thread.sleep(5000);
				WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Min-Code Video Embed']"));
				String current_title = title.getText();
				String Exp_Title = "Min-Code Video Embed";
				Assert.assertEquals(current_title, Exp_Title);
				
				//my_project
				driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
				Thread.sleep(5000);
				//delete_btn
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[2]/a[1]/img[1]")).click();
				Thread.sleep(2000);
				//project_nameTB
				driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys(p.getPropertyFiledata("project_Name"));
				
				//CheckBox
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				
				//Delete_Btn
				driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation')]")).click();
				
				//confirm_deleteBtn
				driver.findElement(By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing']//span[@class='MuiButton-label'][normalize-space()='Delete']")).click();
				Thread.sleep(5000);
				String exps = "https://testapp.inapi.vc/my-projects";
				String act =driver.getCurrentUrl();
				Assert.assertEquals(act, exps);
		
	}
	//Virtual_Class_Room
		@Test
		public void tc2() throws IOException, InterruptedException {

			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			//Thread.sleep(10000);
			Thread.sleep(3000);
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys(p.getPropertyFiledata("project_Name"));
			//Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@id='application']")).click();;
			//Thread.sleep(3000);
			
			WebElement drp = driver.findElement(By.xpath("//li[normalize-space()='Collaboration']"));
			drp.click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].scrollIntoView();",drp);
			 Thread.sleep(2000);
			 WebElement des = driver.findElement(By.xpath("//textarea[@id='projectDescription']"));
				des.click();
				Thread.sleep(2000);
				des.sendKeys(p.getPropertyFiledata("description"));
				Thread.sleep(2000);
			 
				driver.findElement(By.xpath("//input[@name='conferenceToggleBtn']")).click();
				Thread.sleep(2000);
				
				WebElement create_project =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/button[1]/span[1]"));
				 js.executeScript("arguments[0].scrollIntoView();",create_project);
				 Thread.sleep(2000);
				 create_project.click();
				//Thread.sleep(3000);
				
				WebElement get_started = driver.findElement(By.xpath("//span[normalize-space()='Get Started']"));
				get_started.click();
				Thread.sleep(2000);
			//my project
			driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
			Thread.sleep(3000);
			
			WebElement setting_icon = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[3]/img[1]"));
			setting_icon.click();
			
			WebElement OK_Btn = driver.findElement(By.xpath("//div[contains(@class,'flexCol alignCntr')]//button[contains(@type,'button')]"));
			OK_Btn.click();
			
			WebElement Start_building = driver.findElement(By.xpath("//div[@class='startBuildButton']//button[@type='button']"));
			js.executeScript("arguments[0].scrollIntoView();", Start_building);
			Thread.sleep(2000);
			Start_building.click();
			
			WebElement Virtual_Class_Room = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/button[1]"));
			js.executeScript("arguments[0].scrollIntoView();", Virtual_Class_Room);
			Thread.sleep(2000);
			Virtual_Class_Room.click();
			
//			WebElement Back_Btn = driver.findElement(By.xpath("//div[@class='flexInline pdngRMD']"));
//			js.executeScript("arguments[0].scrollIntoView();", Back_Btn);
//			Thread.sleep(2000);
//			Back_Btn.click();
//			Thread.sleep(2000);
//			js.executeScript("arguments[0].scrollIntoView();", Collaboration);
//			Thread.sleep(2000);
//			Collaboration.click();
//			Thread.sleep(2000);
	WebElement Next_Btn = driver.findElement(By.xpath("//div[@class='flexInline']//button[@type='submit']"));
			js.executeScript("arguments[0].scrollIntoView();", Next_Btn);
			Next_Btn.click();
			Thread.sleep(2000);
			Thread.sleep(1000);
			WebElement subDomain_TF = driver.findElement(By.xpath("//input[@id='subDomain']"));
			subDomain_TF.sendKeys("proaccess");
			subDomain_TF.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Thread.sleep(2000);
			
			String expectedErrorMsg = "Alphanumeric of length 2-15, starting with alphabet allowed.";
			WebElement exp = driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiFormControl-marginDense']//p[@id='txtLastname-error']"));
			String actualErrorMsg = exp.getText();
			Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
			subDomain_TF.sendKeys(p.getPropertyFiledata("domain"));
			
			
			WebElement Check_Availability = driver.findElement(By.xpath("//span[normalize-space()='Check Availability']"));
			js.executeScript("arguments[0].scrollIntoView();", Check_Availability);
			Thread.sleep(1000);
			Check_Availability.click();
			Thread.sleep(1000);
			Check_Availability.click();
			Thread.sleep(1000);
			//make it later
			String expectedMsg = "Subdomain is available";
			WebElement expp = driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiFormControl-marginDense']//p[@id='txtLastname-error']"));
			String actualMsg = expp.getText();
			Assert.assertEquals(actualMsg, expectedMsg);
			
			WebElement SAVE_Btn = driver.findElement(By.xpath("//div[@class='flexInline pdngRMD']//button[@type='submit']"));
			js.executeScript("arguments[0].scrollIntoView();", SAVE_Btn);
			Thread.sleep(2000);
			SAVE_Btn.click();
			
			WebElement Nextt_Btn = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
			js.executeScript("arguments[0].scrollIntoView();", Nextt_Btn);
			Thread.sleep(2000);
			Nextt_Btn.click();
			Thread.sleep(2000);
			//////////////////////////////////////////////
			
			//1
					WebElement setup_webhook = driver.findElement(By.xpath("//body/div[@id='root']/div[contains(@class,'baseBlockCntnr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol innerMainCntnr innerCntnrWidth')]/div[contains(@class,'flexCol pdngSM')]/div[contains(@class,'flexCol respdngSM')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol stepperContr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol whiteBg brdrRadiusXSM fullWidth')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol pdngSM brdrRadiusXSM modeWhite')]/div[contains(@class,'flexCol pdngTSM')]/div[1]/div[1]"));
					setup_webhook.click();
					
					WebElement webhookUrl = driver.findElement(By.xpath("//input[@id='webhookUrl']"));
					js.executeScript("arguments[0].scrollIntoView();", webhookUrl);
					Thread.sleep(2000);
					webhookUrl.sendKeys("proprocess.com");
					WebElement w_SAVE_Btn = driver.findElement(By.xpath("//div[@class='pdngRMD']//button[@type='button']"));
					w_SAVE_Btn.click();
					
					
					String expectedErrorMsg1 = "*Please enter valid webhook url eg. https://www.projectname.com/";
					WebElement exp1 = driver.findElement(By.xpath("//p[@id='txtLastname-error']"));
					String actualErrorMsg1 = exp1.getText();
					Assert.assertEquals(actualErrorMsg1, expectedErrorMsg1);
					Thread.sleep(2000);
					
					WebElement subDomain_TF2 = driver.findElement(By.xpath("//input[@id='webhookUrl']"));
					js.executeScript("arguments[0].scrollIntoView();", subDomain_TF2);
					Thread.sleep(1000);
					subDomain_TF2.click();
					subDomain_TF2.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					subDomain_TF2.sendKeys("https://www.maven.com");
					Thread.sleep(1000);
					w_SAVE_Btn.click();
					Thread.sleep(2000);
					
					//2
					WebElement meeting_webhook = driver.findElement(By.xpath("//div[contains(@class,'flexCol pdngTSM')]//div[2]//div[1]//div[1]//div[1]"));
					js.executeScript("arguments[0].scrollIntoView();", meeting_webhook);
					Thread.sleep(2000);
					meeting_webhook.click();
					
					WebElement meetingUrl = driver.findElement(By.xpath("//input[@id='meetingUrl']"));
					js.executeScript("arguments[0].scrollIntoView();", meetingUrl);
					Thread.sleep(2000);
					meetingUrl.sendKeys("proprocess.com");
					WebElement meeting_SAVE_Btn = driver.findElement(By.xpath("//div[@class='pdngRMD']//button[@type='button']"));
					meeting_SAVE_Btn.click();
					
					
					String expectedErrorMsg2 = "*Please enter valid meeting url eg. https://www.projectname.com/";
					WebElement exp2 = driver.findElement(By.xpath("//p[@id='txtLastname-error']"));
					String actualErrorMsg2 = exp2.getText();
					Assert.assertEquals(actualErrorMsg2, expectedErrorMsg2);
					Thread.sleep(2000);
					meetingUrl.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					meetingUrl.sendKeys("https://www.maven.com");
					Thread.sleep(2000);
					meeting_SAVE_Btn.click();
					
					//3
					WebElement recordings_webhook = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]"));
					js.executeScript("arguments[0].scrollIntoView();", recordings_webhook);
					Thread.sleep(2000);
					recordings_webhook.click();
					
					WebElement record_SAVE_Btn = driver.findElement(By.xpath("//div[contains(@class,'flexCol brdrRadiusXSM brdrBlackSM pdngVSM mrgnVXS resMrgnVXS')]//div[contains(@class,'flexRow')]//div[1]//button[1]"));
					js.executeScript("arguments[0].scrollIntoView();", record_SAVE_Btn);
					Thread.sleep(2000);
					record_SAVE_Btn.click();
					Thread.sleep(2000);
					
					//4
					WebElement branding_webhook = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/span[1]"));
					js.executeScript("arguments[0].scrollIntoView();", branding_webhook);
					Thread.sleep(2000);
					branding_webhook.click();
					
					WebElement upload_image_Btn = driver.findElement(By.xpath("//div[contains(@class,'flexInline')]//button[contains(@type,'button')]"));
					js.executeScript("arguments[0].scrollIntoView();", upload_image_Btn);
					Thread.sleep(2000);
					//later add
					upload_image_Btn.isDisplayed();
					
					WebElement NEXT = driver.findElement(By.xpath("//span[normalize-space()='NEXT']"));
					NEXT.click();
					Thread.sleep(3000);
					
					//Edit Template
					WebElement Aspect_Ratio = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
					js.executeScript("arguments[0].scrollIntoView();", Aspect_Ratio);
					Thread.sleep(2000);
					Aspect_Ratio.click();
					
					WebElement ratio = driver.findElement(By.xpath("//li[contains(@class,'MuiButtonBase-root MuiListItem-root MuiMenuItem-root Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected')]"));
					ratio.click();
					
					WebElement Default_Layout = driver.findElement(By.xpath("//body//div[@id='root']//div[@class='flexCol ']//div[@class='flexCol ']//div[2]//div[1]//div[2]//div[2]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]"));
					js.executeScript("arguments[0].scrollIntoView();", Default_Layout);
					Thread.sleep(2000);
					Default_Layout.click();
					
					WebElement Layout = driver.findElement(By.xpath("//li[contains(@class,'MuiButtonBase-root MuiListItem-root MuiMenuItem-root Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected')]"));
					Layout.click();
					
//					WebElement Visible_Videos = driver.findElement(By.xpath("//div[2]//div[1]//div[2]//div[3]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]"));
//					js.executeScript("arguments[0].scrollIntoView();", Visible_Videos);
//					Thread.sleep(2000);
//					Visible_Videos.click();
//					
//					WebElement Visible = driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root jss17 Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected']"));
//					js.executeScript("arguments[0].scrollIntoView();", Visible_Videos);
//					Thread.sleep(1000);
//					Visible.click();
//					Thread.sleep(2000);
//					
					//Exit URL
					WebElement Exit_URL = driver.findElement(By.xpath("//input[@id='exitUrlStatus']"));
					Exit_URL.click();
					
					WebElement exitUrl = driver.findElement(By.xpath("//input[@id='exit URL']"));
					js.executeScript("arguments[0].scrollIntoView();", exitUrl);
					Thread.sleep(2000);
					exitUrl.sendKeys("proprocess.com");
					
					WebElement next = driver.findElement(By.xpath("//span[normalize-space()='NEXT']"));
					next.click();
					Thread.sleep(2000);
					
					//Theme
					WebElement Theme_Reset = driver.findElement(By.xpath("//body/div[@id='root']/div[contains(@class,'baseBlockCntnr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol innerMainCntnr innerCntnrWidth')]/div[contains(@class,'flexCol pdngSM')]/div[contains(@class,'flexCol respdngSM')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol stepperContr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol whiteBg brdrRadiusXSM fullWidth')]/div[contains(@class,'')]/div[contains(@class,'flexRow pdngSM justifyBtwn mrgnTXLG')]/div[contains(@class,'flexInline pdngRMD')]/button[1]"));
					js.executeScript("arguments[0].scrollIntoView();", Theme_Reset);
					Thread.sleep(2000);
					Theme_Reset.click();
					
					WebElement Theme_Reset_ok = driver.findElement(By.xpath("//div[contains(@class,'flexAutoCol pdngLSM')]//button[contains(@type,'button')]"));
					Theme_Reset_ok.click();
					Thread.sleep(2000);
					WebElement Theme_Reset_next = driver.findElement(By.xpath("//body/div[@id='root']/div[contains(@class,'baseBlockCntnr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol innerMainCntnr innerCntnrWidth')]/div[contains(@class,'flexCol pdngSM')]/div[contains(@class,'flexCol respdngSM')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol stepperContr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol whiteBg brdrRadiusXSM fullWidth')]/div[contains(@class,'')]/div[contains(@class,'flexRow pdngSM justifyBtwn mrgnTXLG')]/div[contains(@class,'flexAutoRow')]/div[contains(@class,'flexInline')]/button[1]"));
					Theme_Reset_next.click();
					Thread.sleep(2000);
					
					//iFRAME
					WebElement configure = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained configure MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
					configure.click();
					Thread.sleep(2000);
					
					WebElement oneMeetingRoom = driver.findElement(By.xpath("//input[@id='oneMeetingRoom']"));
					js.executeScript("arguments[0].scrollIntoView();", oneMeetingRoom);
					Thread.sleep(2000);
					oneMeetingRoom.click();
					Thread.sleep(2000);
					
					WebElement sessionName = driver.findElement(By.xpath("//input[@id='sessionName']"));
					sessionName.sendKeys("Meeting");
					WebElement noOfParticipants = driver.findElement(By.xpath("//input[@id='noOfParticipants']"));
					noOfParticipants.sendKeys("5");
					WebElement hostEmail = driver.findElement(By.xpath("//input[@id='hostEmail']"));
					hostEmail.sendKeys("testingteam@gmail.com");
					Thread.sleep(2000);
					WebElement create = driver.findElement(By.xpath("//div[@class='flexInline']//button[@type='button']"));
					js.executeScript("arguments[0].scrollIntoView();", create);
					Thread.sleep(2000);
					create.click();
					Thread.sleep(5000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Min-Code Video Embed']"));
					String current_title = title.getText();
					String Exp_Title = "Min-Code Video Embed";
					Assert.assertEquals(current_title, Exp_Title);
					
					//my_project
					driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
					Thread.sleep(5000);
					//delete_btn
					driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[2]/a[1]/img[1]")).click();
					Thread.sleep(2000);
					//project_nameTB
					driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys(p.getPropertyFiledata("project_Name"));
					
					//CheckBox
					driver.findElement(By.xpath("//input[@type='checkbox']")).click();
					
					//Delete_Btn
					driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation')]")).click();
					
					//confirm_deleteBtn
					driver.findElement(By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing']//span[@class='MuiButton-label'][normalize-space()='Delete']")).click();
					Thread.sleep(5000);
					String exps = "https://testapp.inapi.vc/my-projects";
					String act =driver.getCurrentUrl();
					Assert.assertEquals(act, exps);
		}
		

}
