package testNgPkg;

import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest1 {

    @BeforeMethod()
    public void bfr ()
    {
        System.out.println("Executing bfr Method");
    }

    @AfterMethod
    public void after ()
    {
        System.out.println("Executing After Method");
    }

    @Test
    public void testMethodTwo ()
    {
        System.out.println("Executing testMethodTwo");
        Assert.assertTrue(2 == 2);
        Assert.assertTrue(2 == 2);
    }
    @Test
    public void testMethodOne ()  {
        System.out.println("Executing testMethodOne");
        Assert.assertTrue("A" == "A");
    }
    @Test(dependsOnMethods = {"testMethodTwo"})
    public void testMethodThree () {
        System.out.println("Executing testMethodThree");
        Assert.assertTrue(true);
    }

}