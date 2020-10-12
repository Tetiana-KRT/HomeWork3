package HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class List {
    public static void main(String[] args){
        java.util.List<String> list = new ArrayList<>();//better way
        java.util.List<String> list1 = new ArrayList<>();//better way
        ArrayList<String> worseList = new ArrayList<>();//worse way

        list.add("Element1");//10 - How do you append an element at the end of an ArrayList?
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");
        list1.add("Element10");
        list1.add("Element11");
        list1.add("Element12");
        list1.add("Element13");
        list.add(2, "the third element");//11 - How do you insert an element at a particular position of an ArrayList?
        list.remove("Element3");//13 - How do you remove the given element from an ArrayList?
        list.remove(1);//12 - How do you remove an element from a particular position of an ArrayList?
//        list.clear();//14 - How do you remove all elements of an ArrayList at a time?
        String a = list.get(0);//8 - How do you retrieve an element from a particular position of an ArrayList?
        boolean b = list.contains("Element4");//5 - How do you check whether the given element is present in an ArrayList or not?
//        list.addAll(1, list1);//17 - How do you insert more than one element at a particular position of an ArrayList?
        list.addAll(list1);//16 - How do you join two ArrayLists?
        boolean c = list.isEmpty();//4 - How do you find out whether the given ArrayList is empty or not?
        int d = list.indexOf("Element12");//6 - How do you get the position of a particular element in an ArrayList?
        int e = list.size();//3 - How do you find the number of elements present in an ArrayList?
        list.toArray();//7 - How do you convert an ArrayList to Array?
        list.subList(1, 3);//15 - How do you retrieve a portion of an ArrayList?
        list1.set(1, "element");//9 - How do you replace a particular element in an ArrayList with the given element?
        ((ArrayList<String>) list1).ensureCapacity(50);//1 - How do you increase the current capacity of an ArrayList?
        ((ArrayList<String>) list).trimToSize();//2 - How do you decrease the current capacity of an ArrayList to the current size?



        System.out.println(list);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("sublist: " + list.subList(1, 3));
        System.out.println(list1);

    }
}
