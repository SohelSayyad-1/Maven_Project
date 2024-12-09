package testng;

import org.testng.annotations.Test;

public class TestngAttributeEg {
    // invocationCount is used to run single test multiple times
    // invocationTimeOut is used to give specific time for running given test
    @Test(invocationCount =300,invocationTimeOut =10)
    public void attribute(){
        System.out.println("Attribute method");
    }
}
