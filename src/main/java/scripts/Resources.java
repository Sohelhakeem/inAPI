package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Resources extends BaseClass {
	//Validate user is able to click on recourses feature.
		@Test
		public void tc1() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//Resources
					WebElement Resources = driver.findElement(By.xpath("//a[contains(@href,'/resources')]"));
					Resources.click();
					
					//Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Resources']"));
					String current_title = title.getText();
					String Exp_Title = "Resources";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//Validate user is able to click on recourses min code  feature.
		@Test
		public void tc2() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//Resources
					WebElement Resources = driver.findElement(By.xpath("//a[contains(@href,'/resources')]"));
					Resources.click();
					
					WebElement min_Code = driver.findElement(By.xpath("//img[@alt='video emed']"));
					min_Code.click();
					
					Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Min Code Video']"));
					String current_title = title.getText();
					String Exp_Title = "Min Code Video";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//Validate user is able to click on recourses min code  feature.
		@Test
		public void tc3() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//Resources
					WebElement Resources = driver.findElement(By.xpath("//a[contains(@href,'/resources')]"));
					Resources.click();
					
					WebElement min_Code = driver.findElement(By.xpath("//img[@alt='video emed']"));
					min_Code.click();
					Thread.sleep(2000);
					
					WebElement setup = driver.findElement(By.xpath("//a[contains(text(),'• Setup')]"));
					setup.click();
					Thread.sleep(2000);
					
					WebElement get_started = driver.findElement(By.xpath("//a[contains(text(),'• Get Started minimum code')]"));
					get_started.click();
					Thread.sleep(2000);
					
					WebElement Query = driver.findElement(By.xpath("//a[contains(text(),'• Query String Parameters')]"));
					Query.click();
					Thread.sleep(2000);
					
					WebElement session = driver.findElement(By.xpath("//a[contains(text(),'• Session Management')]"));
					session.click();
					Thread.sleep(2000);
					
					WebElement Features = driver.findElement(By.xpath("//a[contains(text(),'• Features')]"));
					Features.click();
					Thread.sleep(2000);
					
					WebElement Technical = driver.findElement(By.xpath("//a[contains(text(),'• Technical Specification')]"));
					Technical.click();
					Thread.sleep(2000);
					
					WebElement Browser = driver.findElement(By.xpath("//a[contains(text(),'• Browser Compatibility')]"));
					Browser.click();
					Thread.sleep(2000);
					
					WebElement Analytics = driver.findElement(By.xpath("//a[contains(text(),'• Analytics')]"));
					Analytics.click();
					Thread.sleep(2000);
					
					
					Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Min Code Video']"));
					String current_title = title.getText();
					String Exp_Title = "Min Code Video";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		
		//Validate user is able to click on recourses preferCode  feature.
		@Test
		public void tc4() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//Resources
					WebElement Resources = driver.findElement(By.xpath("//a[contains(@href,'/resources')]"));
					Resources.click();
					
					WebElement preferCode = driver.findElement(By.xpath("//img[contains(@src,'/resources/preferCode.png')]"));
					preferCode.click();
					Thread.sleep(2000);
					
					WebElement setup = driver.findElement(By.xpath("//a[contains(text(),'• Setup')]"));
					setup.click();
					Thread.sleep(2000);
					
					WebElement get_started = driver.findElement(By.xpath("//a[contains(text(),'• Get Started minimum code')]"));
					get_started.click();
					Thread.sleep(2000);
					
					WebElement Query = driver.findElement(By.xpath("//a[contains(text(),'• Query String Parameters')]"));
					Query.click();
					Thread.sleep(2000);
					
					WebElement session = driver.findElement(By.xpath("//a[contains(text(),'• Session Management')]"));
					session.click();
					Thread.sleep(2000);
					
					WebElement Features = driver.findElement(By.xpath("//a[contains(text(),'• Features')]"));
					Features.click();
					Thread.sleep(2000);
					
					WebElement Technical = driver.findElement(By.xpath("//a[contains(text(),'• Technical Specification')]"));
					Technical.click();
					Thread.sleep(2000);
					
					WebElement Browser = driver.findElement(By.xpath("//a[contains(text(),'• Browser Compatibility')]"));
					Browser.click();
					Thread.sleep(2000);
					
					WebElement Analytics = driver.findElement(By.xpath("//a[contains(text(),'• Analytics')]"));
					Analytics.click();
					Thread.sleep(2000);
					
					
					Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Min Code Video']"));
					String current_title = title.getText();
					String Exp_Title = "Min Code Video";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//Validate user is able to click on recourses P2P  feature.
		@Test
		public void tc5() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			
			//Resources
					WebElement Resources = driver.findElement(By.xpath("//a[contains(@href,'/resources')]"));
					Resources.click();
					Thread.sleep(2000);
					
					WebElement P2P = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[1]/img[1]"));
					P2P.click();
					Thread.sleep(2000);

					WebElement Download = driver.findElement(By.xpath("//a[contains(text(),'• Download SDK')]"));
					Download.click();
					Thread.sleep(2000);
					
					WebElement Get_Started_P2P = driver.findElement(By.xpath("//a[contains(text(),'• Get Started P2P')]"));
					Get_Started_P2P.click();
					Thread.sleep(2000);
					
					WebElement Sample_Ios_App = driver.findElement(By.xpath("//a[contains(text(),'• Sample Ios App')]"));
					Sample_Ios_App.click();
					Thread.sleep(2000);
					
					WebElement Sample_Android_App = driver.findElement(By.xpath("//a[contains(text(),'• Sample Android App')]"));
					Sample_Android_App.click();
					Thread.sleep(2000);
					
					WebElement API_Reference = driver.findElement(By.xpath("//a[contains(text(),'• API Reference')]"));
					API_Reference.click();
					Thread.sleep(2000);
					
					Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='P2P']"));
					String current_title = title.getText();
					String Exp_Title = "P2P";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
		//Validate user is able to click on recourses P2P  feature.
		@Test
		public void tc6() throws IOException, InterruptedException {
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys(p.getPropertyFiledata("email"));
			
			WebElement passwrd = driver.findElement(By.id("password"));
			passwrd.sendKeys(p.getPropertyFiledata("pass"));
			
			WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
			Login.click();
			//Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			//Resources
					WebElement Resources = driver.findElement(By.xpath("//a[contains(@href,'/resources')]"));
					Resources.click();
					Thread.sleep(2000);
					
					WebElement FAQ = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[1]/div[1]/img[1]"));
					FAQ.click();
					Thread.sleep(2000);

					WebElement getting_started_faq = driver.findElement(By.xpath("//a[contains(@href,'/faq/getting-started-faq')]//div[contains(@class,'pdngBSM alignCntr')]"));
					getting_started_faq.click();
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					Thread.sleep(2000);
					
					WebElement recordings_faq = driver.findElement(By.xpath("//a[contains(@href,'/faq/recordings-faq')]//div[contains(@class,'pdngBSM alignCntr')]"));
					js.executeScript("window.scrollBy(0,-350)", "");
					Thread.sleep(1000);
					recordings_faq.click();
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					Thread.sleep(2000);
					
					
					WebElement account_faq = driver.findElement(By.xpath("//a[contains(@href,'/faq/account-faq')]//div[contains(@class,'pdngBSM alignCntr')]"));
					js.executeScript("window.scrollBy(0,-350)", "");
					Thread.sleep(1000);
					account_faq.click();
					Thread.sleep(2000);
					
					WebElement network_faq = driver.findElement(By.xpath("//a[contains(@href,'/faq/network-faq')]//div[contains(@class,'pdngBSM alignCntr')]"));
					js.executeScript("window.scrollBy(0,-350)", "");
					Thread.sleep(1000);
					network_faq.click();
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					Thread.sleep(2000);
					
					WebElement support_faq = driver.findElement(By.xpath("//a[contains(@href,'/faq/support-faq')]//div[contains(@class,'pdngBSM alignCntr')]"));
					js.executeScript("window.scrollBy(0,-350)", "");
					Thread.sleep(1000);
					support_faq.click();
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					Thread.sleep(2000);
					
					WebElement hosting_faq = driver.findElement(By.xpath("//a[contains(@href,'/faq/hosting-faq')]//div[contains(@class,'pdngBSM alignCntr')]"));
					js.executeScript("window.scrollBy(0,-350)", "");
					Thread.sleep(1000);
					hosting_faq.click();
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					Thread.sleep(2000);
					
					WebElement troubleshooting_faq = driver.findElement(By.xpath("//a[contains(@href,'/faq/troubleshooting-faq')]//div[contains(@class,'pdngBSM alignCntr')]"));
					js.executeScript("window.scrollBy(0,-350)", "");
					Thread.sleep(1000);
					troubleshooting_faq.click();
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
					Thread.sleep(2000);
					js.executeScript("window.scrollBy(0,-350)", "");
					
					Thread.sleep(2000);
					WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='FAQ']"));
					String current_title = title.getText();
					String Exp_Title = "FAQ";
					Assert.assertEquals(current_title, Exp_Title);
					
		}
}
