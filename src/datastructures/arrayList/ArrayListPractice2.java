package datastructures.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("NY");
        arrayList.add("NJ");
        arrayList.add("VA");

        //using for loop
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("");

        //using Iterator
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
