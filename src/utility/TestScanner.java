package utility;

import java.util.Scanner;

public class TestScanner {


    public static int calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** insert first value :");
        int a = scanner.nextInt();
        System.out.println("**** insert second value :");
        int b = scanner.nextInt();
        int x = a + b;
        return x;
    }

    public static void studentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Insert name of the student  :");
        String name = scanner.nextLine();

        System.out.println("****Insert age of the student :");
        int age = scanner.nextInt();

        System.out.println("****Insert mobileNumber of the student :");
        long mobileNum = scanner.nextLong();

        System.out.println("****Insert gender of the student :");
        char gender = scanner.next().charAt(0);

        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Mobile Number is : " + mobileNum);
        System.out.println("Gender is : " + gender);

    }

    public static void main(String[] args) {
        //int result = calculator();
        //System.out.println("my total value is : "+result);
        studentInfo();
    }
}
