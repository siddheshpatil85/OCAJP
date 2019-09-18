package testNgPkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {


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
        }

}