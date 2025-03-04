package Selenium_With_Java.TestNG_Examples.Test_Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class3 {
    @BeforeSuite
    void Logout() {
        System.out.println("Before Suite Method");
    }

    @AfterSuite
    void AdvSearch() {
        System.out.println("After Suite Method");
    }
}
