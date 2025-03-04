package Selenium_With_Java.TestNG_Examples.Test_Suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class class2 {
    @AfterTest
    void Logout() {
        System.out.println("After Test Method");
    }

    @Test
    void AdvSearch() {
        System.out.println("Advance Search Method");
    }
}
