package day9_12052023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_Tryncatch {
    public static void main(String[] args) {
        //setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chromeoptions
        options.addArguments("start-maximized");
        //open in incognito mode
        options.addArguments("incognito");

        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calc
        driver.navigate().to("https://www.mortgagecalculator.org/");
        try {
            //enter a home value
            WebElement homeValue = driver.findElement(By.xpath("//*[@id = 'homeval']"));
            //clear the field
            homeValue.clear();
            //enter a value of 950000
            homeValue.sendKeys("950000");
        } catch (Exception e) {
            System.out.println("Unable to enter home value for reason " + e);
        }//end of homevalue try catch
        try {
            //enter a downpayment value
            WebElement dpValue = driver.findElement(By.xpath("//*[@id = 'downpayment']"));
            //clear the field
            dpValue.clear();
            //enter a value of 950000
            dpValue.sendKeys("200000");
        }catch (Exception e){
            System.out.println("Unable to enter downpayment value for reason " + e);
        }//end of downpayment try catch
        //quit driver
        driver.quit();


    }//end of main
}//end of class
