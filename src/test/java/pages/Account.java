package pages;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Steps;
import setup.Init;

import utils.ReportLog;

public class Account extends PageObject {

	@Steps
	Init init;
		@Steps
		ReportLog report;
		
		WebDriver driver;
		
		   
		   @FindBy(xpath="//input[@id='accountName']")
		   WebElementFacade OrgName;
		   @FindBy(xpath="//input[@id='firstName']")
		   WebElementFacade FirstName;
		   @FindBy(xpath="//input[@id='lastName']")
		   WebElementFacade Lastname;
		   @FindBy(xpath="//input[@id='emailAddress']")
		   WebElementFacade email;
		   @FindBy(xpath="//input[@id='phoneNumber']")
		   WebElementFacade phonenumber;
		   @FindBy(xpath="//input[@id='Password']")
		   WebElementFacade password;
		   @FindBy(xpath="//input[@id='repeatPassword']")
		   WebElementFacade Confirmpassword;
		   @FindBy(xpath="//input[@id='howHeard']")
		   WebElementFacade Dropbox;
		   @FindBy(xpath="//div[@class='v-input--selection-controls__ripple']")
		   WebElementFacade CheckBox;
		   @FindBy(xpath="//button[@class='btn-sumo-primary v-btn v-btn--has-bg theme--light elevation-0 v-size--default']")
		   WebElementFacade save;
		   
		   
		   
		   
		   public void openApplication() {
				getDriver().get(init.appurl());
				getDriver().manage().window().maximize();
				
				report.log("your SumoQoute webiste is opened:");
				waitABit(2000);
				System.out.println("page url is:"+getDriver().getCurrentUrl());
				
			    Assert.assertEquals("https://sumoquoteweb-qa.azurewebsites.net/new-account",getDriver().getCurrentUrl());
			    
		 
		   }
         public void orgname(String Organization_Name) {
        	 OrgName.sendKeys(Organization_Name);
        	 report.log("enter organization name");
        	 waitABit(2000);
         }
         public void firstname(String Firstname) {
        	 FirstName.sendKeys(Firstname);
        	 report.log("enter First name");
        	 waitABit(2000);
         }
         
