package org.example;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class FirstTest {

    public static class Students {

        String name;
        String college;
        int rollNo;

    public  Students(String name, String college, int rollNo){
            this.name = name;
            this.college = college;
            this.rollNo = rollNo;
        }

        public String toString() {
            return "Name:" + name + " College:" + college + " Roll No:" + rollNo;
        }

        public static void main(String[] args) {
//        Students[] students = {
//                new Students("Taskeen","NUST",12345),
//                new Students("Bakar","FAST",11111),
//        };

//            Students student1 = new Students("Fatima", "NUST", 12345);
//            Students student2 = new Students("Bakar", "FAST", 22222);
//            Students student3 = new Students("Wadood", "KIPS", 54321);

            //Practice List

            //1. Create list of students
            List<Students> studentsList = new ArrayList<>();
            //2. Add Students in list using constructor
            studentsList.add(new Students("Taskeen","NUST",123));
            studentsList.add(new Students("Bakar","NUST",123));
            studentsList.set(1,new Students("Wadood","NUST",22222));
            //3. Print the students with for-each loop
            for (Students student: studentsList) {
                System.out.println("Student Name "+ student.name);
                System.out.println("Student College "+ student.college);
                System.out.println("Student Roll# "+student.rollNo);
            }
           studentsList.removeIf(
                   students -> students.name.equals("Taskeen"));
            System.out.println("Students after removing");
            System.out.println("------------------------");
//            for (Students student: studentsList) {
//                System.out.println("Student Name "+ student.name);
//                System.out.println("Student College "+ student.college);
//                System.out.println("Student Roll# "+student.rollNo);
//            }
            for(int i=0; i<studentsList.size(); i++){
                //Students sudent = studentsList.get(i);
                for(Students ss: studentsList){
                    System.out.println(ss);
                }
            }
        }
    }
}