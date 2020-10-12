package HomeWork3;

import HomeWork2.Task1.Vector;

import java.util.LinkedList;

public class Collections {
    public static String getIndexOfElementIfExists(LinkedList<String> linkedList, String element){
    boolean containsElement = linkedList.contains(element);
        String result = "";
            if (containsElement == true){
                result = "Index of element " + element + " is " + linkedList.indexOf(element);
    }
            else {
                result = "Element " + element + " doesn't exist";
            }
        return result;
    }

    public static LinkedList<String> getReversedList(LinkedList<String> linkedList){
        LinkedList<String> revertLinkedList = new LinkedList<>();
        for (int i=linkedList.size()-1; i>=0; i--){
        revertLinkedList.add(linkedList.size()-i-1, linkedList.get(i));
        }
        return revertLinkedList;
    }
}
