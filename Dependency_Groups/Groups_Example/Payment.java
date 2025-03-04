package Selenium_With_Java.Dependency_Groups.Groups_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Payment {
    @Test(groups = {"PaymentFunctionality"})
    public void OnlinePayment(){
        Assert.assertTrue(true);
        System.out.println("Online payment completed");
    }
    @Test(groups = {"PaymentFunctionality"})
    public void UPI(){
        Assert.assertTrue(true);
        System.out.println("UPI payment completed");
    }
}
