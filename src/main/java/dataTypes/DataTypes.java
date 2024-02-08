package dataTypes;

import java.util.*;

public class DataTypes {

    public static void main(String[] args) {

        int testInt = 123;
        float testFlot = 345f;
        double testDouble = 1.23;
        char testChar = 'a';
        String testString = "abc";
        boolean isTrue = false;

        String pattern = "(%1$s _ bla bla bla bla + _ %2$s)(%2$s _ + _ %2$s)(%3$s _ + _ %2$s)(%1$s _ + _ %3$s)";

        boolean condition = 8 == 3;
        if(8 == 3) {
            System.out.println("It's true");
        } else {
            System.out.println("It's false");
        }
    }
}
