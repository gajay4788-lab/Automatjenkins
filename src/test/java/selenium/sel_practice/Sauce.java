package selenium.sel_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sauce {
           WebDriver driver ;
    @BeforeSuite       
	public void login () {
        driver = new ChromeDriver();
    	   
    	driver.get("https://www.saucedemo.com/");
    	
    }
    
    @Test
    public void user () {
       driver.manage().window().maximize();
       driver.findElement(By.id("user-name")).sendKeys("standard_user");
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
       driver.findElement(By.id("login-button")).click();
            
	}
    @AfterMethod
    public void close () {
    	driver.quit();
    }
    
}
