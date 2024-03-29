package day6_11282023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_WEBelement {
    public static void main(String[] args) throws InterruptedException {
        //setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chromeoptions
        options.addArguments("start-maximized");
        //open in incognito mode
        options.addArguments("incognito");
        options.addArguments("incognito");
        //run in headless mode (runs in the background)
//        options.addArguments("headless");
        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calc website
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //store the home value into webelement variable
        WebElement homeValue = driver.findElement(By.xpath("//*[@id = 'homeval']"));
        //clear home value
        homeValue.clear();
        // type in 900000 into home value
        homeValue.sendKeys("900000");
        //wait 2 seconds
        Thread.sleep(2000);
        //quit browser
        driver.quit();

    }//end of main
}//end of class
