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

//        System.out.println(map);

        map.put("key2", "value1");
        map.put("key3", "value1");
        map.put("key4", "value1");
        map.put("key5", "value1");

//        System.out.println(map);

        Set keys = map.keySet();
        keys.forEach(System.out::println);

        List values = List.of(map.values().toArray());
        values.forEach(System.out::println);
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
        states.put(11, "Germany");
        states.put(12, "Spain");
        states.put(15, "Spain");
        states.put(22, "Spain");
        states.put(78, "Spain");
        states.put(45, "Spain");
        states.put(14, "France");
        states.put(13, "Italy");
        states.put(2, "Italy TO REMOVE");

        Map<Map<Map<Boolean, String>, Integer>, Set<Character>> complexMap = new HashMap<>();
        Map<Boolean, String> nestedNestedMap = new HashMap<>();
        Map<Map<Boolean, String>, Integer> nestedMap = new HashMap<>();
        Set<Character> nestedSet = new HashSet<>();
//
        nestedNestedMap.put(false, "Joker");
        nestedMap.put(nestedNestedMap, 123);

        complexMap.put(nestedMap, nestedSet);

        Map<Boolean, Object> stupidMap = new HashMap<>();

        stupidMap.put(null, "val");
        stupidMap.put(null, null);

        System.out.println("Stupid map: " + stupidMap.get(null));


        //get item
        String first = states.get(2);
        System.out.println(first);
        //get Keys
        Set<Integer> keys = states.keySet();
        //get Values
        Collection<String> values = states.values();
        //Update item
        states.replace(1, "Poland");
        states.put(1, "Poland");
        //Remove item by key
        String removedValue = states.remove(2);
        System.out.println("Removed by KEY value: " + removedValue);

        Set<Integer> keysToRemove = new HashSet<>();
        Set<Map.Entry<Integer, String>> entries = states.entrySet();
        for(Map.Entry<Integer, String> item : states.entrySet()){
            if(item.getValue().equals("France") || item.getValue().equals("Poland")) {
                System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
                keysToRemove.add(item.getKey());
            }
        }
        System.out.println("keysToRemove" + keysToRemove);
        System.out.println("Map before we removed all items with value 'Spain'\n\t" + states);
        keysToRemove.forEach(states::remove);
        System.out.println("Map after we removed all items with value 'Spain'\n\t" + states);

        Map<String, Person> people = new HashMap<>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for(Map.Entry<String, Person> item : people.entrySet()){
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }

        states.forEach((myAwesomeFirstItem, myAwesomeSecondItem) -> {
            System.out.println(myAwesomeFirstItem);
            System.out.println(myAwesomeSecondItem);
        });
    }

    class Person{

        private String name;
        public Person(String value){

            name=value;
        }
        String getName(){return name;}
    }
}
