package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupEg {
    @Test(groups = ("sanity"))
    public void VerifyAddtoCart(){
        Assert.assertTrue(true);
        System.out.println("Add to cart verification");
    }
    @Test(dependsOnGroups = "sanity")
    public void VerifyPaymentMethod(){
        System.out.println("Payment Method verification");
    }
    @Test()
    public void VerifyProductDelivery(){
        System.out.println("Product Delivery verification");
    }
}
