package seleniumPkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo02_WorkingWithIE {

    WebDriver driver;
    String url = "https://www.google.com";

    @Before
    public void setUp() {
        //Set the key/value property according to the browser you are using.
        System.setProperty("webdriver.gecko.driver","C:\\Siddhesh _ Re-Skilling\\Jars and Drivers\\Driver\\geckodriver.exe");

  //Open browser instance
   driver = new FirefoxDriver();

        //Open the AUT
        driver.get(url);
    }

    @Test
    public void test() {
        //Fetch the page title
        String pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);
    }

    @After
    public void tearDown() {
        //Close the browser
        driver.close();
    }
}
