package com.jbk;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class snap {
  @Test
  public void f() throws IOException {
	  
	WebDriver driver=new FirefoxDriver();//launch
		
		driver.get("https://www.facebook.com/");//url 
		
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("dheerajbhosale94@gmail.com");
		driver.findElement(By.xpath(".//input[@id='pass']")).sendKeys("123345");
		
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File(".//fb//snaps.png"));
		
		System.out.println("snap taken");
		
		
  }
}
