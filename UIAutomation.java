package com.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIAutomation {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, Exception 
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	    WebElement google_search = driver.findElement(By.name("q"));
	    google_search.sendKeys("Amazon");
	    WebElement google_search_button = driver.findElement(By.name("btnK"));
	    google_search_button.click();
	    driver.findElement(By.xpath("//h3[text()='Amazon.in']")).click();
	    driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	    WebElement email = driver.findElement(By.id("ap_email"));
	    email.sendKeys("vijayaraghavap1996@gmail.com");
	    driver.findElement(By.id("continue")).click();
	    WebElement pass = driver.findElement(By.name("password"));
	    pass.sendKeys("amazonpass@1");
	    driver.findElement(By.id("signInSubmit")).click();
	   
	  	WebElement all = driver.findElement(By.id("searchDropdownBox"));   
	  	all.click();
	  	Select s = new Select(all);
	  	s.selectByIndex(16);
	  	Robot r = new Robot();
	  	r.keyPress(KeyEvent.VK_ENTER);
	  	r.keyRelease(KeyEvent.VK_ENTER);
	  	
	  	driver.findElement(By.xpath("//a[@aria-label='Laptops & Accessories']")).click();
	    driver.findElement(By.xpath(("//*[text()='Category']//following::span[text()='Laptops']"))).click();
	    driver.findElement(By.xpath("//span[text()='Brands']//following::span[text()='Dell']")).click();
	    
	    WebElement min = driver.findElement(By.id("low-price"));
	    min.sendKeys("30000");
	    WebElement max = driver.findElement(By.id("high-price"));
	    max.sendKeys("50000");
	    
	    driver.findElement(By.id("a-autoid-1")).click();
	    
	    WebElement product = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[3]"));
	    product.click();
	    
	    String w1 = driver.getWindowHandle();
		Set<String> w2 = driver.getWindowHandles();
		for(String W : w2)
		{
			if(!W.equals(w1))
			{
				driver.switchTo().window(W);
			}
	
		}	
	    
	    WebElement Product_name = driver.findElement(By.id("productTitle"));
	    String text = Product_name.getText();
	    System.out.println(text);
	    
	    WebElement wishlist = driver.findElement(By.id("add-to-wishlist-button-submit"));
	    wishlist.click();
	    
	    driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
	    
	    driver.switchTo().window(w1);
	    
	    driver.findElement(By.xpath("//a[@aria-label='Go to next page, page 2']")).click();
	    
	    driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[3]")).click();
	    
	    String wi1 = driver.getWindowHandle();
		Set<String> wi2 = driver.getWindowHandles();
		for(String Wi : wi2)
		{
			if(!Wi.equals(wi1))
			{
				driver.switchTo().window(Wi);
			}
	
		}	
		WebElement Product_name1 = driver.findElement(By.id("productTitle"));
	    String text1 = Product_name1.getText();
	    System.out.println(text1);
	    
	    WebElement wishlist1 = driver.findElement(By.id("add-to-wishlist-button-submit"));
	    wishlist1.click();
	    
	    driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
	    
	    driver.switchTo().window(wi1);
	    
	    driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[15]")).click();
	    String win1 = driver.getWindowHandle();
		Set<String> win2 = driver.getWindowHandles();
		for(String Win : win2)
		{
			if(!Win.equals(win1))
			{
				driver.switchTo().window(Win);
			}
	
		}	
		WebElement Product_name2 = driver.findElement(By.id("productTitle"));
	    String text2 = Product_name2.getText();
	    System.out.println(text2);
	    
	    WebElement wishlist2 = driver.findElement(By.id("add-to-wishlist-button-submit"));
	    wishlist2.click();
	    
	    driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
	    
	    driver.switchTo().window(win1);
	    
	    WebElement findElement = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	    
	    Actions a = new Actions(driver);
	    a.moveToElement(findElement).build().perform();
	    driver.findElement(By.xpath("//div[text()='Your Account']//following::*[text()='Your Wish List']")).click();
	    
	    
	}

}
