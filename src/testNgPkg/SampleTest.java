package testNgPkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void testMethodOne() {
        Assert.assertTrue(true);
    }

    @Test
    public void testMethodTwo() {
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"testMethodOne"})
    public void testMethodThree() {
        Assert.assertTrue(true);
    }
}