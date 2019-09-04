package assertion;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestAssertion {

    public static void main(String[] args) {
        int x = 10;
        int z = 110;
        int a = 13;
        int b = 12;

        //Hard Assert
        //(ActualValue, expectedValue )
        Assert.assertEquals(a, b);

        if (b > a) {
            Assert.fail("Failed to validate");
        }

        //Soft Assert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(a, b, "1st try Custom Message Assertion Failed");
        softAssert.assertEquals(x, z, "2nd try Custom Message Assertion Failed");
        softAssert.assertAll();
    }
}
