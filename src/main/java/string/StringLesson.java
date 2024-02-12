package string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringLesson {

    @Test
    public void StringBasics() {
        final String string = "My String";
        System.out.println(string);
    }

    @Test
    public void StringConcatenation(){
        String string1 = "Start";
        String string2 = "Finish";
        String space = " ";
        System.out.println("Concat with '+': " + string1 + space + string2);
        System.out.println("Concat with '.concat()': " + string1.concat(space).concat(string2));
        System.out.println("Initial string: " + string1);
        System.out.println("Initial string: " + string1);
        string1.concat(string2);
        System.out.println("String concatenated, but result not assigned: " + string1);
        String full = string1.concat(space).concat(string2);
        System.out.println("String concatenated, and result assigned: " + full);

        String pattern = "%s %s";
        String result = String.format(pattern, string1, string2);
        Assert.assertEquals(result, "Start Finish");
    }

    @Test
    public void stringTrim() {
        String stringWithSpaces = " string ";
        System.out.println(stringWithSpaces + "with spaces");
        System.out.println(stringWithSpaces.trim() + "without spaces");
        //but
        stringWithSpaces.trim();
        System.out.println(stringWithSpaces + "with spaces");

        System.out.println(" something written here ".trim());
    }

    @Test
    public void stringToCase() {
        String string = "AaBbCcDd";

        System.out.println("Lowercase: " + string.toLowerCase());
        System.out.println("Uppercase: " + string.toUpperCase());
        //but
        string.toLowerCase();
        System.out.println(string);
        string.toUpperCase();
        System.out.println(string);
    }

    //todo make Strings: 1. "capitalize me" 2. "CAPITALIZE ME" capitalized
    @Test
    public void testCase() {
        String initial1 = "capitalize me";

        String result = capitalize(initial1);
        Assert.assertEquals(result, "Capitalize me");

        String initial2 = "CAPITALIZE ME";
        String result2 = capitalize(initial2);
        Assert.assertEquals(result2, "Capitalize me");

        String initial3 = " driver";
        String result3 = capitalize(initial3);
        Assert.assertEquals(result3, "Driver");
    }

    //Implement this function
    private String capitalize(String toCapitalize) {
        toCapitalize = toCapitalize.trim();
        String firstLetter = toCapitalize.substring(0, 1).toUpperCase();
        String otherPart = toCapitalize.substring(1).toLowerCase();
        return firstLetter + otherPart;
    }

    @Test
    public void stringReplace() {
        String stringToReplace = "My string to replace something";
        char replacement = '$';

        System.out.println(stringToReplace.replace('s', replacement));

        System.out.println(stringToReplace.replace("replace", "REPLACE").replace("My", "YOUR"));
        String stringWithDuplicates = "String replace1 replace20 replace3";
        System.out.println(stringWithDuplicates.replaceAll("\\w{7}\\d", "!"));
    }

    @Test
    public void subString() {
        String stringToCut = "Not Important String";
        System.out.println(stringToCut.substring(3).trim());
        System.out.println(stringToCut.substring(3, 12));
    }

    @Test
    public void stringCharAt() {
        String stringToGetChar = "String with chars";
        System.out.println("|" + stringToGetChar.charAt(6) + "|");
    }
}
