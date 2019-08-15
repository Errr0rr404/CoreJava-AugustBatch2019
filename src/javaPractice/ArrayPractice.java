package javaPractice;

public class ArrayPractice {

    public static void main(String[] args) {
        //Array Symbol -- []
        String[] name = {"Mr X", "Mr Y", "Mr Z", "Mr A"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name.length);
        System.out.println("**************");

        for (int a = 0; a < name.length; a++) {
            System.out.println(name[a]+a);
        }

        System.out.println("**************");

        Object[] objectArray = {"Mr B", 1};

        for (int i = 0; i < objectArray.length; i++) {
            System.out.println(objectArray[i]);
        }


        System.out.println("************");

        //enhanced for loop / for each

        int[] id = {12, 11, 111, 223, 322};

        for(int s : id){
            System.out.println(s);
        }

    }
}