         public void lastname(String LastName) {
        	 Lastname.sendKeys(LastName);
        	 report.log("enter Last name");
        	 waitABit(2000);
         }
         public void e_mail(String Email) {
        	 email.sendKeys(Email);
        	 report.log("enter Email");
        	 waitABit(2000);
         }
         public void phone_num(String PhoneNumber) {
        	 phonenumber.sendKeys(PhoneNumber);
        	 report.log("Phone_number");
        	 waitABit(2000);
         }
         public void pwd(String Password,String ConfirmPassword) {
        	 password.sendKeys(Password);
        	 report.log("password");
        	 Confirmpassword.sendKeys(ConfirmPassword);
        	 report.log("confirm password");
        	 
        	 waitABit(2000);
        	 Assert.assertEquals(Password, ConfirmPassword);
         }
         public void options(String option) {
        	 Dropbox.click();
        	 Actions actions = new Actions(getDriver()); 
        	 
        	 if(option=="The Roofing Academy") {
           		
         		WebElement option1=getDriver().findElement
         				(By.xpath("//div[text()='The Roofing Academy']"));
         		actions.moveToElement(option1).build().perform();
         		option1.click();
         		waitABit(4000);
         		
           	}
        	 if(option=="Atlas Roofing"){
           		WebElement option2=getDriver().findElement
          				(By.xpath("//div[text()='Atlas Roofing']"));
          		actions.moveToElement(option2).build().perform();
          		option2.click();
          		waitABit(4000);
           	}
      		
      	if(option=="Certainteed") {
      		
      		WebElement option3=getDriver().findElement
     				(By.xpath("//div[text()='Certainteed']"));
     		actions.moveToElement(option3).build().perform();
     		option3.click();
     		waitABit(4000);
      	}
      	if(option=="James Hardie") {
      		
      		WebElement option4=getDriver().findElement
     				(By.xpath("//div[text()='James Hardie']"));
     		actions.moveToElement(option4).build().perform();
     		option4.click();
     		waitABit(4000);
      	}
      	if(option=="Malarkey Roofing") {
      		
      		WebElement option5=getDriver().findElement
     				(By.xpath("//div[text()='Malarkey Roofing']"));
     		actions.moveToElement(option5).build().perform();
     		option5.click();
     		waitABit(4000);
      	}
      	if(option=="CompanyCam") {
      		WebElement option6=getDriver().findElement
     				(By.xpath("//div[text()='CompanyCam']"));
     		actions.moveToElement(option6).build().perform();
     		option6.click();
     		waitABit(4000);
      	}
      	if(option=="JobNimbus") {
      		WebElement option7=getDriver().findElement
     				(By.xpath("//div[text()='JobNimbus']"));
     		actions.moveToElement(option7).build().perform();
     		option7.click();
     		waitABit(4000);
      	}
      	if(option=="Breakthrough Academy") {
      		WebElement option8=getDriver().findElement
     				(By.xpath("//div[text()='Breakthrough Academy']"));
     		actions.moveToElement(option8).build().perform();
     		option8.click();
     		waitABit(4000);
      	}
      	if(option=="Roof Sales Mastery – Becca Switzer") {
      		WebElement option9=getDriver().findElement
     				(By.xpath("//div[text()='Roof Sales Mastery – Becca Switzer']"));
      		actions.moveByOffset(0, 100).release().build().perform();
     		option9.click();
     		waitABit(4000);
      	}if(option=="Business 411 - Elizabeth Calzadilla") {
      		WebElement option10=getDriver().findElement
     				(By.xpath("//div[text()='Business 411 - Elizabeth Calzadilla']"));
      		actions.moveByOffset(0, 100).release().build().perform();
     		option10.click();
     		waitABit(4000);
      	}if(option=="The Roofer Show") {
      		WebElement option11=getDriver().findElement
     				(By.xpath("//div[text()='The Roofer Show']"));
      		actions.moveByOffset(0, 100).release().build().perform();
     		option11.click();
     		waitABit(4000);
      	}if(option=="Roofing Insights - Dmitry Lipinskiy") {
      		WebElement option12=getDriver().findElement
     				(By.xpath("//div[text()='Roofing Insights - Dmitry Lipinskiy']"));
      		actions.moveByOffset(0, 100).release().build().perform();
     		option12.click();
     		waitABit(4000);
      	}if(option=="Google") {
      		WebElement option13=getDriver().findElement
     				(By.xpath("//div[text()='Google']"));
      		actions.moveByOffset(0, 100).release().build().perform();
     		option13.click();
     		waitABit(4000);
      	}
      	if(option=="Facebook") {
      		WebElement option14=getDriver().findElement
    				(By.xpath("//div[text()='Facebook']"));
    		actions.moveByOffset(0, 100).release().build().perform();
    		option14.click();
    		waitABit(4000);	
      	}if(option=="Word of Mouth") {
      		WebElement option15=getDriver().findElement
    				(By.xpath("//div[text()='Word of Mouth']"));
    		actions.moveByOffset(0, 100).release().build().perform();
    		option15.click();
    		waitABit(4000);
      	}
      	if(option=="Podcast") {
      		WebElement option16=getDriver().findElement
    				(By.xpath("//div[text()='Podcast']"));
    		actions.moveByOffset(0, 100).release().build().perform();
    		option16.click();
    		waitABit(4000);
      	}
      	if(option=="Other") {
      		WebElement option17=getDriver().findElement
    				(By.xpath("//div[text()='Other']"));
    		actions.moveByOffset(0, 100).release().build().perform();
    		option17.click();
    		waitABit(4000);
      	}
      	report.log("option selected");
      	 
         }
      	public void checkBox() {
      		CheckBox.click();
       	 report.log("enter organization name");
       	 waitABit(2000);
        }
      	public void save() {
      		
      			save.click();
      			report.log("cicked on save button");
      	       	 waitABit(4000);
      		
      	}
         }

        	
      
       
