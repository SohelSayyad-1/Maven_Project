package testng;

import org.testng.annotations.*;

public class AnnotationsOfTestNG {

    @BeforeMethod // used for prerequisite setup
    // it will run before every test case
    public void testforBefore(){
        System.out.println("Before Test method");
    }
    @Test
    public void tc_1(){
        System.out.println("Test case 1");
    }
    @Test
    public void tc_2(){
        System.out.println("Test case 2");
    }
    @AfterMethod // used for postrequisite setup
    // it will run after every test case
    public void testforAfter(){
        System.out.println("After Test method");
    }

    @BeforeClass
    public void BeforeClass(){ // always execute before method
        System.out.println("Before test class");
    }
    @AfterClass
    public void AfterClass(){ // always execute after method
        System.out.println("After test class");
    }
}
