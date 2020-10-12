package HomeWork3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static HomeWork3.Collections.getIndexOfElementIfExists;
import static HomeWork3.Collections.getReversedList;

public class LinkedList {
        public static void main(String[] args) {
            java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
            linkedList.add("q");
            linkedList.add("r");
            linkedList.add("w");
            linkedList.add("e");
            linkedList.add("q");
            linkedList.add("r");
            linkedList.add("w");
            linkedList.add("q");

            List<String> list = new ArrayList<>();
            list.add("Element1");
            list.add("Element2");
            list.add("Element3");

            List<String> spareList = new ArrayList<>();
            spareList.add("e1");
            spareList.add("e2");
            spareList.add("e3");

            linkedList.addAll(list);//20 - How do you join an ArrayList at the end of a LinkedList?
            linkedList.addFirst("theFirst");
            linkedList.addLast("theLast");//21 - How do you insert an element at the head and tail of a LinkedList?
            linkedList.add(3, "the third");//22 - How do you add an element or collection of elements at a specific position of a LinkedList?
            linkedList.addAll(4, spareList);//22 - How do you add an element or collection of elements at a specific position of a LinkedList?
            linkedList.removeFirst();//23 - How do you remove the elements of a LinkedList from both the ends?
            linkedList.removeLast();//23 - How do you remove the elements of a LinkedList from both the ends?
            linkedList.getFirst();//24 - How do you retrieve but not remove the elements of a LinkedList from both the ends?
            linkedList.getLast();//24 - How do you retrieve but not remove the elements of a LinkedList from both the ends?
            linkedList.remove(4);//25 -  How do you retrieve and remove and only retrieve an element from specific position of a LinkedList?
            linkedList.get(1);//25 -  How do you retrieve and remove and only retrieve an element from specific position of a LinkedList?
            linkedList.removeFirstOccurrence("w");//27 - How do you remove the first occurrence and last occurrence of a given element in a LinkedList?
            linkedList.removeLastOccurrence("r");//27 - How do you remove the first occurrence and last occurrence of a given element in a LinkedList?
            java.util.LinkedList<String> clone = (java.util.LinkedList<String>) linkedList.clone();//29 - How do you create clone of a LinkedList?
            linkedList.lastIndexOf("q");//30 - How do you get the position of last occurrence of a given element in a LinkedList?

            System.out.println(linkedList);
            System.out.println(linkedList.lastIndexOf("q"));//30 - How do you get the position of last occurrence of a given element in a LinkedList?
            System.out.println(clone);
            System.out.println(linkedList.getFirst());
            System.out.println(linkedList.getLast());
            System.out.println(linkedList.indexOf("w"));//26 - How do you get the number of elements in a LinkedList?
            System.out.println(getReversedList(linkedList));//Write a Java program to traverse the elements of a LinkedList in reverse direction?
            System.out.println(getIndexOfElementIfExists(linkedList, "e"));//Given an element, how do you find out whether that element exist in a LinkedList or not. If it exist retrieve the position of that element?
            System.out.println(getIndexOfElementIfExists(linkedList, "a"));//Given an element, how do you find out whether that element exist in a LinkedList or not. If it exist retrieve the position of that element?

            linkedList.clear();//28 - How do you remove all elements of a LinkedList?


        }

}
