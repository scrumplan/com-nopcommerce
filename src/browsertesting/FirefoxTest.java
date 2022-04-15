package browsertesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxTest {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

       WebElement emailField = driver.findElement(By.id("Email"));
       emailField.sendKeys("Pramukh890@gmail.com");
       WebElement passwordField = driver.findElement(By.name("Password"));
       passwordField.sendKeys("Pramukh890");
       driver.close();






    }
}
