package testng;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class PriorityEg {
    // we can give priority as a chars('a'),values(-1),(0)
    // starts from less values like (-5,-4,-3,....)
    // we cant give priority as a float value

    @Test(priority = 2,groups = {"sanity"})
    public void test_1(){
        System.out.println("Test case 1");
    }
    @Test(priority = 'a')
    public void test_2(){
        System.out.println("Test case 2");
    }
    @Test(priority = 0,enabled = true )
    // if we don't want to execute specific test then we use enabled = false/true
    public void test_3(){
        System.out.println("Test case 3");
    }
    @Test(priority = -1,groups = {"sanity"})
    public void test_4(){
        System.out.println("4");
    }
    @Test(priority = 1)
    public void test_5() {
        System.out.println("5");
    }

    @Test(priority = 'a',groups = "sanity")
    public void test_7() {
        System.out.println("Test case 7");
    }

     @Test(priority = 'b',groups = "regression")
    public void test_8() {
     System.out.println("Test case 8");
 }
    @Test(priority = 'a',groups = "sanity")
    public void test_9() {
        System.out.println("Test case 9");
         System.out.println("Hello guys");
    }

}
