package Selenium_With_Java.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
    @Test
    void HardAssertion() {
        Assert.assertEquals(123, 123);
        Assert.assertTrue(1==1);
        Assert.assertEquals("hello", "hello");
    }
}
