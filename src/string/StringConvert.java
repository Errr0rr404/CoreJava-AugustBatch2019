package string;

public class StringConvert {

    public static void main(String[] args) {
        //HomeWork
        //String ----> decimal,boolean
        //Float.valueOf()
        //Boolean.valueOf()

        String a = "10";

        //Using Integer.valueOf(..)
        Integer b = Integer.valueOf(a);
        System.out.println(b);

        //Using Integer.parseInt()
        int c = Integer.parseInt(a);
        System.out.println(c);

        //NumberFormatException
        String x = "12A";
        try {
            Integer y = Integer.valueOf(x);
            System.out.println(y);
        } catch (NumberFormatException ee) {
            System.out.println("NumberFormatException occured ");
            ee.printStackTrace();
        }
    }
}
