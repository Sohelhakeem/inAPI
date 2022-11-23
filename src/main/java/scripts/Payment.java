package scripts;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Payment extends BaseClass{
	//Recharge for 3000/-
	@Test
	public void tc1() throws InterruptedException, IOException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		//Billing_Center
		WebElement Billing_Center = driver.findElement(By.xpath("//div[contains(@class,'navAnchor alignCntr pdngSM pointer')]"));
		//Billing_Center.isDisplayed();
		Billing_Center.click();
		
		//Billing_Center_payment
		WebElement Billing_Center_payment = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]/div[2]"));
		Billing_Center_payment.click();
		Thread.sleep(3000);
		
				WebElement add_money_drp =driver.findElement(By.xpath("//div[@class='flexAutoCol justifyCntr pdngXS']"));
				add_money_drp.click();
				
				WebElement add_money_drp_3000 =driver.findElement(By.xpath("//div[@id='menu-amount']//li[4]"));
				add_money_drp_3000.click();
				
				WebElement procede_to_PAY =driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
				procede_to_PAY.click();
				Thread.sleep(2000);
				driver.switchTo().frame(0);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				WebElement CARD =driver.findElement(By.xpath("(//button[@type='button'])[2]"));
				js.executeScript("arguments[0].scrollIntoView();", CARD);
				Thread.sleep(1000);
				CARD.click();
				
				WebElement card_number = driver.findElement(By.id("card_number"));
				card_number.sendKeys(p.getPropertyFiledata("card_number"));
				
				WebElement card_expiry = driver.findElement(By.id("card_expiry"));
				card_expiry.sendKeys(p.getPropertyFiledata("card_expiry"));
				
				WebElement card_name = driver.findElement(By.id("card_name"));
				card_name.sendKeys(p.getPropertyFiledata("card_name"));
				
				WebElement card_cvv = driver.findElement(By.id("card_cvv"));
				card_cvv.sendKeys(p.getPropertyFiledata("card_cvv"));
				
				WebElement PAY = driver.findElement(By.id("footer-cta"));
				PAY.isDisplayed();
				Thread.sleep(3000);
				WebElement title = driver.findElement(By.id("merchant-name"));
				String current_title = title.getText();
				String Exp_Title = "InApi";
				Assert.assertEquals(current_title, Exp_Title);
	}
	//Recharge for 2000/-
	@Test
	public void tc2() throws InterruptedException, IOException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		//Billing_Center
		WebElement Billing_Center = driver.findElement(By.xpath("//div[contains(@class,'navAnchor alignCntr pdngSM pointer')]"));
		//Billing_Center.isDisplayed();
		Billing_Center.click();
		
		//Billing_Center_payment
		WebElement Billing_Center_payment = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]/div[2]"));
		Billing_Center_payment.click();
		Thread.sleep(3000);
		
		WebElement add_money_drp =driver.findElement(By.xpath("//div[@class='flexAutoCol justifyCntr pdngXS']"));
		add_money_drp.click();
		
		WebElement add_money_drp_2000 =driver.findElement(By.xpath("//div[@id='menu-amount']//li[2]"));
		add_money_drp_2000.click();
		
		WebElement procede_to_PAY =driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		procede_to_PAY.click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement CARD =driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		js.executeScript("arguments[0].scrollIntoView();", CARD);
		Thread.sleep(1000);
		CARD.click();
		
		WebElement card_number = driver.findElement(By.id("card_number"));
		card_number.sendKeys(p.getPropertyFiledata("card_number"));
		
		WebElement card_expiry = driver.findElement(By.id("card_expiry"));
		card_expiry.sendKeys(p.getPropertyFiledata("card_expiry"));
		
		WebElement card_name = driver.findElement(By.id("card_name"));
		card_name.sendKeys(p.getPropertyFiledata("card_name"));
		
		WebElement card_cvv = driver.findElement(By.id("card_cvv"));
		card_cvv.sendKeys(p.getPropertyFiledata("card_cvv"));
		
		WebElement PAY = driver.findElement(By.id("footer-cta"));
		PAY.isDisplayed();
		Thread.sleep(3000);
		WebElement title = driver.findElement(By.id("merchant-name"));
		String current_title = title.getText();
		String Exp_Title = "InApi";
		Assert.assertEquals(current_title, Exp_Title);
	}
	//Recharge for CUSTOM
	@Test
	public void tc3() throws InterruptedException, IOException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		//Billing_Center
		WebElement Billing_Center = driver.findElement(By.xpath("//div[contains(@class,'navAnchor alignCntr pdngSM pointer')]"));
		//Billing_Center.isDisplayed();
		Billing_Center.click();
		
		//Billing_Center_payment
		WebElement Billing_Center_payment = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]/div[2]"));
		Billing_Center_payment.click();
		Thread.sleep(3000);
		
		WebElement add_money_drp =driver.findElement(By.xpath("//div[@class='flexAutoCol justifyCntr pdngXS']"));
		add_money_drp.click();
		
		WebElement add_money_drp_CUSTOM =driver.findElement(By.xpath("//div[@id='menu-amount']//li[6]"));
		add_money_drp_CUSTOM.click();
		
		WebElement Enter_amount =driver.findElement(By.xpath("//input[@id='customAmount']"));
		Enter_amount.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Enter_amount.sendKeys("5000");
		
		WebElement procede_to_PAY =driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		procede_to_PAY.click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement CARD =driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		js.executeScript("arguments[0].scrollIntoView();", CARD);
		Thread.sleep(1000);
		CARD.click();
		
		WebElement card_number = driver.findElement(By.id("card_number"));
		card_number.sendKeys(p.getPropertyFiledata("card_number"));
		
		WebElement card_expiry = driver.findElement(By.id("card_expiry"));
		card_expiry.sendKeys(p.getPropertyFiledata("card_expiry"));
		
		WebElement card_name = driver.findElement(By.id("card_name"));
		card_name.sendKeys(p.getPropertyFiledata("card_name"));
		
		WebElement card_cvv = driver.findElement(By.id("card_cvv"));
		card_cvv.sendKeys(p.getPropertyFiledata("card_cvv"));
		
		WebElement PAY = driver.findElement(By.id("footer-cta"));
		PAY.isDisplayed();
		Thread.sleep(3000);
		WebElement title = driver.findElement(By.id("merchant-name"));
		String current_title = title.getText();
		String Exp_Title = "InApi";
		Assert.assertEquals(current_title, Exp_Title);
	}
	//threshold
	@Test
	public void tc4() throws InterruptedException, IOException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		//Billing_Center
		WebElement Billing_Center = driver.findElement(By.xpath("//div[contains(@class,'navAnchor alignCntr pdngSM pointer')]"));
		//Billing_Center.isDisplayed();
		Billing_Center.click();
		
		//Billing_Center_payment
		WebElement Billing_Center_payment = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]/div[2]"));
		Billing_Center_payment.click();
		Thread.sleep(3000);
		
				WebElement add_money_drp =driver.findElement(By.xpath("//div[@class='flexAutoCol justifyCntr pdngXS']"));
				add_money_drp.click();
				
				WebElement add_money_drp_3000 =driver.findElement(By.xpath("//div[@id='menu-amount']//li[4]"));
				add_money_drp_3000.click();
				
				WebElement Threshold =driver.findElement(By.xpath("//input[@id='threshold']"));
				Threshold.click();
				
				WebElement limit =driver.findElement(By.xpath("//div[@id='limitedMinutes']"));
				limit.click();
				
				WebElement limitt =driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected']"));
				limitt.click();
				
				WebElement emaill =driver.findElement(By.xpath("//input[@placeholder='sample@gmail.com']"));
				emaill.sendKeys("sohel@peoplelink.com");
				Thread.sleep(2000);
				
				WebElement Save =driver.findElement(By.xpath("//button[@type='submit']"));
				Save.isDisplayed();
				Thread.sleep(2000);
	}
	//payment_History
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

			//Billing_Center
			WebElement Billing_Center = driver.findElement(By.xpath("//div[contains(@class,'navAnchor alignCntr pdngSM pointer')]"));
			Billing_Center.click();
			
			//Billing_Center_payment_History
					WebElement Billing_Center_payment_History = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]/div[1]/div[2]/span[1]"));
					Billing_Center_payment_History.click();
					
			
			Thread.sleep(2000);
			WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Payment History']"));
			String current_title = title.getText();
			String Exp_Title = "Payment History";
			Assert.assertEquals(current_title, Exp_Title);
			
		}
		//DOWNLOAD INVOICE.
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

			//Billing_Center
			WebElement Billing_Center = driver.findElement(By.xpath("//div[contains(@class,'navAnchor alignCntr pdngSM pointer')]"));
			Billing_Center.click();
			
			//Billing_Center_payment_History
					WebElement Billing_Center_payment_History = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]/div[1]/div[2]/span[1]"));
					Billing_Center_payment_History.click();
					
					WebElement download_invoice = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]"));
					download_invoice.click();
					
					String parentID = driver.getWindowHandle();
					ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
					if(parentID.equals(tabs2.get(0))) {
					  driver.switchTo().window(tabs2.get(1));
					}else {
					  driver.switchTo().window(tabs2.get(0));
					}
					
					
					
					Thread.sleep(3000);
		
		}		
		
		//FILTER DOWNLOAD INVOICE.
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

			//Billing_Center
			WebElement Billing_Center = driver.findElement(By.xpath("//div[contains(@class,'navAnchor alignCntr pdngSM pointer')]"));
			Billing_Center.click();
			
			//Billing_Center_payment_History
					WebElement Billing_Center_payment_History = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]/div[1]/div[2]/span[1]"));
					Billing_Center_payment_History.click();
					
					WebElement FILTER = driver.findElement(By.xpath("//img[contains(@alt,'filter')]"));
					FILTER.click();
					
					WebElement fromDate = driver.findElement(By.xpath("//input[@name='fromDate']"));
					fromDate.click();
					
					//JavascriptExecutor js = (JavascriptExecutor)driver;
					
					WebElement fromDate_OK = driver.findElement(By.xpath("//span[normalize-space()='OK']"));
					
					fromDate_OK.click();
					
					WebElement toDate = driver.findElement(By.xpath("//input[@name='toDate']"));
					toDate.click();
					
					WebElement toDate_OK = driver.findElement(By.xpath("//span[normalize-space()='OK']"));
					toDate_OK.click();
					
					WebElement Apply = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation MuiButton-fullWidth']"));
					Apply.click();
					
					WebElement download_invoice = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]"));
					download_invoice.click();
					
					String parentID = driver.getWindowHandle();
					ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
					if(parentID.equals(tabs2.get(0))) {
					  driver.switchTo().window(tabs2.get(1));
					}else {
					  driver.switchTo().window(tabs2.get(0));
					}
					
					
					
					Thread.sleep(3000);
		
		}		

}
