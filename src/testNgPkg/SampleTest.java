package testNgPkg;

import org.testng.Assert;
import org.testng.annotations.*;

public class SampleTest {
    @BeforeSuite
    public void bfrSuite ()
    {
        System.out.println("Executing BeforeSuite");
    }

    @BeforeTest
    public void bfrTest ()
    {
        System.out.println("Executing bfrTest");
    }
    @BeforeClass
    public void bfrClass ()
    {
        System.out.println("Executing bfrClass");
    }

    @BeforeMethod
    public void bfrMethod ()
    {
        System.out.println("Executing bfrMethod");
    }

        @Test(priority = 2)
        public void testMethodTwo ()
        {
            System.out.println("Executing testMethodTwo");
            Assert.assertTrue(2 == 2);
        }

        @Test(priority = 1)
        public void testMethodOne ()  {
        System.out.println("Executing testMethodOne");
        Assert.assertTrue("A" == "A");
        }

        @Test(dependsOnMethods = {"testMethodTwo"})
        public void testMethodThree () {
        System.out.println("Executing testMethodThree");
        Assert.assertTrue(true);
        Assert.assertTrue(false);
    }

    @AfterSuite
    public void afterSuite ()
    {
        System.out.println("Executing afterSuite");
    }
    @AfterTest
    public void afterTest ()
    {
        System.out.println("Executing afterTest");
    }
    @AfterClass
    public void afterClass ()
    {
        System.out.println("Executing afterClass");
    }

    @AfterMethod
    public void afterMethod ()
    {
        System.out.println("Executing afterMethod");
    }

}