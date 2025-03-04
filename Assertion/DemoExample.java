package Selenium_With_Java.Assertion;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example1 {
    @Test
    void EqualTest() {
        String a = "World";
        String b = "World";
        if (a.equals(b)) {
            System.out.println("Equals passed");
            Assert.assertTrue(true);
        } else {
            System.out.println("Equals failed");
            Assert.assertTrue(false);
        }
    }
}
