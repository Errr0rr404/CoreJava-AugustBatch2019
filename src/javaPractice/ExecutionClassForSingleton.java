package javaPractice;

public class ExecutionClassForSingleton {
    public static void main(String[] args) {
        TestClassForSingleton testClassForSingleton1 = TestClassForSingleton.getInstance();
        TestClassForSingleton testClassForSingleton2 = TestClassForSingleton.getInstance();

        testClassForSingleton1.x = testClassForSingleton1.x.toUpperCase();
        testClassForSingleton2.x = testClassForSingleton2.x.toLowerCase();

        System.out.println(testClassForSingleton1.x);
        System.out.println(testClassForSingleton2.x);

    }
}
