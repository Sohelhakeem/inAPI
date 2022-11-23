package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Update_profilePic extends BaseClass {
	//upload picture
	@Test
	public void tc1() throws InterruptedException, IOException, AWTException {

		
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
		driver.findElement(By.xpath("//button[@class='flexRow alignCntr justifyCntr fullHeight fullWidth uploadImgBtn ']")).click();
		Thread.sleep(2000);
		WebElement upload_Image = driver.findElement(By.xpath("//li[@role='menuitem']"));
		upload_Image.click();
		Thread.sleep(2000);
		// creating object of Robot class
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("C:\\Users\\Sohel\\Pictures\\profile\\sohel photo.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    
	    
		WebElement save_Button = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
		save_Button.click();
		Thread.sleep(3000);
		
	}
	//Delete picture
	@Test
	public void tc2() throws InterruptedException, IOException, AWTException {

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
		driver.findElement(By.xpath("//button[@class='flexRow alignCntr justifyCntr fullHeight fullWidth uploadImgBtn ']")).click();
		Thread.sleep(2000);
		WebElement delete_Image = driver.findElement(By.xpath("//li[normalize-space()='Delete Image']"));
		delete_Image.click();
		WebElement delete_Btn = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
		delete_Btn.click();
		Thread.sleep(3000);
	}
	
	//Upload Picture
	@Test
	public void tc3() throws InterruptedException, IOException, AWTException {

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
		driver.findElement(By.xpath("//button[@class='flexRow alignCntr justifyCntr fullHeight fullWidth uploadImgBtn ']")).click();
		Thread.sleep(2000);
		WebElement upload_Image = driver.findElement(By.xpath("//li[@role='menuitem']"));
		upload_Image.click();
		Thread.sleep(2000);
		// creating object of Robot class
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("C:\\Users\\Sohel\\Pictures\\profile\\Nature.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    
	    
		WebElement save_Button = driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
		save_Button.click();
		Thread.sleep(3000);
		
	}
}
