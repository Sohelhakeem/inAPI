package inVC_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class inVC_DashBoardPage extends BaseClass {
	//Verifying elements on DashBoard
		@Test
		public void tc1() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password =driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(5000);
			
			WebElement inVclogo = driver.findElement(By.xpath("(//a[@href='/meeting'])[2]"));
			inVclogo.isDisplayed();
			
			WebElement userNametxt = driver.findElement(By.xpath("//div[@class='userName']"));
			userNametxt.isDisplayed();
			
			WebElement userProfileImage = driver.findElement(By.xpath("//div[@class='userAvatar']"));
			userProfileImage.isDisplayed();
			
			WebElement instaMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noLeftPdng']"));
			instaMeetingIcon.isDisplayed();
			
			WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
			joinMeetingIcon.isDisplayed();
			
			WebElement scheduleMeetingIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noLeftPdng'])[2]"));
			scheduleMeetingIcon.isDisplayed();
			
			WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
			shareScreenIcon.isDisplayed();
			
			/*
			 * WebElement dayText =
			 * driver.findElement(By.xpath("(//span[@class='dayTxt']"));
			 * dayText.isDisplayed();
			 * 
			 * WebElement monthAndDatetext =
			 * driver.findElement(By.xpath("(//span[@class='dayTxt monthTxt']"));
			 * monthAndDatetext.isDisplayed();
			 * 
			 * WebElement timeText =
			 * driver.findElement(By.xpath("(//span[@class='timeTxt']"));
			 * timeText.isDisplayed();
			 * 
			 * WebElement meetingText =
			 * driver.findElement(By.xpath("(//span[@class='cardhdngTxt']"));
			 * meetingText.isDisplayed();
			 * 
			 * WebElement meetingNumberText =
			 * driver.findElement(By.xpath("(//span[@class='hdrRow']"));
			 * meetingNumberText.isDisplayed();
			 */
			
			String actualUrl="https://staging.invc.vc/meeting";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
		
		//Verifying the functionality of instameeting
		@Test
		public void tc2() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(5000);
			
			WebElement instaMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noLeftPdng']"));
			instaMeetingIcon.click();
			
			String actualUrl="https://staging.invc.vc/insta-meeting";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
		
		//Verifying the functionality of joinmeeting
		@Test
		public void tc3() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(5000);
			
			WebElement joinMeetingIcon = driver.findElement(By.xpath("//div[@class='btnCardCntnr width50per noRightPdng']"));
			joinMeetingIcon.click();
			
			String actualUrl="https://staging.invc.vc/join-meeting";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
			
		//Verifying the functionality of schedulemeeting
		@Test
		public void tc4() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(5000);
			
			WebElement scheduleMeetingIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noLeftPdng'])[2]"));
			scheduleMeetingIcon.click();
			
			String actualUrl="https://staging.invc.vc/schedule-meeting";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
			
		//Verifying the functionality of shareScreen
		@Test
		public void tc5() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(5000);
			
			WebElement shareScreenIcon = driver.findElement(By.xpath("(//div[@class='btnCardCntnr width50per noRightPdng'])[2]"));
			shareScreenIcon.click();
			
			String actualUrl="https://staging.invc.vc/join-screenshare";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
		
//Verifying the functionality of MyMeetig 
		@Test
		public void tc6() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement  MyMeetig= driver.findElement(By.xpath("(//a[@class='anchorTxt'])[3]"));
			MyMeetig.click();
		
			
			String actualUrl="https://staging.invc.vc/new-meetings";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
		
//Verifying the functionality of Calender Feature
		@Test
		public void tc7() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement  Calender= driver.findElement(By.xpath("(//a[@class='anchorTxt'])[4]"));
			Calender.click();
		
			
			String actualUrl="https://staging.invc.vc/calendar";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}

//Verifying the functionality of headerAvatarDrpDwn F
		@Test
		public void tc8() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			Thread.sleep(5000);
		}
		
//Verifying the functionality of headerAvatarDrpDwn MyProfileFeature
		@Test
		public void tc9() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			Thread.sleep(2000);
			
			WebElement myProfile=driver.findElement(By.xpath("//a[text()='My Profile']"));
			myProfile.click();
			Thread.sleep(2000);
			
			String actualUrl="https://staging.invc.vc/myprofile";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
			
//Verifying the functionality of headerAvatarDrpDwn SettingFeature
		@Test
		public void tc10() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			//Thread.sleep(2000);
			
			WebElement setting=driver.findElement(By.xpath("//a[text()='Settings']"));
			setting.click();
			//Thread.sleep(2000);
			
			String actualUrl="https://staging.invc.vc/settings";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}
			
//Verifying the functionality of headerAvatarDrpDwn LogoutFeature
		@Test
		public void tc11() throws InterruptedException {
			WebElement username=driver.findElement(By.id("email"));
			username.sendKeys("sohel@peoplelinkvc.com");
			
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("Hyderabad@123");
			
			WebElement login=driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
			login.click();
			
			Thread.sleep(2000);
			
			WebElement avatarDroDwn=driver.findElement(By.xpath("//div[@class='userAvatar']"));
			avatarDroDwn.click();
			//Thread.sleep(2000);
			
			WebElement logout=driver.findElement(By.xpath("//a[text()='Log Out']"));
			logout.click();
			Thread.sleep(2000);
			
			String actualUrl="https://staging.invc.vc/?redirect=/meeting";
			String expectedUrl= driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			}

		}
