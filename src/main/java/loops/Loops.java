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
        for (int tre = 0; tre < 300; tre++) {
            integerList.add(tre);
        }
    }

    @Test
    public void forLoop() {
//        for (int i = 0; i <= integerList.size(); i=i+1) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; i <= integerList.size() ; i=i+5) {
//            System.out.println("Each fifth number: " + i);
//            for (int j = i + 1; j < i + 5; j++) {
//                System.out.println("    Nested number: " + j);
//            }
//        }

        for (int a=0, b=0; a-b<=10; a++, b--) {
            System.out.print("A = " + a + " ");
            System.out.println("B = " + b);
            System.out.println(a*b + " ");
        }
    }

    @Test
    public void whileLoop() {
        int i = 1;
//        while (i < 5) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println("While loop finished");
//always false - won't be executed a single time
        while (i < 0) {
            System.out.print(i + " ");
            i++;
        }

        // do-while loop will be executed AT LEAST one time
//        do {
//            System.out.print(i + " ");
//            i++;
//        } while (i < 5);

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
//        for (int a=1; a<=10; a++) {
//            if(a == 5) {
//                break;
//            }
//            System.out.print(a + " ");
//        }
//        System.out.print("Finish");
        // it makes sense to call operator `break` only with some condition, otherwise loop will be terminated at very first iteration
//        int a;
//        for (a=25; a>0; a--) {
//            break;
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
       // printMatrix(matrix);
       mirrorMatrix(matrix2);
    }

    public void printMatrix(int[][] matrix) {
        //Implement logic here
        // 3x3 array
        //matrix = new int[4][4];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public void mirrorMatrix(int[][] matrix2) {
        //Implement logic here
        for(int i=matrix2.length-1; i>=0; i--){
            for(int j=matrix2.length-1; j >= 0 ; j--){
                System.out.print(matrix2[j][i] + ","+" ");
            }
            System.out.println();
        }
    }
}
