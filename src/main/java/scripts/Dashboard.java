package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Dashboard extends BaseClass  {
	@Test
	public void tc1() throws InterruptedException, IOException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		//Thread.sleep(5000);
		
		//new_Project
		WebElement new_Project = driver.findElement(By.xpath("//body/div[@id='root']/div[contains(@class,'baseBlockCntnr')]/div[contains(@class,'flexCol')]/div[contains(@class,'flexCol innerMainCntnr innerCntnrWidth')]/div[contains(@class,'flexCol dashboard pdngSM')]/div[contains(@class,'flexWrap dashboardWrap')]/div[contains(@class,'resWidth respdngSM resMrgnV')]/div[contains(@class,'brdrRadiusXSM')]/div[contains(@class,'flexAutoRow')]/div[contains(@class,'flexAutoCol')]/button[1]"));
		new_Project.isDisplayed();
		
		//invite_user
		WebElement invite_user = driver.findElement(By.xpath("//a[contains(@href,'/user-management')]//button[contains(@type,'button')]"));
		invite_user.isDisplayed();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		
		//make_Payment
		WebElement make_Payment = driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained whiteTxt MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation')]"));
		js.executeScript("arguments[0].scrollIntoView();", make_Payment);
		Thread.sleep(2000);
		
		
		//more_Link
		WebElement more_Link = driver.findElement(By.xpath("//span[@class='link']"));
		more_Link.click();
		
		//list_of_features_inAPI
		//Dashboard
		WebElement Dashboard = driver.findElement(By.xpath("//li[1]//a[1]"));
		Dashboard.isDisplayed();
		
		//my_project
		WebElement my_project = driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]"));
		my_project.isDisplayed();
		
		//Billing_Center
		WebElement Billing_Center = driver.findElement(By.xpath("//div[contains(@class,'navAnchor alignCntr pdngSM pointer')]"));
		//Billing_Center.isDisplayed();
		Billing_Center.click();
		
		//Billing_Center_payment
		WebElement Billing_Center_payment = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]/div[2]/span[1]"));
		Billing_Center_payment.click();
		
		//Billing_Center_payment_History
		WebElement Billing_Center_payment_History = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]/div[2]/span[1]"));
		Billing_Center_payment_History.click();
		
		//Reports
		WebElement Reports = driver.findElement(By.xpath("//div[contains(@class,'flexRow pointer navAnchor alignCntr pdngSM')]"));
		Reports.click();
		
		//Reports_Analytics 	
		WebElement Reports_Analytics = driver.findElement(By.xpath("//a[contains(@href,'/reports/analytics')]"));
		Reports_Analytics.click();
		
		//Reports_Activity_log
		WebElement Reports_Activity_log = driver.findElement(By.xpath("//a[@href='/reports/activity-log']"));
		Reports_Activity_log.click();
		
		//Reports_Recordings
		WebElement Reports_Recordings = driver.findElement(By.xpath("//span[normalize-space()='Recordings']"));
		Reports_Recordings.click();
		
		//User_Management
		WebElement User_Management = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]"));
		User_Management.click();
		
		//Resources
		WebElement Resources = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]/div[1]/div[2]/span[1]"));
		Resources.click();
		
		//Help_Desk
		WebElement Help_Desk = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[7]/a[1]/div[1]/div[2]/span[1]"));
		Help_Desk.click();
		
		//Log_out
		WebElement Log_out = driver.findElement(By.xpath("//div[contains(@class,'pointer resPdngXXS')]"));
		Log_out.click();
	
	}
	
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
		
		//Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='My Projects']"));
		String current_title = title.getText();
		String Exp_Title = "My Projects";
		Assert.assertEquals(current_title, Exp_Title);
		
		
	}
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

		//Billing_Center
		WebElement Billing_Center = driver.findElement(By.xpath("//div[contains(@class,'navAnchor alignCntr pdngSM pointer')]"));
		Billing_Center.click();
		
		//Billing_Center_payment
		WebElement Billing_Center_payment = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]/div[2]/span[1]"));
		Billing_Center_payment.click();
		
		
		//Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Payment']"));
		String current_title = title.getText();
		String Exp_Title = "Payment";
		Assert.assertEquals(current_title, Exp_Title);
		
		
	}
	
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

		//Billing_Center
		WebElement Billing_Center = driver.findElement(By.xpath("//div[contains(@class,'navAnchor alignCntr pdngSM pointer')]"));
		Billing_Center.click();
		
		//Billing_Center_payment
		WebElement Billing_Center_payment = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]/div[2]/span[1]"));
		Billing_Center_payment.click();
		
		//Billing_Center_payment_History
				WebElement Billing_Center_payment_History = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]/div[2]/span[1]"));
				Billing_Center_payment_History.click();
				
		
		//Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Payment History']"));
		String current_title = title.getText();
		String Exp_Title = "Payment History";
		Assert.assertEquals(current_title, Exp_Title);
		
		
	}
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
				
				//Reports_Analytics 	
				WebElement Reports_Analytics = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]/div[2]/span[1]"));
				Reports_Analytics.click();
		
		//Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Analytics']"));
		String current_title = title.getText();
		String Exp_Title = "Analytics";
		Assert.assertEquals(current_title, Exp_Title);
		
		
	}
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
		
		//Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Activity Log']"));
		String current_title = title.getText();
		String Exp_Title = "Activity Log";
		Assert.assertEquals(current_title, Exp_Title);
		
		
	}
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
				
				//Reports_Recordings
				WebElement Reports_Recordings = driver.findElement(By.xpath("//span[normalize-space()='Recordings']"));
				Reports_Recordings.click();
		
				//Thread.sleep(2000);
				WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Recordings']"));
				String current_title = title.getText();
				String Exp_Title = "Recordings";
				Assert.assertEquals(current_title, Exp_Title);
				
	}
	@Test
	public void tc8() throws IOException, InterruptedException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		//Thread.sleep(5000);
		
		//User_Management
				WebElement User_Management = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]"));
				User_Management.click();
				
				//Thread.sleep(2000);
				WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='User Management']"));
				String current_title = title.getText();
				String Exp_Title = "User Management";
				Assert.assertEquals(current_title, Exp_Title);
				
	}
	@Test
	public void tc9() throws IOException, InterruptedException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		//Thread.sleep(5000);
		
		//Resources
				WebElement Resources = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]/div[1]/div[2]/span[1]"));
				Resources.click();
				
				//Thread.sleep(2000);
				WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Resources']"));
				String current_title = title.getText();
				String Exp_Title = "Resources";
				Assert.assertEquals(current_title, Exp_Title);
				
	}
	
	@Test
	public void tc10() throws IOException, InterruptedException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		//Thread.sleep(5000);
		
		//Help_Desk
				WebElement Help_Desk = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[7]/a[1]/div[1]/div[2]/span[1]"));
				Help_Desk.click();
				
				//Thread.sleep(2000);
				WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Help Desk']"));
				String current_title = title.getText();
				String Exp_Title = "Help Desk";
				Assert.assertEquals(current_title, Exp_Title);
				
	}
	
	@Test
	public void tc11() throws IOException, InterruptedException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		//Thread.sleep(5000);
		
		//Log_out
				WebElement Log_out = driver.findElement(By.xpath("//div[contains(@class,'pointer resPdngXXS')]"));
				Log_out.click();
				
				//Thread.sleep(2000);
				WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Login']"));
				String current_title = title.getText();
				String Exp_Title = "Login";
				Assert.assertEquals(current_title, Exp_Title);
				
	}
	
}
