package datastructures;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "NYC");
        hashMap.put(2, "NJ");
        hashMap.put(3, "VA");
        //./...
        System.out.println(hashMap);
        System.out.println(hashMap.size());

        System.out.println(hashMap.get(3));
        System.out.println(hashMap.containsKey(3));
        System.out.println(hashMap.containsKey(4));

        HashMap<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("NYC", 34);
        hashMap2.put("NJ", 45);
        hashMap2.put("VA", 23);
        System.out.println(hashMap2.containsKey("NYC"));
        //hashMap2.containsValue()
        //hashMap2.put()
    }
}
