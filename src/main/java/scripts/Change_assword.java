package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Change_assword extends BaseClass {
	//Verifying profile drop down SettingFeature by clicking.
		@Test
		public void tc1() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement Setting = driver.findElement(By.xpath("//li[@id='settings']"));
			Setting.click();
			Thread.sleep(3000);
			
			WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Settings']"));
			String current_title = title.getText();
			String Exp_Title = "Settings";
			Assert.assertEquals(current_title, Exp_Title);
			
		}
		//Verifying profile drop down Setting Change password by entering valid current password and different new and confirm Password.
		@Test
		public void tc2() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement Setting = driver.findElement(By.xpath("//li[@id='settings']"));
			Setting.click();
			
			WebElement currentPassword = driver.findElement(By.xpath("//input[@id='currentPassword']"));
			currentPassword.sendKeys("Belgaum@123");
			
			WebElement newPassword = driver.findElement(By.xpath("//input[@id='newPassword']"));
			newPassword.sendKeys("Belgaum@1234");
			
			WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
			confirmPassword.sendKeys("Belgaum@1236");
			
			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			Thread.sleep(2000);
			
			WebElement erroe_msg = driver.findElement(By.xpath("//div[@aria-describedby='password-error-text']//p[@id='txtLastname-error']"));
			String current_erroe_msg = erroe_msg.getText();
			String Exp_erroe_msg = "Confirm password should match the new password";
			Assert.assertEquals(current_erroe_msg, Exp_erroe_msg);
			
		}
		//Verifying profile drop down Setting Change password by entering valid current password and  new and confirm Password- same for all.
		@Test
		public void tc3() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement Setting = driver.findElement(By.xpath("//li[@id='settings']"));
			Setting.click();
			
			WebElement currentPassword = driver.findElement(By.xpath("//input[@id='currentPassword']"));
			currentPassword.sendKeys("Belgaum@123");
			
			WebElement newPassword = driver.findElement(By.xpath("//input[@id='newPassword']"));
			newPassword.sendKeys("Belgaum@123");
			
			WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
			confirmPassword.sendKeys("Belgaum@123");
			
			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			Thread.sleep(2000);
			
			WebElement error_msg = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/form[1]/div[2]/p[1]"));
			String current_error_msg = error_msg.getText();
			String Exp_error_msg = "New password should not match with current password";
			Assert.assertEquals(current_error_msg, Exp_error_msg);
			
		}
		//Verifying profile drop down Setting Change password by entering valid current password and less thank 8 characters new and confirm Password- same for all.
		@Test
		public void tc4() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement Setting = driver.findElement(By.xpath("//li[@id='settings']"));
			Setting.click();
			
			WebElement currentPassword = driver.findElement(By.xpath("//input[@id='currentPassword']"));
			currentPassword.sendKeys("Belgaum@123");
			
			WebElement newPassword = driver.findElement(By.xpath("//input[@id='newPassword']"));
			newPassword.sendKeys("Bel@123");
			
			WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
			confirmPassword.sendKeys("Bel@123");
			
			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			Thread.sleep(2000);
			
			WebElement error_msg = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/form[1]/div[2]/p[1]"));
			String current_error_msg = error_msg.getText();
			String Exp_error_msg = "Password should be eight characters long and combination one uppercase, one lowercase, one digit and one special character";
			Assert.assertEquals(current_error_msg, Exp_error_msg);
			
		}
		//Verifying profile drop down Setting Change password by entering valid current password and Entering only characters new and confirm Password- same for all.
		@Test
		public void tc5() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement Setting = driver.findElement(By.xpath("//li[@id='settings']"));
			Setting.click();
			
			WebElement currentPassword = driver.findElement(By.xpath("//input[@id='currentPassword']"));
			currentPassword.sendKeys("Belgaum@123");
			
			WebElement newPassword = driver.findElement(By.xpath("//input[@id='newPassword']"));
			newPassword.sendKeys("Belgaumka");
			
			WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
			confirmPassword.sendKeys("Belgaumka");
			
			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			Thread.sleep(2000);
			
			WebElement error_msg = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/form[1]/div[2]/p[1]"));
			String current_error_msg = error_msg.getText();
			String Exp_error_msg = "Password should be eight characters long and combination one uppercase, one lowercase, one digit and one special character";
			Assert.assertEquals(current_error_msg, Exp_error_msg);
			
		}
		//Verifying profile drop down Setting Change password by entering valid current password and Entering only Numerical new and confirm Password- same for all.
		@Test
		public void tc6() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement Setting = driver.findElement(By.xpath("//li[@id='settings']"));
			Setting.click();
			
			WebElement currentPassword = driver.findElement(By.xpath("//input[@id='currentPassword']"));
			currentPassword.sendKeys("Belgaum@123");
			
			WebElement newPassword = driver.findElement(By.xpath("//input[@id='newPassword']"));
			newPassword.sendKeys("12345678");
			
			WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
			confirmPassword.sendKeys("12345678");
			
			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			Thread.sleep(2000);
			
			WebElement error_msg = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/form[1]/div[2]/p[1]"));
			String current_error_msg = error_msg.getText();
			String Exp_error_msg = "Password should be eight characters long and combination one uppercase, one lowercase, one digit and one special character";
			Assert.assertEquals(current_error_msg, Exp_error_msg);
			
		}
		//Verifying profile drop down Setting Change password by entering valid current password and Entering only special characters new and confirm Password- same for all.
		@Test
		public void tc7() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement Setting = driver.findElement(By.xpath("//li[@id='settings']"));
			Setting.click();
			
			WebElement currentPassword = driver.findElement(By.xpath("//input[@id='currentPassword']"));
			currentPassword.sendKeys("Belgaum@123");
			
			WebElement newPassword = driver.findElement(By.xpath("//input[@id='newPassword']"));
			newPassword.sendKeys("!@#$%^&*(");
			
			WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
			confirmPassword.sendKeys("!@#$%^&*(");
			
			WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
			submit.click();
			Thread.sleep(2000);
			
			WebElement error_msg = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/form[1]/div[2]/p[1]"));
			String current_error_msg = error_msg.getText();
			String Exp_error_msg = "Password should be eight characters long and combination one uppercase, one lowercase, one digit and one special character";
			Assert.assertEquals(current_error_msg, Exp_error_msg);
			
		}
		//Verifying profile drop down Setting Change password by entering valid current password and Entering valid new and confirm Password- same for all.
		@Test
		public void tc8() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement Setting = driver.findElement(By.xpath("//li[@id='settings']"));
			Setting.click();
			
			WebElement currentPassword = driver.findElement(By.xpath("//input[@id='currentPassword']"));
			currentPassword.sendKeys("Belgaum@123");
			
			WebElement newPassword = driver.findElement(By.xpath("//input[@id='newPassword']"));
			newPassword.sendKeys("Hyderabd@123");
			
			WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
			confirmPassword.sendKeys("Hyderabad@123");
			
			WebElement cancel = driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/form/div/div[1]/button[1]"));
			cancel.click();
			Thread.sleep(2000);
			
			WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Settings']"));
			String current_title = title.getText();
			String Exp_Title = "Settings";
			Assert.assertEquals(current_title, Exp_Title);
		}

}
