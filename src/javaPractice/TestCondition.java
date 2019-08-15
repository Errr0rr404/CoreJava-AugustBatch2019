package javaPractice;

public class TestCondition {
    //psvm - shortcut
    public static void main(String[] args) {
        // if(condition){-- if block starts
        // action
        //}-- if block ends

        //If Block
        int x = 9;
        if (x > 10) {
            System.out.println("x is greater than 10");
        }
        if (x < 10) {
            System.out.println("x is less than 10");
        }
        System.out.println("***********************");
        // If Else Block
        int a = 4;
        if (a > 3) {
            System.out.println("a is greater than 3");
        } else {
            System.out.println("a is less than 3");
        }
        System.out.println("***********************");
        // else if
        int b = 5;
        if (b > 5) {
            System.out.println("b is greater than 5");
        } else if (b == 5) {
            System.out.println("b is equals to 5");
        } else if (b < 5) {
            System.out.println("b is equals to 5");
        }
        System.out.println("***********************");
        // && - And
        // |  - Or
        // !  - Not
        // != - Not Equal
        int s = 9;
        int t = 10;

        if (s > 10 && t < 12) {
            if(s==12){
                //do this
            }else{
               //do this
            }
            System.out.println(" we won ");
        } else if (s == 12 | t == 12) {
            System.out.println(" we lost ");
        } else if (s != 12) {
            System.out.println(" nothing ");
        }
    }

}
