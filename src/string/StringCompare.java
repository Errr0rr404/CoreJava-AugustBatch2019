package string;

public class StringCompare {
    public static void main(String[] args) {
        String value = "peoplentech";
        String value2 = "peopl";
        String value3 = "PEOPLE";
        System.out.println(value.compareTo(value2));
        System.out.println(value.compareToIgnoreCase(value3));

        //ends-starts with
        System.out.println(value.startsWith("p"));
        System.out.println(value.endsWith("h"));

        //replace
        System.out.println(value.replace('n','&'));
        System.out.println(value.replace('e','E'));

        //to upper-lower case
        System.out.println(value.toUpperCase());
    }
}
