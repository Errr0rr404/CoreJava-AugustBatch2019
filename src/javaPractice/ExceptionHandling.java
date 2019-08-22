package javaPractice;

public class ExceptionHandling {
    public static void main(String[] args) {


        String[] name = {"Mr X", "Mr Y", "Mr Z", "Mr A"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        //try -- keyword { -- try block starts
        //      body of the try block
        //} --try block ends catch -- keyword ( Exception's name which we are trying to catch e -- variables for the exception) {-- catch block starts
        //      body of the catch block
        //}--catch block ends


        //finally -- keyword -- finally block always gets executed
        // mostly used for DB connectivity closing
        // file reader closing
        try {
            System.out.println(name[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("caught the exception");
            ex.printStackTrace();
            //perform below
        } finally {

        }


    }
}
