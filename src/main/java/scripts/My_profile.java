package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class My_profile extends BaseClass {
	//Verifying Avatar drop down by clicking.
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
		
		WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
		my_profile.click();
		Thread.sleep(3000);
		
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='My Profile']"));
		String current_title = title.getText();
		String Exp_Title = "My Profile";
		Assert.assertEquals(current_title, Exp_Title);
		
	}
	//Verifying myProfile feature by clicking.
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
		
		WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
		my_profile.click();
		
		WebElement my_profile_edit = driver.findElement(By.xpath("//button[@aria-label='Add']"));
		my_profile_edit.click();
		Thread.sleep(1000);
		
		WebElement title = driver.findElement(By.xpath("//h2[normalize-space()='Personal Details']"));
		String current_title = title.getText();
		String Exp_Title = "Personal Details";
		Assert.assertEquals(current_title, Exp_Title);
	}
	//clicking on personal details edit button and fields.
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
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			
			WebElement my_profile_edit = driver.findElement(By.xpath("//button[@aria-label='Add']"));
			my_profile_edit.click();
			
			WebElement Personal_Details_FN = driver.findElement(By.xpath("//input[@id='firstName']"));
			Personal_Details_FN.click();
			
			WebElement Personal_Details_LN = driver.findElement(By.xpath("//input[@id='lastName']"));
			Personal_Details_LN.click();
			
			WebElement Personal_Details_Email = driver.findElement(By.xpath("//input[@id='email']"));
			Personal_Details_Email.isDisplayed();
			
			WebElement Personal_Details_Country = driver.findElement(By.xpath("//div[@id='CountryCode']"));
			Personal_Details_Country.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Country_India = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India);
			Country_India.click();
			
			WebElement Personal_Details_Save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			Personal_Details_Save.click();
			Thread.sleep(3000);
			
			WebElement title = driver.findElement(By.xpath("//span[@class='personalDetailsSpan']"));
			String current_title = title.getText();
			String Exp_Title = "PERSONAL DETAILS";
			Assert.assertEquals(current_title, Exp_Title);
		}
	
		//clicking on personal details save button with empty FN TF fields.
		@Test
		public void tc4() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			
			WebElement my_profile_edit = driver.findElement(By.xpath("//button[@aria-label='Add']"));
			my_profile_edit.click();
			
			WebElement Personal_Details_FN = driver.findElement(By.xpath("//input[@id='firstName']"));
			Personal_Details_FN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Thread.sleep(2000);
			
			WebElement Personal_Details_LN = driver.findElement(By.xpath("//input[@id='lastName']"));
			Personal_Details_LN.click();
			
			WebElement Personal_Details_Email = driver.findElement(By.xpath("//input[@id='email']"));
			Personal_Details_Email.isDisplayed();
			
			WebElement Personal_Details_Country = driver.findElement(By.xpath("//div[@id='CountryCode']"));
			Personal_Details_Country.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Country_India = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India);
			Country_India.click();
			
			WebElement Phone = driver.findElement(By.xpath("//input[@id='PhoneNumber']"));
			js.executeScript("arguments[0].scrollIntoView();", Phone);
			Phone.click();
			
			WebElement Industry = driver.findElement(By.xpath("//input[@id='Industry']"));
			js.executeScript("arguments[0].scrollIntoView();", Industry);
			Industry.click();
			
			
			WebElement Personal_Details_Save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			Personal_Details_Save.click();
			Thread.sleep(3000);
			
			WebElement title = driver.findElement(By.xpath("//p[@id='firstName-helper-text']"));
			String current_title = title.getText();
			String Exp_Title = "This Field is Required";
			Assert.assertEquals(current_title, Exp_Title);
		}
		//clicking on personal details save button with empty Phone Number TF fields.
		@Test
		public void tc5() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			
			WebElement my_profile_edit = driver.findElement(By.xpath("//button[@aria-label='Add']"));
			my_profile_edit.click();
			
			WebElement Personal_Details_FN = driver.findElement(By.xpath("//input[@id='firstName']"));
			Personal_Details_FN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Personal_Details_FN.sendKeys("SOHEL");
			Thread.sleep(2000);
			
			WebElement Personal_Details_LN = driver.findElement(By.xpath("//input[@id='lastName']"));
			Personal_Details_LN.click();
			
			WebElement Personal_Details_Email = driver.findElement(By.xpath("//input[@id='email']"));
			Personal_Details_Email.isDisplayed();
			
			WebElement Personal_Details_Country = driver.findElement(By.xpath("//div[@id='CountryCode']"));
			Personal_Details_Country.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Country_India = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India);
			Country_India.click();
			
			WebElement Phone = driver.findElement(By.xpath("//input[@id='PhoneNumber']"));
			js.executeScript("arguments[0].scrollIntoView();", Phone);
			Phone.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)); 
			
			WebElement Industry = driver.findElement(By.xpath("//input[@id='Industry']"));
			js.executeScript("arguments[0].scrollIntoView();", Industry);
			Industry.click();
			
			WebElement Personal_Details_Save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			Personal_Details_Save.click();
			Thread.sleep(2000);
			
			WebElement title = driver.findElement(By.xpath("//p[@id='PhoneNumber-helper-text']"));
			String current_title = title.getText();
			String Exp_Title = "This Field is Required";
			Assert.assertEquals(current_title, Exp_Title);
		}
		//clicking on personal details save button with All Valid fields fields click on Cancel Button.
		@Test
		public void tc6() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			
			WebElement my_profile_edit = driver.findElement(By.xpath("//button[@aria-label='Add']"));
			my_profile_edit.click();
			
			WebElement Personal_Details_FN = driver.findElement(By.xpath("//input[@id='firstName']"));
			Personal_Details_FN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Personal_Details_FN.sendKeys(p.getPropertyFiledata("first_name"));
			Thread.sleep(2000);
			
			WebElement Personal_Details_LN = driver.findElement(By.xpath("//input[@id='lastName']"));
			Personal_Details_LN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Personal_Details_LN.sendKeys(p.getPropertyFiledata("Last_Name"));
			
			WebElement Personal_Details_Email = driver.findElement(By.xpath("//input[@id='email']"));
			Personal_Details_Email.isDisplayed();
			
			WebElement Personal_Details_Country = driver.findElement(By.xpath("//div[@id='CountryCode']"));
			Personal_Details_Country.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Country_India = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India);
			Country_India.click();
			
			WebElement Phone = driver.findElement(By.xpath("//input[@id='PhoneNumber']"));
			js.executeScript("arguments[0].scrollIntoView();", Phone);
			Phone.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)); 
			Phone.sendKeys(p.getPropertyFiledata("phone"));
			
			WebElement Industry = driver.findElement(By.xpath("//input[@id='Industry']"));
			js.executeScript("arguments[0].scrollIntoView();", Industry);
			Industry.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Industry.sendKeys(p.getPropertyFiledata("Industryy"));
			
			WebElement Personal_Details_Cancel = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-textSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			Personal_Details_Cancel.click();
			Thread.sleep(2000);
			
			WebElement title = driver.findElement(By.xpath("//span[@class='personalDetailsSpan']"));
			String current_title = title.getText();
			String Exp_Title = "PERSONAL DETAILS";
			Assert.assertEquals(current_title, Exp_Title);
		}
		
		//clicking on personal details save button with All Valid fields fields and click on save button.
		@Test
		public void tc7() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			
			WebElement my_profile_edit = driver.findElement(By.xpath("//button[@aria-label='Add']"));
			my_profile_edit.click();
			
			WebElement Personal_Details_FN = driver.findElement(By.xpath("//input[@id='firstName']"));
			Personal_Details_FN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Personal_Details_FN.sendKeys(p.getPropertyFiledata("first_name"));
			Thread.sleep(2000);
			
			WebElement Personal_Details_LN = driver.findElement(By.xpath("//input[@id='lastName']"));
			Personal_Details_LN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Personal_Details_LN.sendKeys(p.getPropertyFiledata("Last_Name"));
			
			WebElement Personal_Details_Email = driver.findElement(By.xpath("//input[@id='email']"));
			Personal_Details_Email.isDisplayed();
			
			WebElement Personal_Details_Country = driver.findElement(By.xpath("//div[@id='CountryCode']"));
			Personal_Details_Country.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Country_India = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India);
			Country_India.click();
			
			WebElement Phone = driver.findElement(By.xpath("//input[@id='PhoneNumber']"));
			js.executeScript("arguments[0].scrollIntoView();", Phone);
			Phone.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE)); 
			Phone.sendKeys(p.getPropertyFiledata("phone"));
			
			WebElement Industry = driver.findElement(By.xpath("//input[@id='Industry']"));
			js.executeScript("arguments[0].scrollIntoView();", Industry);
			Industry.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Industry.sendKeys(p.getPropertyFiledata("Industryy"));
			
			WebElement Personal_Details_Save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			Personal_Details_Save.click();
			Thread.sleep(2000);
			
			WebElement title = driver.findElement(By.xpath("//span[@class='personalDetailsSpan']"));
			String current_title = title.getText();
			String Exp_Title = "PERSONAL DETAILS";
			Assert.assertEquals(current_title, Exp_Title);
		}
		
		//clicking on organization details- officer address Edit Button with All Valid fields fields click on Cancel Button.
		@Test
		public void tc8() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Office_address_edit = driver.findElement(By.xpath("//div[@class='flexRow pdngHSM']//div//button[@aria-label='Add']"));
			Office_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys(p.getPropertyFiledata("Organisation_Name"));
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys(p.getPropertyFiledata("Street"));
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//div[normalize-space()='Secunderabad']//div[@id='CountryCode']"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(p.getPropertyFiledata("PIN"));
			
			WebElement ofiice_adress = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-textSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress.click();
			Thread.sleep(2000);
			
			WebElement title = driver.findElement(By.xpath("//span[normalize-space()='OFFICE ADDRESS :']"));
			String current_title = title.getText();
			String Exp_Title = "OFFICE ADDRESS :";
			Assert.assertEquals(current_title, Exp_Title);
		}
		
		//clicking on organization details- officer address Edit Button with All Valid fields fields click on Save Button.
		@Test
		public void tc9() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Office_address_edit = driver.findElement(By.xpath("//div[@class='flexRow pdngHSM']//div//button[@aria-label='Add']"));
			Office_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys(p.getPropertyFiledata("Organisation_Name"));
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys(p.getPropertyFiledata("Street"));
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//body/div[contains(@role,'presentation')]/div[contains(@role,'none presentation')]/div[contains(@role,'dialog')]/div[contains(@class,'MuiDialogContent-root')]/div[contains(@class,'resRowColM')]/div[contains(@class,'resWidthM pdngXS')]/div[contains(@class,'MuiFormControl-root selectFeild MuiFormControl-marginDense MuiFormControl-fullWidth')]/div[1]"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(p.getPropertyFiledata("PIN"));
			
			WebElement ofiice_adress_save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_save.click();
			Thread.sleep(2000);
			
			WebElement title = driver.findElement(By.xpath("//span[normalize-space()='OFFICE ADDRESS :']"));
			String current_title = title.getText();
			String Exp_Title = "OFFICE ADDRESS :";
			Assert.assertEquals(current_title, Exp_Title);
		}
		//clicking on organization details- office address Edit Button with All Valid fields fields with invalid zip click on Save Button.
		@Test
		public void tc10() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Office_address_edit = driver.findElement(By.xpath("//div[@class='flexRow pdngHSM']//div//button[@aria-label='Add']"));
			Office_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys(p.getPropertyFiledata("Organisation_Name"));
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys(p.getPropertyFiledata("Street"));
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//div[normalize-space()='Secunderabad']//div[@id='CountryCode']"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(" ");
			
			WebElement ofiice_adress_save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_save.click();
			Thread.sleep(2000);
			
			WebElement error = driver.findElement(By.xpath("//p[@id='ZIP-helper-text']"));
			String current_error = error.getText();
			String Exp_error = "Please enter the valid ZIP code";
			Assert.assertEquals(current_error, Exp_error);
		}

		//clicking on organization details- officer address Edit Button with All Valid fields fields with empty organization name click on Save Button.
		@Test
		public void tc11() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Office_address_edit = driver.findElement(By.xpath("//div[@class='flexRow pdngHSM']//div//button[@aria-label='Add']"));
			Office_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys("");
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys(p.getPropertyFiledata("Street"));
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//div[normalize-space()='Secunderabad']//div[@id='CountryCode']"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(p.getPropertyFiledata("PIN"));
			
			WebElement ofiice_adress_save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_save.click();
			Thread.sleep(2000);
			
			WebElement error = driver.findElement(By.xpath("//p[@id='OrganisationName-helper-text']"));
			String current_error = error.getText();
			String Exp_error = "This Field is Required";
			Assert.assertEquals(current_error, Exp_error);
		}
		//clicking on organization details- officer address Edit Button with All Valid fields fields with emptyStreet TF click on Save Button.
		@Test
		public void tc12() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Office_address_edit = driver.findElement(By.xpath("//div[@class='flexRow pdngHSM']//div//button[@aria-label='Add']"));
			Office_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys(p.getPropertyFiledata("Organisation_Name"));
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys("");
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//body/div[contains(@role,'presentation')]/div[contains(@role,'none presentation')]/div[contains(@role,'dialog')]/div[contains(@class,'MuiDialogContent-root')]/div[contains(@class,'resRowColM')]/div[contains(@class,'resWidthM pdngXS')]/div[contains(@class,'MuiFormControl-root selectFeild MuiFormControl-marginDense MuiFormControl-fullWidth')]/div[1]"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(p.getPropertyFiledata("PIN"));
			
			WebElement ofiice_adress_save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_save.click();
			Thread.sleep(2000);
			
			WebElement error = driver.findElement(By.xpath("//p[@id='Street-helper-text']"));
			String current_error = error.getText();
			String Exp_error = "This Field is Required";
			Assert.assertEquals(current_error, Exp_error);
		}
		//clicking on organization details- officer address Edit Button with All Valid fields fields with special characters Street TF click on Save Button.
		@Test
		public void tc13() throws InterruptedException, IOException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Office_address_edit = driver.findElement(By.xpath("//div[@class='flexRow pdngHSM']//div//button[@aria-label='Add']"));
			Office_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys(p.getPropertyFiledata("Organisation_Name"));
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys("((*");
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//div[normalize-space()='Secunderabad']//div[@id='CountryCode']"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(p.getPropertyFiledata("PIN"));
			
			WebElement ofiice_adress_save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_save.click();
			Thread.sleep(2000);
			
			WebElement error = driver.findElement(By.xpath("//p[@id='Street-helper-text']"));
			String current_error = error.getText();
			String Exp_error = "Street Name Should Contains Alphabets, Numbers, Space and Symbols(_ @ . , ' / # & + -) Only";
			Assert.assertEquals(current_error, Exp_error);
		}
		
		//clicking on organization details- Billing Address Edit Button with All Valid fields and click on Save Button.
		@Test
		public void tc14() throws InterruptedException, IOException {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			Thread.sleep(2000);
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Billing_address_edit = driver.findElement(By.xpath("//div[contains(@class,'flexRow pdngHSM mrgnTMD')]//div//button[contains(@aria-label,'Add')]"));
			js.executeScript("arguments[0].scrollIntoView();", Billing_address_edit);
			Thread.sleep(1000);
			Billing_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys(p.getPropertyFiledata("Organisation_Name"));
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys(p.getPropertyFiledata("Street"));
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//body/div[contains(@role,'presentation')]/div[contains(@role,'none presentation')]/div[contains(@role,'dialog')]/div[contains(@class,'MuiDialogContent-root')]/div[contains(@class,'resRowColM')]/div[contains(@class,'resWidthM pdngXS')]/div[contains(@class,'MuiFormControl-root selectFeild MuiFormControl-marginDense MuiFormControl-fullWidth')]/div[1]"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(p.getPropertyFiledata("PIN"));
			
			WebElement GSTIN = driver.findElement(By.xpath("//input[@id='Gstin']"));
			js.executeScript("arguments[0].scrollIntoView();", GSTIN);
			GSTIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			GSTIN.sendKeys(p.getPropertyFiledata("GSTIN"));
			
			WebElement ofiice_adress_save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_save.click();
			Thread.sleep(2000);
			
			WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='My Profile']"));
			String current_title = title.getText();
			String Exp_Title = "My Profile";
			Assert.assertEquals(current_title, Exp_Title);
			
		}
		//clicking on organization details- Billing Address Edit Button with All Valid fields and click on Cancel Button.
		@Test
		public void tc15() throws InterruptedException, IOException {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			Thread.sleep(2000);
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Billing_address_edit = driver.findElement(By.xpath("//div[contains(@class,'flexRow pdngHSM mrgnTMD')]//div//button[contains(@aria-label,'Add')]"));
			js.executeScript("arguments[0].scrollIntoView();", Billing_address_edit);
			Thread.sleep(1000);
			Billing_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys(p.getPropertyFiledata("Organisation_Name"));
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys(p.getPropertyFiledata("Street"));
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//body/div[contains(@role,'presentation')]/div[contains(@role,'none presentation')]/div[contains(@role,'dialog')]/div[contains(@class,'MuiDialogContent-root')]/div[contains(@class,'resRowColM')]/div[contains(@class,'resWidthM pdngXS')]/div[contains(@class,'MuiFormControl-root selectFeild MuiFormControl-marginDense MuiFormControl-fullWidth')]/div[1]"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(p.getPropertyFiledata("PIN"));
			
			WebElement GSTIN = driver.findElement(By.xpath("//input[@id='Gstin']"));
			js.executeScript("arguments[0].scrollIntoView();", GSTIN);
			GSTIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			GSTIN.sendKeys(p.getPropertyFiledata("GSTIN"));
			
			WebElement ofiice_adress_Cancel = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-textSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_Cancel.click();
			Thread.sleep(2000);
			
			WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='My Profile']"));
			String current_title = title.getText();
			String Exp_Title = "My Profile";
			Assert.assertEquals(current_title, Exp_Title);
			
		}

		//clicking on organization details- Billing Address Edit Button with All Valid fields with Empty Organization Text Field and click on Cancel Button.
		@Test
		public void tc16() throws InterruptedException, IOException {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			Thread.sleep(2000);
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Billing_address_edit = driver.findElement(By.xpath("//div[contains(@class,'flexRow pdngHSM mrgnTMD')]//div//button[contains(@aria-label,'Add')]"));
			js.executeScript("arguments[0].scrollIntoView();", Billing_address_edit);
			Thread.sleep(1000);
			Billing_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys("");
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys(p.getPropertyFiledata("Street"));
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//body/div[contains(@role,'presentation')]/div[contains(@role,'none presentation')]/div[contains(@role,'dialog')]/div[contains(@class,'MuiDialogContent-root')]/div[contains(@class,'resRowColM')]/div[contains(@class,'resWidthM pdngXS')]/div[contains(@class,'MuiFormControl-root selectFeild MuiFormControl-marginDense MuiFormControl-fullWidth')]/div[1]"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(p.getPropertyFiledata("PIN"));
			
			WebElement GSTIN = driver.findElement(By.xpath("//input[@id='Gstin']"));
			js.executeScript("arguments[0].scrollIntoView();", GSTIN);
			GSTIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			GSTIN.sendKeys(p.getPropertyFiledata("GSTIN"));
			
			WebElement ofiice_adress_save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_save.click();
			Thread.sleep(2000);
			
			WebElement error = driver.findElement(By.xpath("//p[@id='OrganisationName-helper-text']"));
			String current_error = error.getText();
			String Exp_error = "This Field is Required";
			Assert.assertEquals(current_error, Exp_error);
			
		}
		//clicking on organization details- Billing Address Edit Button with All Valid fields with characters in Street Text Field and click on Cancel Button.
		@Test
		public void tc17() throws InterruptedException, IOException {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			Thread.sleep(2000);
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Billing_address_edit = driver.findElement(By.xpath("//div[contains(@class,'flexRow pdngHSM mrgnTMD')]//div//button[contains(@aria-label,'Add')]"));
			js.executeScript("arguments[0].scrollIntoView();", Billing_address_edit);
			Thread.sleep(1000);
			Billing_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys(p.getPropertyFiledata("Organisation_Name"));
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys("%^&");
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//body/div[contains(@role,'presentation')]/div[contains(@role,'none presentation')]/div[contains(@role,'dialog')]/div[contains(@class,'MuiDialogContent-root')]/div[contains(@class,'resRowColM')]/div[contains(@class,'resWidthM pdngXS')]/div[contains(@class,'MuiFormControl-root selectFeild MuiFormControl-marginDense MuiFormControl-fullWidth')]/div[1]"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(p.getPropertyFiledata("PIN"));
			
			WebElement GSTIN = driver.findElement(By.xpath("//input[@id='Gstin']"));
			js.executeScript("arguments[0].scrollIntoView();", GSTIN);
			GSTIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			GSTIN.sendKeys(p.getPropertyFiledata("GSTIN"));
			
			WebElement ofiice_adress_save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_save.click();
			Thread.sleep(2000);
			
			WebElement error = driver.findElement(By.xpath("//p[@id='Street-helper-text']"));
			String current_error = error.getText();
			String Exp_error = "Street Name Should Contains Alphabets, Numbers, Space and Symbols(_ @ . , ' / # & + -) Only";
			Assert.assertEquals(current_error, Exp_error);
			
		}
		//clicking on organization details- Billing Address Edit Button with All Valid fields with alphabets in GSTIN Text field and click on Cancel Button.
		@Test
		public void tc18() throws InterruptedException, IOException {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Billing_address_edit = driver.findElement(By.xpath("//div[contains(@class,'flexRow pdngHSM mrgnTMD')]//div//button[contains(@aria-label,'Add')]"));
			js.executeScript("arguments[0].scrollIntoView();", Billing_address_edit);
			Thread.sleep(1000);
			Billing_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys(p.getPropertyFiledata("Organisation_Name"));
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys(p.getPropertyFiledata("Street"));
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//body/div[contains(@role,'presentation')]/div[contains(@role,'none presentation')]/div[contains(@role,'dialog')]/div[contains(@class,'MuiDialogContent-root')]/div[contains(@class,'resRowColM')]/div[contains(@class,'resWidthM pdngXS')]/div[contains(@class,'MuiFormControl-root selectFeild MuiFormControl-marginDense MuiFormControl-fullWidth')]/div[1]"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(p.getPropertyFiledata("PIN"));
			
			WebElement GSTIN = driver.findElement(By.xpath("//input[@id='Gstin']"));
			js.executeScript("arguments[0].scrollIntoView();", GSTIN);
			GSTIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			GSTIN.sendKeys("dsfg");
			
			WebElement ofiice_adress_save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_save.click();
			Thread.sleep(2000);
			
			WebElement error = driver.findElement(By.xpath("//p[@id='Gstin-helper-text']"));
			String current_error = error.getText();
			String Exp_error = "Please enter the valid GSTIN";
			Assert.assertEquals(current_error, Exp_error);
			
		}
		//clicking on organization details- Billing Address Edit Button with All Valid fields with only Numbers in GSTIN Text field and click on Cancel Button.
		@Test
		public void tc19() throws InterruptedException, IOException {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Billing_address_edit = driver.findElement(By.xpath("//div[contains(@class,'flexRow pdngHSM mrgnTMD')]//div//button[contains(@aria-label,'Add')]"));
			js.executeScript("arguments[0].scrollIntoView();", Billing_address_edit);
			Thread.sleep(1000);
			Billing_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys(p.getPropertyFiledata("Organisation_Name"));
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys(p.getPropertyFiledata("Street"));
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//body/div[contains(@role,'presentation')]/div[contains(@role,'none presentation')]/div[contains(@role,'dialog')]/div[contains(@class,'MuiDialogContent-root')]/div[contains(@class,'resRowColM')]/div[contains(@class,'resWidthM pdngXS')]/div[contains(@class,'MuiFormControl-root selectFeild MuiFormControl-marginDense MuiFormControl-fullWidth')]/div[1]"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys(p.getPropertyFiledata("PIN"));
			
			WebElement GSTIN = driver.findElement(By.xpath("//input[@id='Gstin']"));
			js.executeScript("arguments[0].scrollIntoView();", GSTIN);
			GSTIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			GSTIN.sendKeys("76478837683579");
			
			WebElement ofiice_adress_save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_save.click();
			Thread.sleep(2000);
			
			WebElement error = driver.findElement(By.xpath("//p[@id='Gstin-helper-text']"));
			String current_error = error.getText();
			String Exp_error = "Please enter the valid GSTIN";
			Assert.assertEquals(current_error, Exp_error);
			
		}
		//clicking on organization details- Billing Address Edit Button with All Valid fields and invalid ZIP  and click on Save Button.
		@Test
		public void tc20() throws InterruptedException, IOException {

			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			Thread.sleep(2000);
			
			WebElement profile_drp = driver.findElement(By.id("preview"));
			profile_drp.click();
			
			WebElement my_profile = driver.findElement(By.xpath("//li[@id='myProfile']"));
			my_profile.click();
			Thread.sleep(2000);
			
			WebElement organization_details = driver.findElement(By.xpath("//button[normalize-space()='Organisation Details']"));
			organization_details.click();
			
			
			WebElement Billing_address_edit = driver.findElement(By.xpath("//div[contains(@class,'flexRow pdngHSM mrgnTMD')]//div//button[contains(@aria-label,'Add')]"));
			js.executeScript("arguments[0].scrollIntoView();", Billing_address_edit);
			Thread.sleep(1000);
			Billing_address_edit.click();
			
			WebElement Organisation_Name = driver.findElement(By.xpath("//input[@id='OrganisationName']"));
			Organisation_Name.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Organisation_Name.sendKeys(p.getPropertyFiledata("Organisation_Name"));
			Thread.sleep(2000);
			
			WebElement Street = driver.findElement(By.xpath("//input[@id='Street']"));
			Street.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			Street.sendKeys(p.getPropertyFiledata("Street"));
			
			WebElement organization_Details_Country = driver.findElement(By.xpath("//div[normalize-space()='India']//div[@id='CountryCode']"));
			organization_Details_Country.click();
			
			WebElement Country_India1 = driver.findElement(By.xpath("//li[normalize-space()='India']"));
			js.executeScript("arguments[0].scrollIntoView();", Country_India1);
			Country_India1.click();
			
			WebElement State_drp = driver.findElement(By.xpath("//div[normalize-space()='Telangana']//div[@id='CountryCode']"));
			State_drp.click();
			
			WebElement State_Telangana = driver.findElement(By.xpath("//li[normalize-space()='Telangana']"));
			js.executeScript("arguments[0].scrollIntoView();", State_Telangana);
			State_Telangana.click();
			
			WebElement City_drp = driver.findElement(By.xpath("//body/div[contains(@role,'presentation')]/div[contains(@role,'none presentation')]/div[contains(@role,'dialog')]/div[contains(@class,'MuiDialogContent-root')]/div[contains(@class,'resRowColM')]/div[contains(@class,'resWidthM pdngXS')]/div[contains(@class,'MuiFormControl-root selectFeild MuiFormControl-marginDense MuiFormControl-fullWidth')]/div[1]"));
			City_drp.click();
			
			WebElement City_secundarabad = driver.findElement(By.xpath("//li[normalize-space()='Secunderabad']"));
			js.executeScript("arguments[0].scrollIntoView();", City_secundarabad);
			City_secundarabad.click();
			
			WebElement PIN = driver.findElement(By.xpath("//input[@id='ZIP']"));
			js.executeScript("arguments[0].scrollIntoView();", PIN);
			PIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			PIN.sendKeys("jhf&#&68");
			
			WebElement GSTIN = driver.findElement(By.xpath("//input[@id='Gstin']"));
			js.executeScript("arguments[0].scrollIntoView();", GSTIN);
			GSTIN.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			GSTIN.sendKeys(p.getPropertyFiledata("GSTIN"));
			
			WebElement ofiice_adress_save = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
			ofiice_adress_save.click();
			Thread.sleep(2000);
			
			WebElement error = driver.findElement(By.xpath("//p[@id='ZIP-helper-text']"));
			String current_error = error.getText();
			String Exp_error = "Please enter the valid ZIP code";
			Assert.assertEquals(current_error, Exp_error);
			
		}



}
