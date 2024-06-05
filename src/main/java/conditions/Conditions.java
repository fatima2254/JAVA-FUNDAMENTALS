package conditions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Conditions {

    @Test
    public void ifElseCondition() {
//        if(true) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//        redundantCondition();
//        nestedConditions();
//        complexCondition();
        flatIfElseConditions();
    }

    private void redundantCondition() {
        boolean value = false;
        //It never makes sense to compare booleans! The result of comparing two booleans will be boolean as well.

        if(value) {
            System.out.println("It's a waste of resources to compare booleans");
        } else {
            System.out.println("It's a waste of resources to compare booleans");
        }
    }

    private void nestedConditions() {
        int n = 30;

        if (n>=18 && n<27) {
            System.out.println("Number is in [18-27). Not including 27");
        } else {
            if (n>=27 && n<60) {
                System.out.println("Number is in [27-60) range. Including 27, not including 60");
            } else if(n>=0 && n<18) {
                System.out.println("Is above 0 and less then 18");
            } else {
                if (n<0 && n>=100) {
                    System.out.println("Number is less then 0 or more or equal to 100");
                } else {
                    System.out.println("Wrong number specified");
                }
            }
        }
    }

    private void complexCondition() {
        int a = 10;

        if(a > 0 && a < 18 || a > 80 && a <= 100) {
            System.out.printf("Number %s satisfied condition: a > 0 && a < 18 || a > 80 && a <= 100", a);
        }
    }

    private void flatIfElseConditions() {
        // initializing expression
        int i = 22;

        // condition 1
        if (i == 10)
            System.out.println("i is 10\n");
            // condition 2
        else if (i == 15)
            System.out.println("i is 15\n");
            // condition 3
        else if (i == 20)
            System.out.println("i is 20\n");
        else
            System.out.println("i is not present\n");
        System.out.println("Outside if-else-if");
    }

    @Test(dataProvider = "switchOptions")
    public void switchCondition(String name) {
        switch("Dave") {
            case "Dave":
                System.out.println("name is Dave");
                break;
            case "Tomas":
                System.out.println("name is Tomas");
                break;
            case "Jenny":
                System.out.println("name is Jenny");
                break;
            default:
                System.out.println("Not allowed name");
        }

        switch(name) {
            case "Dave":
                System.out.println("name is Dave");
            case "Tomas":
                System.out.println("name is Tomas");
            case "Jenny":
                System.out.println("name is Jenny");
            default:
                System.out.println("Not allowed name");
        }
    }

    @DataProvider
    public Object[][] switchOptions() {
        return new Object[][] {{"Dave"},{"Tony"}};
    }


    // Implement method to printout matrix, where if the element of this matrix is less or equal to 7 - it should be multiplied by 2 and if it greater or equal to 15 - subtract 3 from it

    @Test
    public void testPrintMatrix() {
        int[][] matrix = {
                { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 }
        };
        int[][] matrix2 = {
                { 3, 2, 1, 7, 11, 65, 23 },
                { 9, 11, 5, 4, 66, 10, 9 },
                { 6, 0, 13, 17, 434, 1, 23 },
                { 9, 0, 11, 18, 4, 14, 3 },
                { 6, 7, 35, 57, 48, 21, 20 },
                { 86, 17, 315, 7, 68, 52, 520 },
                { 7, 21, 14, 15, 21, 14, 15 }
        };
        modifiedMirroredMatrix(matrix);
    }

    public void modifiedMirroredMatrix(int[][] matrix) {
        //Implement logic here
    }
}
