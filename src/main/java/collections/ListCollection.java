package collections;

import org.testng.annotations.Test;

import java.util.*;

public class ListCollection {

    //Below are three types of collections

    //1. Not sorted array of elements
    public List<Object> arrayList = new ArrayList<>();
    public List<Object> linkedList = new LinkedList<>();

    //2.Collection of unique elements
    public Set<Object> set = new HashSet<>();

    //3.Collection of Key-Value pairs
    Map<Object, Object> map = new HashMap<>();

    //Function to add something in Arraylist
    @Test
    public void listClass() {
        arrayList.add("asd");
        arrayList.add("asd1");
        arrayList.add("asd2");
        arrayList.add("asd3");
        arrayList.add("asd4");

        //Print / Get value of any item in array by index
        System.out.println(arrayList.get(0));

        //Introduce new ArrayList
        List<Object> newList = new ArrayList();
        newList.add("123");
        newList.add("123");
        newList.add("123");

        //Add all the elements in list with built-in function
        arrayList.addAll(newList);

        //print all elements in Array using for-loop
        for(Object element: arrayList) {
            System.out.println(element);
        }

        //Printing specific value using "Contain" function
        System.out.println(arrayList.contains("asd"));
        System.out.println(arrayList.contains("asd7"));
        System.out.println(arrayList.containsAll(newList));

        //Introduce an empty Arraylist and add elements into it
        List<String> emptyList = new ArrayList<>();
        System.out.println(emptyList.isEmpty());
        emptyList.add("aaaa");
        emptyList.add("aaaa");
        emptyList.add("cccc");
        emptyList.add("aaaa");
        emptyList.add(1, "bbbb");
        emptyList.add(5, "bbbb");
        System.out.println(emptyList);

        //NOT ALLOWED
//        for (int i = 0; i < emptyList.size(); i++) {
//            emptyList.add(String.valueOf(new Random().nextInt()));
//        }
//
//        for (int i = 0; i <= emptyList.size(); i++) {
//            emptyList.remove(i);
//        }

//        emptyList.remove("cccc");
//        emptyList.remove(1);

//        System.out.println(emptyList);

//        System.out.println(emptyList.remove("asdf"));

//        System.out.println(emptyList.removeAll(List.of("aaaa", "aaaa", "aaaa")));
//        System.out.println(emptyList);

//        emptyList.clear();
//        System.out.println(emptyList);

//        System.out.println(emptyList.indexOf("cccc"));

//        for (String elem: emptyList) {
//            System.out.println("Element: " + elem);
//        }

//        for (int i = emptyList.size() - 1; i >= 0; i = i-2) {
//            System.out.println(String.format("Element on position: %s is: %s", i, emptyList.get(i)));
//        }

        int i = emptyList.size() - 1;
        String stopElem = "cccc";
        String elementTOFind = "";
//        while (i >= 0 && elementTOFind != stopElem ) {
//            elementTOFind = emptyList.get(i);
//            System.out.println(String.format("Element on position: %s is: %s", i, emptyList.get(i)));
//            i--;
//        }
        i = 0;
        do {
            elementTOFind = emptyList.get(i);
            System.out.println(elementTOFind);
            i++;
        } while (i < emptyList.size() && elementTOFind != "cccc");
    }
}
