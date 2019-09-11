package string;

public class ReversedString {

    // Create a  method which will take a String param
    // and return reversed string of that


    //Example
    //ELPMAXE

    public static String getReversed(String value) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = value.length() - 1; i >= 0; i--) {
            stringBuilder.append(value.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String getReversedViaString(String value) {
      // Using String
        String finalText = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            finalText=finalText+value.charAt(i);
        }
        return finalText;
    }

    public static void main(String[] args) {
        System.out.println(getReversed("EXAMPLE"));
        System.out.println(getReversedViaString("EXAMPLE"));
    }
}
