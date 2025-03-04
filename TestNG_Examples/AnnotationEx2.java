package Selenium_With_Java.TestNG_Examples;

import org.testng.annotations.*;

public class AnnotationEx2 {
    // Login Method - @BeforeClass
    // Search Method - @Test
    // Advance Search Method - @Test
    // Logout Method - @AfterClass
        @BeforeClass
        void Login() {
            System.out.println("Login Method");
        }

        @AfterClass
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
