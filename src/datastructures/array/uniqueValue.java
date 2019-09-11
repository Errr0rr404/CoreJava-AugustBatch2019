package datastructures.array;

import java.util.ArrayList;
import java.util.Collections;

public class uniqueValue {
    //you are given an array of int
    //{1, 3, 2, 2, 3, 10, 7, 3}
    //write code to find the distinct values of the array
    //1, 2, 3, 7, 10 -- should be the output
    //and sort the array

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 2, 3, 10, 7, 3};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    flag = true;
                    break;
                }
            }
            //!flag = flag==false
            if (!flag) {
                arrayList.add(array[i]);
            }
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
