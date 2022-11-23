package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Edit_Project extends BaseClass {
	
	//Testing functionality of Edit_btn , Project_name Drop, Go Btn.
	@Test
	public void tc2() throws IOException, InterruptedException {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(p.getPropertyFiledata("email"));
		
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(p.getPropertyFiledata("pass"));
		Thread.sleep(10000);
		Thread.sleep(3000);
		WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]"));
		Login.click();
		Thread.sleep(5000);
		//my project
		driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
		//Thread.sleep(5000);
		//edit_btn
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/a[1]/img[1]")).click();
		//Thread.sleep(2000);
		//Projext_name
		WebElement drp = driver.findElement(By.xpath("//div[@id='demo-simple-select']"));
		drp.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",drp);
		 //Thread.sleep(3000);
		 //selecting project name
		driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected']")).click();
			//Thread.sleep(3000);
		//go_btn
		WebElement go_btn= driver.findElement(By.xpath("//div[@class='flexAutoCol pdngLSM']//button[@type='button']"));
		go_btn.click();
		
		 js.executeScript("arguments[0].scrollIntoView();",go_btn);
			//Thread.sleep(3000);
		//my_project
			driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
			Thread.sleep(5000);
			String exp = "https://app.inapi.vc/my-projects";
			String act =driver.getCurrentUrl();
			Assert.assertEquals(act, exp);
	}
	
		//Testing functionality of Edit_btn , Project_name Drop, Go Btn.
		//edit project name,application name, click on save changes.
			@Test
			public void tc3() throws IOException, InterruptedException {
				WebElement email = driver.findElement(By.id("email"));
				email.sendKeys(p.getPropertyFiledata("email"));
				
				WebElement passwrd = driver.findElement(By.id("password"));
				passwrd.sendKeys(p.getPropertyFiledata("pass"));
				Thread.sleep(10000);
				Thread.sleep(3000);
				WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]"));
				Login.click();
				Thread.sleep(5000);
				//my project
				driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
				//Thread.sleep(5000);
				//edit_btn
				driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/a[1]/img[1]")).click();
				//Thread.sleep(2000);
				//Projext_name
				WebElement drp = driver.findElement(By.xpath("//div[@id='demo-simple-select']"));
				drp.click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("arguments[0].scrollIntoView();",drp);
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
					Thread.sleep(3000);
					driver.findElement(By.xpath("//div[@id='application']")).click();;
					Thread.sleep(3000);
					
					WebElement drp2 = driver.findElement(By.xpath("//div[@id='menu-application']//li[1]"));
					 js.executeScript("arguments[0].scrollIntoView();",drp2);
					 Thread.sleep(1000);
					 drp2.click();
					 Thread.sleep(3000);
				 
					//Save_Changes
						WebElement Save_Changes= driver.findElement(By.xpath("//span[normalize-space()='SAVE CHANGES']"));
						Save_Changes.click();
						Thread.sleep(3000);

					String exp = "https://app.inapi.vc/my-projects";
					String act =driver.getCurrentUrl();
					Assert.assertEquals(act, exp);
			}
			//Testing functionality of Edit_btn , Project_name Drop, Go Btn.
			//edit project name,application name, click on Cancel changes.
				@Test
				public void tc4() throws IOException, InterruptedException {
					WebElement email = driver.findElement(By.id("email"));
					email.sendKeys(p.getPropertyFiledata("email"));
					
					WebElement passwrd = driver.findElement(By.id("password"));
					passwrd.sendKeys(p.getPropertyFiledata("pass"));
					Thread.sleep(10000);
					Thread.sleep(3000);
					WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]"));
					Login.click();
					Thread.sleep(3000);
					//my project
					driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
					//Thread.sleep(5000);
					//edit_btn
					driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/a[1]/img[1]")).click();
					//Thread.sleep(2000);
					//Projext_name
					WebElement drp = driver.findElement(By.xpath("//div[@id='demo-simple-select']"));
					drp.click();
					JavascriptExecutor js = (JavascriptExecutor) driver;
					 js.executeScript("arguments[0].scrollIntoView();",drp);
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
							Thread.sleep(2000);

						String exp = "https://app.inapi.vc/my-projects";
						String act =driver.getCurrentUrl();
						Assert.assertEquals(act, exp);
				}
				//Testing functionality of Edit_btn , Project_name Drop, Go Btn.
				//edit project name,application name, click on save changes.
					@Test
					public void tc5() throws IOException, InterruptedException {
						WebElement email = driver.findElement(By.id("email"));
						email.sendKeys(p.getPropertyFiledata("email"));
						
						WebElement passwrd = driver.findElement(By.id("password"));
						passwrd.sendKeys(p.getPropertyFiledata("pass"));
						Thread.sleep(10000);
						Thread.sleep(3000);
						WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]"));
						Login.click();
						Thread.sleep(3000);
						//my project
						driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
						//Thread.sleep(5000);
						//edit_btn
						driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/a[1]/img[1]")).click();
						//Thread.sleep(2000);
						//Projext_name
						WebElement drp = driver.findElement(By.xpath("//div[@id='demo-simple-select']"));
						drp.click();
						JavascriptExecutor js = (JavascriptExecutor) driver;
						 js.executeScript("arguments[0].scrollIntoView();",drp);
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
						Thread.sleep(1000);
						project.sendKeys(p.getPropertyFiledata("Edit_project_Name2"));
							//Thread.sleep(3000);
							driver.findElement(By.xpath("//div[@id='application']")).click();;
							//Thread.sleep(3000);
							
							//select collaboration from drpdwn.
							WebElement drp2 = driver.findElement(By.xpath("(//li[@role='option'])[2]"));
							 js.executeScript("arguments[0].scrollIntoView();",drp2);
							 Thread.sleep(1000);
							 drp2.click();
							Thread.sleep(3000);
							 
							 
						 
							//Save_Changes
								WebElement Save_Changes= driver.findElement(By.xpath("//span[normalize-space()='SAVE CHANGES']"));
								Save_Changes.click();
								Thread.sleep(2000);

							String exp = "https://app.inapi.vc/my-projects";
							String act =driver.getCurrentUrl();
							Assert.assertEquals(act, exp);
					}
					@Test
					public void tc6() throws IOException, InterruptedException {
						WebElement email = driver.findElement(By.id("email"));
						email.sendKeys(p.getPropertyFiledata("email"));
						
						WebElement passwrd = driver.findElement(By.id("password"));
						passwrd.sendKeys(p.getPropertyFiledata("pass"));
						Thread.sleep(10000);
						Thread.sleep(3000);
						WebElement Login = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]"));
						Login.click();
						Thread.sleep(3000);
						//my project
						driver.findElement(By.xpath("//a[contains(@href,'/my-projects')]")).click();
						//Thread.sleep(5000);
						//edit_btn
						driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/a[1]/img[1]")).click();
						//Thread.sleep(2000);
						//Projext_name
						WebElement drp = driver.findElement(By.xpath("//div[@id='demo-simple-select']"));
						drp.click();
						JavascriptExecutor js = (JavascriptExecutor) driver;
						 js.executeScript("arguments[0].scrollIntoView();",drp);
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
							 WebElement des = driver.findElement(By.xpath("//textarea[@id='projectDescription']"));
								des.click();
								Thread.sleep(2000);
								des.sendKeys(p.getPropertyFiledata("description"));
								Thread.sleep(3000);
						 
							//Save_Changes
								WebElement cancel_Changes= driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSizeSmall MuiButton-sizeSmall MuiButton-disableElevation']"));
								cancel_Changes.click();
								Thread.sleep(2000);

							String exp = "https://app.inapi.vc/my-projects";
							String act =driver.getCurrentUrl();
							Assert.assertEquals(act, exp);
					}


	}

