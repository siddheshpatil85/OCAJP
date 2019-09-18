package seleniumPkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;


public class BasicGoogleSearch1Test {
        //WebDriver driver = new InternetExplorerDriver();
        WebDriver driver = new ChromeDriver();
        String url = "http://www.google.com";

        @Before
        public void setup() {
        String driverPath;
        //System.setProperty("Webdriver.ie.driver", "C:\\Siddhesh _ Re-Skilling\\Jars and Drivers\\Driver\\DriverIEDriverServer.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Siddhesh _ Re-Skilling\\Jars and Drivers\\Driver\\chromedriver.exe");
        driver.get("https://www.google.com");
        }

        @Test
        public void Operate() {
            WebElement element = driver.findElement(By.name("q"));
            element.sendKeys("Cheese!\n"); // send also a "\n"
            element.submit();
        }

        @After
        public void tearDown() {
            System.out.println("Tear Down");
        }



}

