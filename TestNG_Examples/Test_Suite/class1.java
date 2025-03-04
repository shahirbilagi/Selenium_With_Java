package Selenium_With_Java.TestNG_Examples.Test_Suite;

import org.testng.annotations.*;

public class class1 {
    @BeforeTest
    void Login() {
        System.out.println("Before Test Method");
    }

    @Test
    void Search() {
        System.out.println("Search Method");
    }
}
