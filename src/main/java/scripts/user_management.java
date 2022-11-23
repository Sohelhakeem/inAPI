package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class user_management extends BaseClass{
	//Validate the user is able to click on user management feature.
	@Test
	public void tc1() throws IOException, InterruptedException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		Thread.sleep(2000);
		
		//User_Management
				WebElement User_Management = driver.findElement(By.xpath("//li[6]//a[1]"));
				User_Management.click();
				
				//Thread.sleep(2000);
				WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='User Management']"));
				String current_title = title.getText();
				String Exp_Title = "User Management";
				Assert.assertEquals(current_title, Exp_Title);
				
	}
	
	
		//Validate the user is able to click on add_user.
		@Test
		public void tc2() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//User_Management
					WebElement User_Management = driver.findElement(By.xpath("//li[6]//a[1]"));
					User_Management.click();
					Thread.sleep(2000);
					WebElement add_user = driver.findElement(By.xpath("//button[@type='button']"));
					add_user.click();
					Thread.sleep(3000);
					
					
					//Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='User Management']"));
					String current_title = title.getText();
					String Exp_Title = "User Management";
					Assert.assertEquals(current_title, Exp_Title);
					
		
	}
		//Validate the user is able to add_user with existed mail id.
		@Test
		public void tc3() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//User_Management
					WebElement User_Management = driver.findElement(By.xpath("//li[6]//a[1]"));
					User_Management.click();
					Thread.sleep(2000);
					WebElement add_user = driver.findElement(By.xpath("//button[@type='button']"));
					add_user.click();
					Thread.sleep(2000);
					WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
					userName.sendKeys(p.getPropertyFiledata("first_name"));
					Thread.sleep(2000);
					
					WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
					userEmail.sendKeys(p.getPropertyFiledata("email"));
					Thread.sleep(2000);
					WebElement Admin = driver.findElement(By.xpath("//input[@value='Admin']"));
					Admin.click();
					Thread.sleep(1000);
					Admin.click();
					
					WebElement Creator = driver.findElement(By.xpath("//input[@value='Creator']"));
					Creator.click();
					Thread.sleep(1000);
					//Admin.click();
					
					WebElement BillingAdmin = driver.findElement(By.xpath("//input[@value='BillingAdmin']"));
					BillingAdmin.click();
					Thread.sleep(1000);
					BillingAdmin.click();
					
					WebElement Member = driver.findElement(By.xpath("//input[@value='Member']"));
					Member.click();
					Thread.sleep(1000);
					Member.click();
					
					WebElement projects = driver.findElement(By.xpath("//div[@id='projects']"));
					projects.click();
					Thread.sleep(1000);
					
					WebElement option = driver.findElement(By.xpath("//li[@role='option']"));
					option.click();
					Thread.sleep(1000);
					
					WebElement SAVE = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
					SAVE.click();
					Thread.sleep(3000);
					
					
					//Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='User Management']"));
					String current_title = title.getText();
					String Exp_Title = "User Management";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//Validate the user is able to add_user with existed mail id.
		@Test
		public void tc4() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//User_Management
					WebElement User_Management = driver.findElement(By.xpath("//li[6]//a[1]"));
					User_Management.click();
					Thread.sleep(2000);
					WebElement add_user = driver.findElement(By.xpath("//button[@type='button']"));
					add_user.click();
					Thread.sleep(2000);
					WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
					userName.sendKeys(p.getPropertyFiledata("first_name"));
					Thread.sleep(2000);
					
					WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
					userEmail.sendKeys(p.getPropertyFiledata("email"));
					Thread.sleep(2000);
					WebElement Admin = driver.findElement(By.xpath("//input[@value='Admin']"));
					Admin.click();
					Thread.sleep(1000);
					Admin.click();
					
					WebElement Creator = driver.findElement(By.xpath("//input[@value='Creator']"));
					Creator.click();
					Thread.sleep(1000);
					//Admin.click();
					
					WebElement BillingAdmin = driver.findElement(By.xpath("//input[@value='BillingAdmin']"));
					BillingAdmin.click();
					Thread.sleep(1000);
					BillingAdmin.click();
					
					WebElement Member = driver.findElement(By.xpath("//input[@value='Member']"));
					Member.click();
					Thread.sleep(1000);
					Member.click();
					
					WebElement projects = driver.findElement(By.xpath("//div[@id='projects']"));
					projects.click();
					Thread.sleep(1000);
					
					WebElement option = driver.findElement(By.xpath("//li[@role='option']"));
					option.click();
					Thread.sleep(1000);
					
					WebElement Cancel = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-textSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
					Cancel.click();
					Thread.sleep(2000);
					
					
					//Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='User Management']"));
					String current_title = title.getText();
					String Exp_Title = "User Management";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//Validate the user is able to add_user.
		@Test
		public void tc5() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//User_Management
					WebElement User_Management = driver.findElement(By.xpath("//li[6]//a[1]"));
					User_Management.click();
					Thread.sleep(2000);
					WebElement add_user = driver.findElement(By.xpath("//button[@type='button']"));
					add_user.click();
					Thread.sleep(2000);
					WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
					userName.sendKeys(p.getPropertyFiledata("first_name"));
					Thread.sleep(2000);
					
					WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
					userEmail.sendKeys("sohelhakeem99@gmail.com");
					Thread.sleep(2000);
					WebElement Admin = driver.findElement(By.xpath("//input[@value='Admin']"));
					Admin.click();
					Thread.sleep(1000);
					
					WebElement projects = driver.findElement(By.xpath("//div[@id='projects']"));
					projects.click();
					Thread.sleep(1000);
					
					WebElement option = driver.findElement(By.xpath("//li[@role='option']"));
					option.click();
					Thread.sleep(1000);
					
					WebElement SAVE = driver.findElement(By.xpath("//span[normalize-space()='SAVE']"));
					SAVE.click();
					Thread.sleep(3000);
					
					
					//Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='User Management']"));
					String current_title = title.getText();
					String Exp_Title = "User Management";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//Validate the user is able to Edit_user.
		@Test
		public void tc6() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//User_Management
					WebElement User_Management = driver.findElement(By.xpath("//li[6]//a[1]"));
					User_Management.click();
					Thread.sleep(2000);
					WebElement User_Edit = driver.findElement(By.xpath("//a[contains(@class,'pdngHSM')]"));
					User_Edit.click();
					Thread.sleep(2000);
					
					WebElement Cancel = driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-textSizeSmall MuiButton-sizeSmall MuiButton-disableElevation')]"));
					Cancel.click();
					Thread.sleep(2000);
					
					//Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='User Management']"));
					String current_title = title.getText();
					String Exp_Title = "User Management";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//Validate the user is able to Edit_user.
		@Test
		public void tc7() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//User_Management
					WebElement User_Management = driver.findElement(By.xpath("//li[6]//a[1]"));
					User_Management.click();
					Thread.sleep(2000);
					WebElement delete = driver.findElement(By.xpath("//img[@alt='delete']"));
					delete.click();
					Thread.sleep(2000);
					
					WebElement Delete = driver.findElement(By.xpath("//button[2]"));
					Delete.click();
					Thread.sleep(2000);
					
					//Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='User Management']"));
					String current_title = title.getText();
					String Exp_Title = "User Management";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
}
