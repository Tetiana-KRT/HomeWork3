package HomeWork3;

import java.util.HashMap;

public class HashMapTask3 {
    public static void main(String[] args) {
        java.util.HashMap<Integer, String> hashMap = new java.util.HashMap<>();
        hashMap.put(1,"one");//31 - How do you add key-value pairs to HashMap?
        hashMap.put(2,"two");
        hashMap.put(3,"three");
        hashMap.putIfAbsent(4, "four");//32 - How do you add given key-value pair to HashMap if and only if it is not present in the HashMap?
        hashMap.putIfAbsent(5, "five");
        hashMap.remove(2);//40 - How do you remove a key-value pair from the HashMap?
        hashMap.remove(3, "three");//41 - How do you remove a key-value pair from a HashMap if and only if the specified key is currently mapped to given value?
        hashMap.replace(4, "six");//42 - How do you replace a value associated with a given key in the HashMap?
        hashMap.replace(5, "five", "seven");//43 - How do you replace a value associated with the given key if and only if it is currently mapped to given value?

        System.out.println(hashMap);//39 - How do you retrieve all key-value pairs present in a HashMap?

        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsKey(7));
        System.out.println(hashMap.containsValue("one"));
        System.out.println(hashMap.containsValue("six"));//34 - How do you check whether a particular key/value exist in a HashMap?

        System.out.println(hashMap.size());//35 - How do you find out the number of key-value mappings present in a HashMap?
        System.out.println(hashMap.keySet());//37 - How do you retrieve all keys present in a HashMap?
        System.out.println(hashMap.values());//38 - How do you retrieve all the values present in a HashMap?


        System.out.println(hashMap.get(2));//33 - How do you retrieve a value associated with a given key from the HashMap?
        hashMap.clear();//36 - How do you remove all key-value pairs from a HashMap? OR How do you clear the HashMap for reuse?
        System.out.println(hashMap + "Cleared");




    }
}
