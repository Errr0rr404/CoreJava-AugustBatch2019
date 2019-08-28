package datastructures.array;

import java.util.Random;

public class RandomNumbers {

    //Create an array and store 5 random numbers


    public static void main(String[] args) {
        int[] studentId = new int[5];
        // studentId[0]=10;
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int newValue = random.nextInt(100);
            studentId[i] = newValue;
        }

        for (int i = 0; i < studentId.length; i++) {
            System.out.println(studentId[i]);
        }

    }
}
