package Selenium_With_Java.Dependency_Groups.Groups_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginLogout {
    @Test(groups = {"AppFunctionality"})

    public void LoginTest() {
        Assert.assertTrue(true);
        System.out.println("Login Successful");
    }

    @Test(groups = {"AppFunctionality"})
    public void SearchTest() {
        Assert.assertTrue(true);
        System.out.println("Search Successful");
    }

    @Test(groups = {"AppFunctionality"})
    public void LogoutTest() {
        Assert.assertTrue(true);
        System.out.println("Logout Successful");
    }
}
