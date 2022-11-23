package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Reports extends BaseClass {
	//Validate the user is able to click on Reports dropDown analytics feature.
		@Test
		public void tc1() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Analytics 	
					WebElement Reports_Analytics = driver.findElement(By.xpath("//a[contains(@href,'/reports/analytics')]"));
					Reports_Analytics.click();
			
			Thread.sleep(2000);
			WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
			String current_title = title.getText();
			String Exp_Title = "Analytics";
			Assert.assertEquals(current_title, Exp_Title);
			
			
				}		
		//Validate the user is able to click on Reports dropDown analytics feature.
		@Test
		public void tc2() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Analytics 	
					WebElement Reports_Analytics = driver.findElement(By.xpath("//a[contains(@href,'/reports/analytics')]"));
					Reports_Analytics.click();
					Thread.sleep(2000);
					WebElement Projects = driver.findElement(By.xpath("//div[@id='createdProject']"));
					Projects.click();
					Thread.sleep(2000);
					WebElement List_box = driver.findElement(By.xpath("//ul[@role='listbox']"));
					List_box.click();
					
					WebElement Go_btn = driver.findElement(By.xpath("//div[@class='flexAutoCol']//button[@type='button']"));
					Go_btn.click();
					
					WebElement Usage_drp = driver.findElement(By.xpath("//div[contains(@class,'pdngVMD')]//div[@id='report']"));
					Usage_drp .click();
					
					WebElement current_day = driver.findElement(By.xpath("//em[normalize-space()='Current Day']"));
					current_day .click();
					Thread.sleep(2000);
					WebElement Past_btn = driver.findElement(By.xpath("//button[@id='Past']"));
					Past_btn .click();
					
					WebElement download_arrow = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div[1]/a[1]/small[1]/*[name()='svg'][1]"));
					download_arrow.isDisplayed();				
					
					WebElement Graph_btn = driver.findElement(By.xpath("//button[@id='graph']"));
					Graph_btn .click();
					
					
			Thread.sleep(2000);
			WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
			String current_title = title.getText();
			String Exp_Title = "Analytics";
			Assert.assertEquals(current_title, Exp_Title);
			
			
				}		
		//Validate the user is able to click on Reports dropDown analytics feature session drpdwn .
		@Test
		public void tc3() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Analytics 	
					WebElement Reports_Analytics = driver.findElement(By.xpath("//a[contains(@href,'/reports/analytics')]"));
					Reports_Analytics.click();
					Thread.sleep(2000);
					WebElement Projects = driver.findElement(By.xpath("//div[@id='createdProject']"));
					Projects.click();
					Thread.sleep(2000);
					WebElement List_box = driver.findElement(By.xpath("//ul[@role='listbox']"));
					List_box.click();
					
					WebElement Go_btn = driver.findElement(By.xpath("//div[@class='flexAutoCol']//button[@type='button']"));
					Go_btn.click();
					
					WebElement Usage_drp = driver.findElement(By.xpath("//div[contains(@class,'pdngVMD')]//div[@id='report']"));
					Usage_drp .click();
					
					WebElement Last_7days = driver.findElement(By.xpath("//div[@id='menu-report']//li[3]"));
					Last_7days .click();
					
					WebElement Session = driver.findElement(By.xpath("//div[@class='flexCol alignEnd']//div[@id='report']"));
					Session .click();
					
					WebElement Last_4weeks = driver.findElement(By.xpath("//div[@id='menu-report']//li[1]"));
					Last_4weeks .click();
					
					WebElement Graph_btn = driver.findElement(By.xpath("//button[@id='graph']"));
					Graph_btn .click();
					Thread.sleep(2000);
					WebElement Past_btn = driver.findElement(By.xpath("//button[@id='Past']"));
					Past_btn .click();
					Thread.sleep(2000);
					WebElement download_arrow = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div[1]/a[1]/small[1]/*[name()='svg'][1]"));
					download_arrow.isDisplayed();				
					Thread.sleep(2000);
					
			Thread.sleep(2000);
			WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
			String current_title = title.getText();
			String Exp_Title = "Analytics";
			Assert.assertEquals(current_title, Exp_Title);
			
			
				}		
		//Validate the user is able to click on Reports dropDown analytics feature session drpdwn - month.
		@Test
		public void tc4() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Analytics 	
					WebElement Reports_Analytics = driver.findElement(By.xpath("//a[contains(@href,'/reports/analytics')]"));
					Reports_Analytics.click();
					Thread.sleep(2000);
					WebElement Projects = driver.findElement(By.xpath("//div[@id='createdProject']"));
					Projects.click();
					Thread.sleep(2000);
					WebElement List_box = driver.findElement(By.xpath("//ul[@role='listbox']"));
					List_box.click();
					
					WebElement Go_btn = driver.findElement(By.xpath("//div[@class='flexAutoCol']//button[@type='button']"));
					Go_btn.click();
					
					WebElement Usage_drp = driver.findElement(By.xpath("//div[contains(@class,'pdngVMD')]//div[@id='report']"));
					Usage_drp .click();
					
					WebElement Last_2months = driver.findElement(By.xpath("//div[@id='menu-report']//li[6]"));
					Last_2months .click();
					Thread.sleep(2000);
					WebElement Session = driver.findElement(By.xpath("//div[@class='flexCol alignEnd']//div[@id='report']"));
					Session .click();
					
					WebElement Last_2monthss = driver.findElement(By.xpath("//div[@id='menu-report']//li[5]"));
					Last_2monthss .click();
					Thread.sleep(2000);
					WebElement Graph_btn = driver.findElement(By.xpath("//button[@id='graph']"));
					Graph_btn .click();
					Thread.sleep(2000);
					WebElement Past_btn = driver.findElement(By.xpath("//button[@id='Past']"));
					Past_btn .click();
					Thread.sleep(2000);
					WebElement download_arrow = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div[1]/a[1]/small[1]/*[name()='svg'][1]"));
					download_arrow.isDisplayed();				
					Thread.sleep(2000);
					
			Thread.sleep(2000);
			WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
			String current_title = title.getText();
			String Exp_Title = "Analytics";
			Assert.assertEquals(current_title, Exp_Title);
			
			
				}		
		//validate the functionality of Activity Log.
		@Test
		public void tc5() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Activity_log
					WebElement Reports_Activity_log = driver.findElement(By.xpath("//a[@href='/reports/activity-log']"));
					Reports_Activity_log.click();
			
			//Thread.sleep(2000);
			WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Activity Log']"));
			String current_title = title.getText();
			String Exp_Title = "Activity Log";
			Assert.assertEquals(current_title, Exp_Title);
			
		}
		//validate the functionality of Activity Log Export_activityLog_link.
		@Test
		public void tc6() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Activity_log
					WebElement Reports_Activity_log = driver.findElement(By.xpath("//a[@href='/reports/activity-log']"));
					Reports_Activity_log.click();
			
					WebElement Export_activityLog_link= driver.findElement(By.xpath("//a[normalize-space()='Export Activity Logs']"));
					Export_activityLog_link.isDisplayed();
					
			//Thread.sleep(2000);
			WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Activity Log']"));
			String current_title = title.getText();
			String Exp_Title = "Activity Log";
			Assert.assertEquals(current_title, Exp_Title);
			
			
		}
		//validate the functionality of Activity Log Recent Activity TB with name anil .
		@Test
		public void tc7() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Activity_log
					WebElement Reports_Activity_log = driver.findElement(By.xpath("//a[@href='/reports/activity-log']"));
					Reports_Activity_log.click();
			
					WebElement Export_activityLog_link= driver.findElement(By.xpath("//a[normalize-space()='Export Activity Logs']"));
					Export_activityLog_link.isDisplayed();
					
					WebElement search_user= driver.findElement(By.xpath("//input[@id='standard-basic']"));
					search_user.sendKeys("anil");
					Thread.sleep(3000);
					
		}
		//validate the functionality of Activity Log Recent Activity TB with name sohel .
		@Test
		public void tc8() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Activity_log
					WebElement Reports_Activity_log = driver.findElement(By.xpath("//a[@href='/reports/activity-log']"));
					Reports_Activity_log.click();
			
					WebElement Export_activityLog_link= driver.findElement(By.xpath("//a[normalize-space()='Export Activity Logs']"));
					Export_activityLog_link.isDisplayed();
					
					WebElement search_user= driver.findElement(By.xpath("//input[@id='standard-basic']"));
					search_user.sendKeys("sohel");
					Thread.sleep(3000);
					
		}
		//validate the functionality of Activity Log Recent Activity TB with name sohel -Filter .
		@Test
		public void tc9() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Activity_log
					WebElement Reports_Activity_log = driver.findElement(By.xpath("//a[@href='/reports/activity-log']"));
					Reports_Activity_log.click();
			Thread.sleep(2000);
					WebElement Export_activityLog_link= driver.findElement(By.xpath("//a[normalize-space()='Export Activity Logs']"));
					Export_activityLog_link.isDisplayed();
					
					WebElement filter= driver.findElement(By.xpath("//img[@alt='filter']"));
					filter.click();
					Thread.sleep(2000);
					WebElement all_user= driver.findElement(By.xpath("//div[@id='users']"));
					all_user.click();
					
					WebElement all_userdd= driver.findElement(By.xpath("//li[@role='option']"));
					all_userdd.click();
					
					WebElement all_Action= driver.findElement(By.xpath("//div[@id='actions']"));
					all_Action.click();
					
					WebElement all_Actiondd= driver.findElement(By.xpath("//div[@id='menu-actions']//li[2]"));
					all_Actiondd.click();
					Thread.sleep(2000);
					WebElement select_date= driver.findElement(By.xpath("//div[@id='User']"));
					select_date.click();
					
					WebElement select_datedd= driver.findElement(By.xpath("//div[@id='menu-User']//li[2]"));
					select_datedd.click();
					Thread.sleep(2000);
					WebElement Apply_Btn= driver.findElement(By.xpath("//button[@type='button']"));
					Apply_Btn.click();
					
					WebElement search_user= driver.findElement(By.xpath("//input[@id='standard-basic']"));
					search_user.sendKeys("sohel");
					Thread.sleep(3000);
					
		}
		//validate the user is able t click on recordings
		@Test
		public void tc10() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Recordings
					WebElement Reports_Recordings = driver.findElement(By.xpath("//span[normalize-space()='Recordings']"));
					Reports_Recordings.click();
			
					//Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Recordings']"));
					String current_title = title.getText();
					String Exp_Title = "Recordings";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//validate the user is able t click on recordings select project and click on go.
		@Test
		public void tc11() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Recordings
					WebElement Reports_Recordings = driver.findElement(By.xpath("//span[normalize-space()='Recordings']"));
					Reports_Recordings.click();
					
					Thread.sleep(2000);
					WebElement Projects = driver.findElement(By.xpath("//div[@id='createdProject']"));
					Projects.click();
					
					Thread.sleep(2000);
					WebElement List_box = driver.findElement(By.xpath("//li[@role='option']"));
					List_box.click();
					
					
					WebElement Go_btn = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
					Go_btn.click();
			
					//Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Recordings']"));
					String current_title = title.getText();
					String Exp_Title = "Recordings";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		
		//validate the user is able t click on recordings select project and click on go current day drp.
		@Test
		public void tc12() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//my_Project
			WebElement my_Project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
			my_Project.click();

					//Reports
					WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
					Reports.click();
					
					//Reports_Recordings
					WebElement Reports_Recordings = driver.findElement(By.xpath("//span[normalize-space()='Recordings']"));
					Reports_Recordings.click();
					
					Thread.sleep(2000);
					WebElement Projects = driver.findElement(By.xpath("//div[@id='createdProject']"));
					Projects.click();
					
					Thread.sleep(2000);
					WebElement List_box = driver.findElement(By.xpath("//li[@role='option']"));
					List_box.click();
					
					
					WebElement Go_btn = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
					Go_btn.click();
					
					WebElement current_day = driver.findElement(By.xpath("//em[normalize-space()='Current Day']"));
					current_day .click();
					Thread.sleep(2000);
					WebElement Two_weeks = driver.findElement(By.xpath("//em[normalize-space()='Last 2 Weeks']"));
					Two_weeks .click();
					Thread.sleep(2000);
					
					//Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Recordings']"));
					String current_title = title.getText();
					String Exp_Title = "Recordings";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
}
