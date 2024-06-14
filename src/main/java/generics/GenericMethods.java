package generics;

import org.testng.annotations.Test;

import java.util.List;

public class GenericMethods {

    public <T> boolean compareLists(List<T> firstList, List<T> secondList) {
        if(firstList.size() != secondList.size()) {
            return false;
        }
        for (int i = 0; i < firstList.size(); i++) {
            if(firstList.get(i) != secondList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public <T extends Rectangle> boolean compareRectangles(T rectangleOne, T rectangleTwo) {
        return rectangleOne.getX() == rectangleTwo.getX()
                && rectangleOne.getY() == rectangleTwo.getY();
    }

    public <T extends Rectangle> boolean compareRectangleAreas(T rectangleOne, T rectangleTwo) {
        return rectangleOne.getArea() == rectangleTwo.getArea();
    }

    public <T extends Box> boolean compareBoxes(T boxOne, T boxTwo) {
        return boxOne.getX() == boxTwo.getX() && boxOne.getY() == boxTwo.getY() && boxOne.getZ() == boxTwo.getZ();
    }

    public <T extends Box> boolean compareBoxesAreas(T boxOne, T boxTwo) {
        return boxOne.getSurfaceArea() == boxTwo.getSurfaceArea();
    }

    public <T extends Box> boolean compareBoxesVolumes(T boxOne, T boxTwo) {
        return boxOne.getVolume() == boxTwo.getVolume();
    }

    @Test
    public void compareListsCase() {
        List<String> stringList1 = List.of("Red", "Green", "White", "Orange", "Black", "Pink");
        List<String> stringList2 = List.of("Red", "Green", "White", "Orange", "Black", "Pink");
        List<String> stringList3 = List.of("Red", "Orange", "Green", "Black", "White", "Pink");

        System.out.println(compareLists(stringList1, stringList2));
        System.out.println(compareLists(stringList2, stringList3));
        System.out.println(compareLists(stringList1, stringList3));

        List <Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List <Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        System.out.println(compareLists(numbers1, numbers2));
    }

    @Test
    public void rectanglesCase() {
        Rectangle rec1 = new MyRectangle(4.0, 5.0);
        Rectangle rec2 = new MyRectangle(5.0, 4.0);
        Rectangle rec3 = new MyRectangle(10.0, 2.0);
        Rectangle rec4 = new MyRectangle(4.0, 4.0);
        Rectangle rec5 = new MySquare(4.0);
        Rectangle rec6 = new MySquare(2.0);

        System.out.printf("Comparing rectangles %s & %s. Result: %s%n", rec1, rec2, compareRectangles(rec1, rec2));
        System.out.printf("Comparing rectangles %s & %s. Result: %s%n", rec1, rec3, compareRectangles(rec1, rec3));
        System.out.printf("Comparing rectangle areas %s & %s. Result: %s%n", rec1, rec3, compareRectangleAreas(rec1, rec3));
        System.out.printf("Comparing rectangle areas %s & %s. Result: %s%n", rec4, rec5, compareRectangles(rec4, rec5));
        System.out.printf("Comparing rectangles %s & %s. Result: %s%n", rec1, rec2, compareRectangles(rec5, rec6));
    }

    @Test
    public void boxesCase() {
        Box box1 = new MyBox(2.0, 2.0, 5.0);
        Box box2 = new MyBox(1.0, 4.0, 5.0);
        Box box3 = new MyBox(8.0, 0.5, 5.0);

        System.out.printf("Comparing boxes %s & %s. Result: %s%n", box1, box2, compareBoxes(box1, box2));
        System.out.printf("Comparing boxes %s & %s. Result: %s%n", box1, box3, compareBoxes(box1, box3));
        System.out.printf("Comparing boxes areas %s & %s. Result: %s%n", box1, box2, compareBoxesAreas(box1, box2));
        System.out.printf("Comparing boxes areas %s & %s. Result: %s%n", box2, box3, compareBoxesAreas(box3, box2));
        System.out.printf("Comparing boxes areas %s & %s. Result: %s%n", box1, box3, compareBoxesAreas(box3, box1));
        System.out.printf("Comparing boxes volumes %s & %s. Result: %s%n", box1, box3, compareBoxesVolumes(box3, box1));
        System.out.printf("Comparing boxes volumes %s & %s. Result: %s%n", box2, box1, compareBoxesVolumes(box2, box1));
        System.out.printf("Comparing boxes volumes %s & %s. Result: %s%n", box2, box3, compareBoxesVolumes(box3, box2));
    }
}

class MyRectangle implements Rectangle {

    private double x;
    private double y;

    public MyRectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                x + "x" + y + "]";
    }
}

class MySquare implements Rectangle {

    private double x;

    public MySquare(double x) {
        this.x = x;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.x;
    }

    @Override
    public String toString() {
        return "Square[" + x + "x" + x + "]";
    }
}

class MyBox extends Box {

    MyBox(double x, double y, double z) {
        super(x, y, z);
    }
}

