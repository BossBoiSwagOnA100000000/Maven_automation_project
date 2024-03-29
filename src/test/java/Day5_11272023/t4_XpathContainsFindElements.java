package Day5_11272023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class t4_XpathContainsFindElements {
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
        //navigate to yahoo
        driver.navigate().to("https://www.yahoo.com/");
        //wait 2 seconds
        Thread.sleep(2000);
        //click on the finance menu (using xpath contains with findElementS
        driver.findElements(By.xpath("//*[contains(@class,'_yb_yc')]")).get(1).click();
        //wait 2 seconds
        Thread.sleep(2000);
        //quit the browser
        driver.quit();


    }//end of main
}//end of class
