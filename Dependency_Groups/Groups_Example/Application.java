package Selenium_With_Java.Dependency_Groups.Groups_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Application {
    @Test(groups = {"PaymentFunctionality","AppFunctionality"})
    public void Amazon(){
        Assert.assertTrue(true);
        System.out.println("Amazon Application");
    }
    @Test(groups = {"AppFunctionality"})
    public void Flipkart(){
        Assert.assertTrue(true);
        System.out.println("Flipkart Application");
    }
    @Test(groups = {"PaymentFunctionality"})
    public void Github(){
        Assert.assertTrue(true);
        System.out.println("Github Application");
    }
}
