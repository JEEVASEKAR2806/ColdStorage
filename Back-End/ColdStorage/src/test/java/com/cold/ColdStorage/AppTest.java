package com.cold.ColdStorage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AppTest {
   
	@Test
	public void selenium_Test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
 
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement logInBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div[3]/span/button"));
		 
		action.moveToElement(logInBtn).click().build().perform();
		
		WebElement customerBtn = driver.findElement(By.xpath("//*[@id=\"menu-appbar\"]/div[3]/ul/li[1]/p"));
		 
		action.moveToElement(customerBtn).click().build().perform();
		
		Thread.sleep(2000);
		WebElement customerEmail = driver
				.findElement(By.xpath("//*[@id=\"standard-multiline-flexible\"]"));
		action.sendKeys(customerEmail, "jeevangp@gmail.com").perform();
		
		Thread.sleep(5000);
		WebElement customerPassword = driver
				.findElement(By.xpath("//*[@id=\"standard-adornment-password\"]"));
		action.sendKeys(customerPassword, "12345").perform();
		

		Thread.sleep(5000);
		WebElement signInBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/form/button"));
		action.moveToElement(signInBtn).click().build().perform();
		
		Thread.sleep(5000);
		WebElement alertBtn = driver.findElement(By.xpath("/html/body/div[5]/div/div[6]/button[1]"));
		action.moveToElement(alertBtn).click().build().perform();
		
		Thread.sleep(5000);
		WebElement bookingBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/button[2]"));
		action.moveToElement(bookingBtn).click().build().perform();
		
		
		
		Thread.sleep(5000);
		WebElement undoBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/a"));
		action.moveToElement(undoBtn).click().build().perform();
		
		Thread.sleep(5000);
		WebElement viewStorageBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div/form/div[1]/div/button"));
		action.moveToElement(viewStorageBtn).click().build().perform();
		
		Thread.sleep(5000);
		WebElement viewRackBtn1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/table/tbody/tr[1]/button"));
		action.moveToElement(viewRackBtn1).click().build().perform();
		
		Thread.sleep(5000);
		WebElement viewRackBtn2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/table/tbody/tr[2]/button"));
		action.moveToElement(viewRackBtn2).click().build().perform();
		
		Thread.sleep(5000);
		WebElement viewBookingPage = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/table/thead/div/a"));
		action.moveToElement(viewBookingPage).click().build().perform();
		
		
		
		Thread.sleep(5000);
		WebElement product = driver
				.findElement(By.xpath("//*[@id=\"standard-textarea\"]"));
		action.sendKeys(product, "Apples").perform();
		
		Thread.sleep(5000);
		WebElement storageId = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div/form/div[2]/div/select[1]"));
		storageId.findElement(By.xpath("//option[@value='2']")).click();
		
		Thread.sleep(5000);
		WebElement rackId = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div/form/div[2]/div/select[2]"));
		rackId.findElement(By.xpath("//option[@value='4']")).click();
		
		
		Thread.sleep(5000);
		WebElement capacity = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div/form/div[3]/div[1]/input"));
		action.sendKeys(capacity, "30").perform();
		
		Thread.sleep(5000);
		WebElement fromDate =  driver.findElement(By.xpath("//*[@id=\"fromDate\"]"));
		fromDate.clear();
		action.sendKeys(fromDate, "20062024").perform();
		
		Thread.sleep(5000);
		WebElement toDate =  driver.findElement(By.xpath("//*[@id=\"toDate\"]"));
		toDate.clear();
		action.sendKeys(toDate, "22062024").perform();
		
		
		Thread.sleep(5000);
		//*[@id="root"]/div/div/div/div/div[3]/div/form/div[3]/button
		WebElement bookBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div/form/div[3]/button"));
		action.moveToElement(bookBtn).click().build().perform();
		
	}
	
	
}
