package testng.failscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailScript {
   // @Test(retryAnalyzer = ReRunFailedTCAutomatically.class)
    // we can use this but we've to add after every tests so its very hectic so, we cant use
    @Test
    public void test1(){
        System.out.println("tc1");
    }
    @Test
    public void test2(){
        System.out.println("tc2");
    }
    @Test
    public void test3(){
        Assert.assertTrue(false);
        System.out.println("tc3");
    }
    @Test
    public void test4(){
        System.out.println("tc4");
    }
    @Test
    public void test5(){
        System.out.println("tc5");
        Assert.assertTrue(false);
    }
}
