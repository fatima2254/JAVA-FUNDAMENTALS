package loops;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class Loops {
    private List<Integer> integerList = new LinkedList<>();

    @BeforeTest
    public void setUp() {
        for (int i = 0; i < 300; i++) {
            integerList.add(i);
        }
    }

    @Test
    public void forLoop() {
        for (int i = 0; i <= integerList.size(); i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= integerList.size() ; i=i+5) {
            System.out.println("Each fifth number: " + i);
            for (int j = i + 1; j < i + 5; j++) {
                System.out.println("    Nested number: " + j);
            }
        }

        for (int a=0, b=0; a-b<=10; a++, b--) {
            System.out.print(a*b + " ");
        }
    }

    @Test
    public void whileLoop() {
        int i = 1;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }
//always false - won't be executed a single time
        while (i < 0) {
            System.out.print(i + " ");
            i++;
        }

        // do-while loop will be executed AT LEAST one time
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 0);

//        Indefinite loop. Strongly prohibited to use
//        while (true) {
//            System.out.print(i + " ");
//            i++;
//        }
    }

    @Test(description = "This loop is used when we need to perform any action over EACH element in array/collection")
    public void forEachLoop() {
        for (Integer myNumber: integerList) {
            System.out.print(myNumber + ", ");
        }

        integerList.forEach(myNumber -> System.out.print(myNumber + ", "));
    }

    @Test(description = "Operator `break` is used to stop the loop")
    public void loopBreak() {
        for (int a=1; a<=10; a++) {
            if(a == 5) {
                break;
            }
            System.out.print(a + " ");
        }
        System.out.print("Finish");
        // it makes sense to call operator `break` only with some condition, otherwise loop will be terminated at very first iteration
//        int a;
//        for (a=25; a>0; a--) {
//            break;
//            System.out.print(a + " ");
//        }
//        System.out.print("a=" + a);


        int s = 100;
        while (true) {
            System.out.print(s + " ");
            s = s / 2;
            if(s == 0) {
                break;
            }
        }
    }


    //Homework:
    // Implement method to printout matrix (2D Array)
    // Implement method to printout reversed(mirrored by diagonal) matrix (2D Array)
    // Implement method to printout matrix, where if the element of this matrix is less or equal to 7 - it should be multiplied by 2 and if it greater or equal to 15 - subtract 3 from it

    public void testPrintMatrix() {
        int[][] matrix = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 } };
        printMatrix(matrix);
    }

    public void printMatrix(int[][] matrix) {
        //Implement logic here
    }
}
