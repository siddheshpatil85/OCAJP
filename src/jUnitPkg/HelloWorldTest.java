package jUnitPkg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @BeforeClass
    public  static void  bfrClass () {
        System.out.println("Inside Before Class Method");
    }

    @Before
    public  void bfr () {
        System.out.println("Inside Before Method");
    }

    @Test
    public  void test () {
        System.out.println("Inside Test Method");
        assertEquals("Inside Test Method", "Inside Test Method");
    }

    @After
    public  void after () {
        System.out.println("Inside After Method");
    }

    @AfterClass
    public  static void afterClass () {
        System.out.println("Inside After Class Method");
    }

    //test case ignore and will not execute
    @Ignore
    public void ignoreTest() {
        System.out.println("in ignore test");
    }
}
