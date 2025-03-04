package Selenium_With_Java.Dependency_Groups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyDemo {
    @Test(priority = 1)
    public void openapp() {
        Assert.assertTrue(true);
    }

    @Test(priority = 2, dependsOnMethods = {"openapp"})
    public void login() {
        Assert.assertTrue(true);
    }

    @Test(priority = 3, dependsOnMethods = {"login"})
    public void logout() {
        Assert.assertTrue(true);
    }
}
