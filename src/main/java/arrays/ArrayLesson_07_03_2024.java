package arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


public class ArrayLesson_07_03_2024 {

    public static String classField = "class field";

    @Test
    public void arrayTest() {
        //Arrays always should have type
//        final String[] arraysOfStrings = {"String1", "String2"};
//        final char[] arrayOfChars1 = {'a', 'b', 'c'};
//        final char[] arrayOfChars2 = "abc".toCharArray();
//        final int[] arrayOfInts = {1, 2, 3, 4, 5};
//        final Integer[] arrayOfIntegers = {1, 2, 3, 4, 5};
//        final boolean[] arrayOfBooleans = {true, false, true, false};
//
//        final Object[] arrayOfObjects = {"streter", Integer.valueOf(1), Double.valueOf(1.1)};


        //Arrays length
        final int[] arrayForLength = {1, 2, 3, 4, 5};
        System.out.println(arrayForLength.length);

        final int[] emptyArray = {};
//        System.out.println(emptyArray.length);

        int element = arrayForLength[1];
//        System.out.println(element);

//        System.out.println(arrayForLength[5]);
//        System.out.println("Array element before update: " + arrayForLength[3]);

        //       arrayForLength[3] = 55;

//        System.out.println("Array element after update: " + arrayForLength[3]);


        //Nested arrays
//        String[][] nestedArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
//        System.out.println("Value of nested array with indexes 0x0: " + nestedArray[0][0]);
//        System.out.println("Value of nested array with indexes 1x1: " + nestedArray[1][1]);
//        System.out.println(Arrays.deepToString(nestedArray));
        String[][][] complexOne = new String[][][]{{{}, {"String"}}, {}};
        System.out.println(complexOne[0][1][0]);

    }

    @Test
    public void loopThroughArrayTest() {
        String[] arrayToLoop = {"John", "Mary", "Alice", "Bob"};
        for (int i = arrayToLoop.length - 1; i >= 0; i--) {
            System.out.println(arrayToLoop[i]);
        }

        for (String name : arrayToLoop) {
            System.out.println(name);
        }
    }

    @Test
    public void testLoopOverNestedArray() {
        String[][] nestedArray = new String[][]{{"John", "Mary", "Alice", "Bob"}, {"Volvo", "BMW", "Ford", "Mazda"}};

        String result1 = nestedArray[0][0] + " " + nestedArray[0][1] + " " + nestedArray[0][2] + " " + nestedArray[0][3] + " " + nestedArray[1][0] + " " + nestedArray[1][1] + " " + nestedArray[1][2] + " " + nestedArray[1][3];
        System.out.println(result1);
        Assert.assertEquals(result1, "John Mary Alice Bob Volvo BMW Ford Mazda");

        String result2 = nestedArray[0][0] + " " + nestedArray[1][0] + " " + nestedArray[0][1] + " " + nestedArray[1][1] + " " + nestedArray[0][2] + " " + nestedArray[1][2] + " " + nestedArray[0][3] + " " + nestedArray[1][3];
        System.out.println(result2);
        Assert.assertEquals(result2, "John Volvo Mary BMW Alice Ford Bob Mazda");

        String result3 = nestedArray[0][0] + " " + nestedArray[1][3] + " " + nestedArray[0][1] + " " + nestedArray[1][2] + " " + nestedArray[0][2] + " " + nestedArray[1][1] + " " + nestedArray[0][3] + " " + nestedArray[1][0];
        System.out.println(result3);
        Assert.assertEquals(result3, "John Mazda Mary Ford Alice BMW Bob Volvo");
    }

    @Test(description = "You need to count words in this string programmatically")
    public void countWords() {
        String stringOfWords = "John Mary Alice Bob Volvo BMW Ford Mazda";
        int count = 0;
        String[] arrayOfWords = stringOfWords.split(" ");
//        arrayOfWords.length
        for (String names : arrayOfWords) {
            // System.out.println(names);
            count = count + 1;
        }
        Assert.assertEquals(count, 8);
        Assert.assertEquals(arrayOfWords.length, 8);
    }

    @Test(description = "You need to count words in this string programmatically")
    public void countWords2() {
        String stringOfWords = "John Mary Alice Bob Volvo BMW Ford Mazda";
        int count = stringOfWords.split(" ").length;
        Assert.assertEquals(count, 8);
    }
    @Test(description = "You need to count words in this string programmatically")
    public void countWords3() {
        String stringOfWords = "John Mary Alice Bob Volvo BMW Ford Mazda";
        int count = 0;
        String[] arrayOfWords = stringOfWords.split(" ");
        for(int i=0; i <= 0;i++ ){
            count = count + 1;
        }
       // int count = stringOfWords.trim( ).length();
        Assert.assertEquals(count, 8);
    }

}