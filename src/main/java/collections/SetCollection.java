package collections;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class SetCollection {

    private Set<String> setCol = new HashSet<>();

    @Test
    private void setTest() {
        setCol.add("asdf");
        List<String> toAdd = new ArrayList<>();
        toAdd.add("ttttt");
        toAdd.add("ccccc");
        toAdd.add("xxxx");
        toAdd.add("zzzz");
        toAdd.add("zzzz");
        toAdd.add("zzzz");
        toAdd.add("zzzz");
        toAdd.add("zzzz");
        setCol.addAll(toAdd);
//        System.out.println(toAdd);
        System.out.println(setCol);

//        setCol.remove("ccccc");
        System.out.println("Set after removing an element: " +  setCol);

        System.out.println("Check if SET collection contains an element: " +  setCol.contains("ttttt"));

        for (String element: setCol) {
            System.out.println(element);
        }

        TestData testData1 = new TestData();
        testData1.setName("Nick");
        testData1.setAge(18);
        testData1.setHobby("Soccer");

        TestData testData2 = new TestData();
        testData2.setName("Nick");
        testData2.setAge(18);
        testData2.setHobby("Soccer");

        TestData testData3 = new TestData();
        testData3.setName("David");
        testData3.setAge(17);
        testData3.setHobby("Baseball");

        Set<TestData> team = new HashSet();
        team.add(testData1);
        team.add(testData3);
        team.add(testData2);

        System.out.println(team);

        TestData davidPlayer = null;

        for (TestData player: team) {
            if(player.getName().equals("David1")) {
//                System.out.println("WE FOUND DAVID");
                davidPlayer = player;
            }
        }

        System.out.println("Element present in collection and we remove it: " + setCol.remove("ttttt"));
        System.out.println("Element IS NOT present in collection and we remove it: " + setCol.remove("ooooo"));

//        System.out.println(davidPlayer);

        setCol.clear();
        System.out.println("Set after calling a clear() function: " +  setCol);

//        Assert.assertEquals(toAdd.size(), setCol.size());
    }
}


class TestData implements Cloneable {

    private String name;
    private int age;
    public String hobby;
    public static String team = "BEST TEAM";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestData{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    @Override
    public TestData clone() {
        try {
            TestData clone = (TestData) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
