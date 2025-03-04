package Selenium_With_Java.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.ref.SoftReference;

public class Hard_Soft {
    @Test(priority = 1)
    public void hard() {

        System.out.println("Hard Assertion Started");

        Assert.assertEquals(123, 123);

        System.out.println("Hard Assertion Ended");
    }

    @Test
    public void Soft() {
        System.out.println("Soft Assertion Started");

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(123, 123);

        System.out.println("Soft Assertion Ended");

        soft.assertAll();//for validating Soft Assertions
    }
}
