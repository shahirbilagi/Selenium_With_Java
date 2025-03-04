package Selenium_With_Java.TestNG_Examples;

//import org.junit.jupiter.api.Test;
import org.testng.annotations.Test;
public class DemoExample {
    @Test(priority = 3)
    public void open() {
        System.out.println("Application has opened");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("Login successful");
    }

    @Test(priority = 1)
    public void logout() {
        System.out.println("Logout successful");
    }
}