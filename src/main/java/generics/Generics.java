package generics;

import org.testng.annotations.Test;

import java.util.*;

public class Generics {

    @Test
    public void generics() {
        List<String> stringGeneric = new ArrayList<>();
        stringGeneric.add("some string");
//        stringGeneric.add('char');
//        stringGeneric.add(123);
        List<Integer> intGenerics = new ArrayList<>();
        intGenerics.add(123);
        intGenerics.add(Integer.valueOf(123));
//        intGenerics.add(123.4);
        List noGenerics = new ArrayList();

        noGenerics.add("asda");
        noGenerics.add(891);

        System.out.println(noGenerics.get(1) instanceof Integer);

        List<Map<Set<Double>, Boolean>> complexGenerics = new ArrayList<>();
        Map<Set<Double>, Boolean> innerElement = new HashMap<>();
        Set<Double> innerInnerElement = new HashSet<>();
        innerInnerElement.add(123.4);
        innerElement.put(innerInnerElement, false);
        complexGenerics.add(innerElement);
    }

    @Test
    public void genericUseCases() {
        Pair<String, Integer> p1 = new GenericPair<>("Even", 8);
        Pair<String, String>  p2 = new GenericPair<>("hello", "world");

        ClassWithGeneric<String> stringGenericClass = new ClassWithGeneric<>();
        stringGenericClass.set("Valid value");
        System.out.println(stringGenericClass.get());
//        stringGenericClass.set(1);

        ClassWithGeneric<Boolean> booleanClassWithGeneric = new ClassWithGeneric<>();
        booleanClassWithGeneric.set(true);
        System.out.println(booleanClassWithGeneric.get());

        booleanClassWithGeneric.set(Boolean.valueOf("false"));
        System.out.println(booleanClassWithGeneric.get());

        GenericPair<ClassWithGeneric<String>, ClassWithGeneric<Integer>> nestedGenerics = new GenericPair<>(
                new ClassWithGeneric<>("First part"),
                new ClassWithGeneric<>(123));

        System.out.printf("Nested generics:\nvalue of the first class: %s\nvalue of the second class: %s",
                nestedGenerics.getKey().get(), nestedGenerics.getValue().get());
    }
}
