package com.GL.CQ.pagelibrary;
//

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin 
{
     WebDriver driver;
	 static Logger log = Logger.getLogger(Signin.class.getName());
	 WebElement Signinlink= driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
	 WebElement CreateEmail= driver.findElement(By.xpath("//*[@id='email_create']"));
	 WebElement registeredemail= driver.findElement(By.xpath("//*[@id=email]"));
	 WebElement registeredpassword= driver.findElement(By.xpath("//*[@id='passwd']"));
	 WebElement Siginbutton= driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
	
	 /**
	   * this method click on signinlink of loging page 
	  */
	 public void clickonSignin()
	 {
		log.info("clicking on signin link ");
		 Signinlink.click();
		
	 }
	 
	 /* this method click will enter create email address link */

	 public void enterCreateEmail(String emailaddress)
	 {
			log.info("entering create email address ");

		 CreateEmail.sendKeys(emailaddress);
	 }
	 
	 /* this method enter registered email address link */

	 public void enterregisteremail(String regemailaddress)
	 {
			log.info("entering registered email address ");

		 registeredemail.sendKeys(regemailaddress);
	 }
	 
	 /* this method enter registered password address link */

	 
	 public void enterregisterpassword(String regpassword)
	 {
			log.info("entering registered Password ");

		 registeredpassword.sendKeys(regpassword);
	 }
	 
	 /** 
	   * this method clicks on Signin button 
	  */

	 
	 public void clickonsigninbutton()
	 {
			log.info("Click on signinbutton ");

		 Siginbutton.click();
		 }
}
