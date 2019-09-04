package assertion;


import org.testng.Assert;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int value1 = calculator.addition(10, 22);
        Assert.assertEquals(value1, 32, "Calculator Assertion Failed");

        int value2 = calculator.addition(6, 3);
        int value3 = calculator.addition(2, 2);
        int value4 = calculator.addition(1, 5);

        //Assert the value2,value3,value4 using softAssert

    }
}
