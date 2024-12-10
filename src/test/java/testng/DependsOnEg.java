package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnEg {
@Test
    public void loginVerify(){
    Assert.assertTrue(false); // Use to give boolean condition on specific test
    System.out.println("verify login");
}
    @Test(dependsOnMethods = ("loginVerify")) // use to perform dependency on parent test method
    // if parent test is failed then child test gonna skip
    public void TransactionVerify(){
        System.out.println("verify transaction");
    }
    @Test
    public void VerifyNewUser(){
        System.out.println("verify NewUser");
          System.out.println("Hello guys..");
}
