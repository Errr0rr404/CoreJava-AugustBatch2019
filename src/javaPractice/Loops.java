package javaPractice;

public class Loops {
    public static void main(String[] args) {


        //for loops
        //--loopConditionStarts                                             --loopConditionEnds
        // for( dataType variable = whereToStart;whereToFinish;Increment/Decrement )
        for (int a = 0; a < 5; a++) {
            System.out.println(a+" Books ");
        }

        // Inner for loop
        // print selenium 5 times, and for each time you print selenium, print java 2 time

        for (int x = 0; x < 5; x++) {
            System.out.println("Selenium");
            for (int z = 0; z < 2; z++) {
                System.out.println("Java");
            }
        }


        //while loop
        int x = 0;
        while (x < 5) {
            System.out.println(x+" Java Books");
            x++;
        }

        // do while loop
        int s = 0;
        do{
            System.out.println("I love Java");
            s++;
        }
        while(s<5);


    }
}
