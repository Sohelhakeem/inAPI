package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Delete_Project extends BaseClass{
	@Test
	public void tc1() throws InterruptedException, IOException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		//Thread.sleep(10000);
		Thread.sleep(3000);
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys(p.getPropertyFiledata("delete_project"));
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='application']")).click();;
		//Thread.sleep(3000);
		
		WebElement drp = driver.findElement(By.xpath("//li[normalize-space()='Collaboration']"));
		drp.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",drp);
		 Thread.sleep(3000);
		 WebElement des = driver.findElement(By.xpath("//textarea[@id='projectDescription']"));
			des.click();
			Thread.sleep(2000);
			des.sendKeys(p.getPropertyFiledata("description"));
			Thread.sleep(3000);
		 
			driver.findElement(By.xpath("//input[@name='conferenceToggleBtn']")).click();
			Thread.sleep(3000);
			
			WebElement create_project =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/button[1]/span[1]"));
			 js.executeScript("arguments[0].scrollIntoView();",create_project);
			 Thread.sleep(3000);
			 create_project.click();
			//Thread.sleep(3000);
			
			WebElement get_started = driver.findElement(By.xpath("//span[normalize-space()='Get Started']"));
			get_started.click();
			Thread.sleep(2000);
		//my project
		driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
		Thread.sleep(5000);
		//delete_btn
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[2]/a[1]/img[1]")).click();
		Thread.sleep(2000);
		//project_nameTB
		driver.findElement(By.xpath("//input[@id='projectName']")).sendKeys(p.getPropertyFiledata("delete_project"));
		
		//CheckBox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//Delete_Btn
		driver.findElement(By.xpath("//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation')]")).click();
		
		//confirm_deleteBtn
		driver.findElement(By.xpath("//div[@class='MuiDialogActions-root MuiDialogActions-spacing']//span[@class='MuiButton-label'][normalize-space()='Delete']")).click();
		Thread.sleep(5000);
		String exp = "https://testapp.inapi.vc/my-projects";
		String act =driver.getCurrentUrl();
		Assert.assertEquals(act, exp);
		
		
		
	}
	@Test
	public void tc2() throws InterruptedException, IOException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		//Thread.sleep(10000);
		Thread.sleep(3000);
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[1]"));
		Login.click();
		Thread.sleep(5000);
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
		 Thread.sleep(3000);
		 WebElement des = driver.findElement(By.xpath("//textarea[@id='projectDescription']"));
			des.click();
			Thread.sleep(2000);
			des.sendKeys(p.getPropertyFiledata("description"));
			Thread.sleep(3000);
		 
			driver.findElement(By.xpath("//input[@name='conferenceToggleBtn']")).click();
			Thread.sleep(3000);
			
			WebElement create_project =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[3]/div[3]/div[1]/button[1]/span[1]"));
			 js.executeScript("arguments[0].scrollIntoView();",create_project);
			 Thread.sleep(3000);
			 create_project.click();
			//Thread.sleep(3000);
			
			WebElement get_started = driver.findElement(By.xpath("//span[normalize-space()='Get Started']"));
			get_started.click();
			Thread.sleep(2000);
		//my project
		driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
		Thread.sleep(5000);
		
		//edit_btn
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/a[1]/img[1]")).click();
		//Thread.sleep(2000);
		//Projext_name
		WebElement drp1 = driver.findElement(By.xpath("//div[@id='demo-simple-select']"));
		drp1.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",drp1);
		 //Thread.sleep(3000);
		 //selecting project name
		driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected']")).click();
			//Thread.sleep(3000);
		//go_btn
		WebElement go_btn= driver.findElement(By.xpath("//div[@class='flexAutoCol pdngLSM']//button[@type='button']"));
		go_btn.click();
		
		 js.executeScript("arguments[0].scrollIntoView();",go_btn);
			//Thread.sleep(3000);
		 
		WebElement project= driver.findElement(By.xpath("//input[@id='projectName']"));
		project.clear();
		Thread.sleep(3000);
		project.sendKeys(p.getPropertyFiledata("Edit_project_Name"));
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@id='application']")).click();;
			//Thread.sleep(3000);
			
			WebElement drp2 = driver.findElement(By.xpath("//div[@id='menu-application']//li[1]"));
			 js.executeScript("arguments[0].scrollIntoView();",drp2);
			 Thread.sleep(1000);
			 drp2.click();
			 //Thread.sleep(3000);
		 
			//Save_Changes
				WebElement cancel_Changes= driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
				cancel_Changes.click();
				Thread.sleep(2000)	;								 
				 
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
					String exp = "https://testapp.inapi.vc/my-projects";
					String act =driver.getCurrentUrl();
					Assert.assertEquals(act, exp);
					
	}
}
