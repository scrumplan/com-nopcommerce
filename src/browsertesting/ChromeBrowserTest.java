package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {


        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe ");
        WebDriver driver = new ChromeDriver();
        //Browser lunch the Url
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Print the current url
        System.out.println("Current URL = " + driver.getCurrentUrl());
          //Print the page source
        System.out.println(driver.getPageSource());
            //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime789@gmail.com");
            //Enter the password to password field
       WebElement passwordField = driver.findElement(By.name("Password"));
       passwordField.sendKeys("prime789");

       // Close the browser
        driver.close();






    }
}
