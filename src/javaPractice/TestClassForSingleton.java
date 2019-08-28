package javaPractice;

public class TestClassForSingleton {

    String x;

    private static TestClassForSingleton testClassForSingleton = null;

    private TestClassForSingleton() {
        x = "this is a singleton class";
    }

    //TestClassForSingleton testClassForSingleton = new TestClassForSingleton();
    public static TestClassForSingleton getInstance() {
        if (testClassForSingleton == null) {
            testClassForSingleton = new TestClassForSingleton();
        }
        return testClassForSingleton;
    }


    //for your understanding
    String a = null;

    public void method1() {
        a = "random string";
        System.out.println(a);
    }

}
