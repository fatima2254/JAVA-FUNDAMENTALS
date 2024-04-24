package collections;

import org.testng.annotations.Test;

import java.util.*;

public class MapCollection {


    @Test
    public void mapCases() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("key", "value");
        System.out.println(hashMap.get("key"));

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "value");
        System.out.println(treeMap.get(1));
    }

    @Test
    public void mapElements() {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key1", "value2");

        System.out.println(map);

        map.put("key2", "value1");
        map.put("key3", "value1");
        map.put("key4", "value1");
        map.put("key5", "value1");

        System.out.println(map);
    }

    @Test
    public void mapEntry() {
        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> entry: entrySet) {
            System.out.printf("Entry key: %s, Entry value: %s \n", entry.getKey(), entry.getValue());
        }
    }

    @Test
    public void basicMethods() {
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        //get item
        String first = states.get(2);
        System.out.println(first);
        //get Keys
        Set<Integer> keys = states.keySet();
        //get Values
        Collection<String> values = states.values();
        //Update item
        states.replace(1, "Poland");
        //Remove item by key
        states.remove(2);
        for(Map.Entry<Integer, String> item : states.entrySet()){
            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Person> people = new HashMap<>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for(Map.Entry<String, Person> item : people.entrySet()){
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }

    class Person{

        private String name;
        public Person(String value){

            name=value;
        }
        String getName(){return name;}
    }
}
