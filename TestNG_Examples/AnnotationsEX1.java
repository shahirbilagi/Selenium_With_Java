package Selenium_With_Java.TestNG_Examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Login Method - @BeforeMethod
// Search Method - @Test
// Advance Search Method - @Test
// Logout Method - @BeforeMethod
public class AnnotationsEX1 {
    @BeforeMethod
    void Login() {
        System.out.println("Login Method");
    }

    @AfterMethod
    void Logout() {
        System.out.println("Logout Method");
    }

    @Test(priority = 1)
    void Search() {
        System.out.println("Search Method");
    }

    @Test(priority = 2)
    void AdvSearch() {
        System.out.println("Advance Search Method");
    }
}
