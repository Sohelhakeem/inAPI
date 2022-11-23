package scripts;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class HelpDesk extends BaseClass{
	
//Validating the functionality of Help Desk.
	@Test
	public void tc1() throws IOException, InterruptedException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		//Thread.sleep(5000);
		
		//Help_Desk
				WebElement Help_Desk = driver.findElement(By.xpath("//a[contains(@href,'/support')]"));
				Help_Desk.click();
				
				//Thread.sleep(2000);
				WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Help Desk']"));
				String current_title = title.getText();
				String Exp_Title = "Help Desk";
				Assert.assertEquals(current_title, Exp_Title);
				
	}
	//Validate the functionality of Support_Center LINK
		@Test
		public void tc2() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//Help_Desk
					WebElement Help_Desk = driver.findElement(By.xpath("//a[contains(@href,'/support')]"));
					Help_Desk.click();
					
					WebElement Help_Center= driver.findElement(By.xpath("//a[@href='https://help.peoplelinkvc.com/portal/en/home']//div[@class='flexRow justifyBtwn alignCntr pdngVSM mrgnBSM brdrBSM']"));
					Help_Center.click();
					String parentID = driver.getWindowHandle();
					ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
					if(parentID.equals(tabs2.get(0))) {
					  driver.switchTo().window(tabs2.get(1));
					}else {
					  driver.switchTo().window(tabs2.get(0));
					}
					
					Thread.sleep(2000);

					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Welcome to HelpDesk PeopleLink']"));
					String current_title = title.getText();
					String Exp_Title = "Welcome to HelpDesk PeopleLink";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//Validate the functionality of open new ticket LINK
		@Test
		public void tc3() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//Help_Desk
					WebElement Help_Desk = driver.findElement(By.xpath("//a[contains(@href,'/support')]"));
					Help_Desk.click();
					
					WebElement Open_new_Ticket= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/a[2]/div[1]"));
					Open_new_Ticket.click();
					String parentID = driver.getWindowHandle();
					ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
					if(parentID.equals(tabs2.get(0))) {
					  driver.switchTo().window(tabs2.get(1));
					}else {
					  driver.switchTo().window(tabs2.get(0));
					}
					
					Thread.sleep(2000);

					WebElement title = driver.findElement(By.xpath("//h2[normalize-space()='Submit a ticket']"));
					String current_title = title.getText();
					String Exp_Title = "Submit a ticket";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//Validate the functionality of Check_ticket_status LINK
		@Test
		public void tc4() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//Help_Desk
					WebElement Help_Desk = driver.findElement(By.xpath("//a[contains(@href,'/support')]"));
					Help_Desk.click();
					
					WebElement Check_ticket_status= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/a[2]/div[1]"));
					Check_ticket_status.click();
					String parentID = driver.getWindowHandle();
					ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
					if(parentID.equals(tabs2.get(0))) {
					  driver.switchTo().window(tabs2.get(1));
					}else {
					  driver.switchTo().window(tabs2.get(0));
					}
					
					Thread.sleep(2000);

					WebElement title = driver.findElement(By.xpath("//div[@title='HelpDesk PeopleLink']"));
					String current_title = title.getText();
					String Exp_Title = "HelpDesk PeopleLink";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//Validate the functionality of Troublrshoot LINK
		@Test
		public void tc5() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//Help_Desk
					WebElement Help_Desk = driver.findElement(By.xpath("//a[contains(@href,'/support')]"));
					Help_Desk.click();
					
					WebElement Troublrshoot= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/a[4]/div[1]"));
					Troublrshoot.click();
					String parentID = driver.getWindowHandle();
					ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
					if(parentID.equals(tabs2.get(0))) {
					  driver.switchTo().window(tabs2.get(1));
					}else {
					  driver.switchTo().window(tabs2.get(0));
					}
					
//					Thread.sleep(2000);
	//
//					WebElement title = driver.findElement(By.xpath("//div[@title='HelpDesk PeopleLink']"));
//					String current_title = title.getText();
//					String Exp_Title = "HelpDesk PeopleLink";
//					Assert.assertEquals(current_title, Exp_Title);
					
		}

}
