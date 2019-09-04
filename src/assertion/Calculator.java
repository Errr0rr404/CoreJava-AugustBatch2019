package assertion;

import org.testng.annotations.Test;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    @Test
    public void additionExecutable() {
        System.out.println(10 + 11);
    }


   /* public int addition(int a,int b){
        int c = a+b;
        return c;
    }*/
}
