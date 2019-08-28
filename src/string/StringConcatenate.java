package string;

public class StringConcatenate {

    public static void main(String[] args) {
        //a+b+c
        String a = "people";
        String b = "and";
        String c = "tech";
        System.out.println(a + b + c);

        System.out.println("*********************");

        //concat
        String x = "Rock";
        String y = "star";
        String z = x.concat(y);
        System.out.println(z);

        System.out.println("*********************");
        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rock");
        System.out.println(stringBuilder);
        stringBuilder.append("star");
        System.out.println(stringBuilder);

        System.out.println("*********************");

        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            stringBuilder2.append(i);
        }
        System.out.println(stringBuilder2);

        System.out.println("*********************");
        String numbers = "";
        for (int i = 0; i < 5; i++) {
            numbers += i;
        }
        System.out.println(numbers);

    }
}
