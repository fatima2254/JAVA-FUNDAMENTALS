package homework;

import com.beust.ah.A;

import java.util.*;

//create class of student
public class CollectionHomeWorkNo2 {

    public static class Student {

        String name;
        int grade;
        int age;
        String sport;
        String team;
        String hobby;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getGrade() {
            return grade;
        }

        public void setGrade(Integer grade) {
            this.grade = grade;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getSport() {
            return sport;
        }

        public void setSport(String sport) {
            this.sport = sport;
        }

        public String getTeam() {
            return team;
        }

        public void setTeam(String team) {
            this.team = team;
        }

        public String getHobby() {
            return hobby;
        }

        public void setHobby(String hobby) {
            this.hobby = hobby;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", grade=" + grade +
                    ", age=" + age +
                    ", sport='" + sport + '\'' +
                    ", team='" + team + '\'' +
                    ", hobby='" + hobby + '\'' +
                    '}';
        }

        public static void main(String[] args) {

            // Create 20 Student objects
            List<Student> students = new ArrayList<>();
            Student student1 = new Student();
            student1.setName("Rockstar1a");
            student1.setGrade(10);
            student1.setAge(27);
            student1.setSport("Soccer");
            student1.setTeam("Ice Bulls");
            student1.setHobby("Guitar");
            students.add(student1);

            Student student2 = new Student();
            student2.setName("john");
            student2.setGrade(10);
            student2.setAge(27);
            student2.setSport("Hockey");
            student2.setTeam("Tiger");
            student2.setHobby("Video Games");
            students.add(student2);

            Student student3 = new Student();
            student3.setName("Rockstar3a");
            student3.setGrade(10);
            student3.setAge(27);
            student3.setSport("Tennis");
            student3.setTeam("Angry Dog");
            student3.setHobby("Books");
            students.add(student3);

            Student student4 = new Student();
            student4.setName("Rockstar4a");
            student4.setGrade(10);
            student4.setAge(27);
            student4.setSport("Baseball");
            student4.setTeam("Angry Dog");
            student4.setHobby("Guitar");
            students.add(student4);

            Student student5 = new Student();
            student5.setName("Rockstar5a");
            student5.setGrade(10);
            student5.setAge(27);
            student5.setSport("Baseball");
            student5.setTeam("Angry Dog");
            student5.setHobby("Guitar");
            students.add(student5);

            Student student6 = new Student();
            student6.setName("Rockstar6a");
            student6.setGrade(10);
            student6.setAge(27);
            student6.setSport("Baseball");
            student6.setTeam("Angry Dog");
            student6.setHobby("Guitar");
            students.add(student6);

            Student student7 = new Student();
            student7.setName("Rockstar7a");
            student7.setGrade(10);
            student7.setAge(27);
            student7.setSport("Baseball");
            student7.setTeam("Angry Dog");
            student7.setHobby("Guitar");
            students.add(student7);

            List<Student> newStudents = new ArrayList<>();

            Student newStudent1 = new Student();
            newStudent1.setName("Rockstar1");
            newStudent1.setGrade(10);
            newStudent1.setAge(27);
            newStudent1.setSport("Soccer");
            newStudent1.setTeam("Ice Bulls");
            newStudent1.setHobby("Cooking");
            newStudents.add(newStudent1);

            Student newStudent2 = new Student();
            newStudent2.setName("john");
            newStudent2.setGrade(100);
            newStudent2.setAge(277);
            newStudent2.setSport("Hockey");
            newStudent2.setTeam("Tiger");
            newStudent2.setHobby("Cooking");
            newStudents.add(newStudent2);

            Student newStudent3 = new Student();
            newStudent3.setName("john");
            newStudent3.setGrade(10);
            newStudent3.setAge(27);
            newStudent3.setSport("Tennis");
            newStudent3.setTeam("Angry Dog");
            newStudent3.setHobby("Cooking");
            newStudents.add(newStudent3);

            Student newStudent4 = new Student();
            newStudent4.setName("Rockstar4");
            newStudent4.setGrade(10);
            newStudent4.setAge(27);
            newStudent4.setSport("Baseball");
            newStudent4.setTeam("Angry Dog");
            newStudent4.setHobby("Cooking");
            newStudents.add(newStudent4);

            Student newStudent5 = new Student();
            newStudent5.setName("Rockstar5");
            newStudent5.setGrade(10);
            newStudent5.setAge(27);
            newStudent5.setSport("Baseball");
            newStudent5.setTeam("Angry Dog");
            newStudent5.setHobby("Cooking");
            newStudents.add(newStudent5);


            //removeStudents(students);
            replaceOldStudentList(students,newStudents);
            //addNewListToOldList(students, newStudents);
        }

        // Remove from the collection all students who's hobby is `Video games`
        public static void removeStudents(List<Student> currentStudents) {
            List<Student> newLeftStudentList = new ArrayList<>();
            for (Student studentList : currentStudents) {
                if (!studentList.getHobby().equals("Video Games")) {
                    newLeftStudentList.add(studentList);
                }

            }
//            for (Student student : newLeftStudentList) {
//
//                System.out.println(student.toString());
//            }
//            System.out.println("-----------------");
//            for (Student student : currentStudents) {
//
//                System.out.println(student.toString());
//            }


        }

        //Replace students from list <oldStudents> with students from list <newStudents> if their names are the same
        public static void replaceOldStudentList(List<Student> students, List<Student> newStudents) {
            Set<String> managedNames = new HashSet<>();
//            for (int i = 0; i < newStudents.size(); i++) {
//                Student student = newStudents.get(i);
//                boolean managed = false;
//                for (Student oldStudent : students) {
//                    if (student.getName().equals(oldStudent.getName()) && !managedNames.contains(student.name)) {
//                        students.set(i, student);
//                        managed = true;
//                        managedNames.add(student.name);
//                        break;
//                    }
//                }
//                if(!managed) {
//                    students.add(student);
//                }
//            }

            List<Student> newList = new ArrayList<>();
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                for (Student newStudent : newStudents) {
                    if (student.getName().equals(newStudent.getName())) {
                        students.set(i, newStudent);
                        newList.add(newStudent);
                        break;
                    }
                }
            }
            System.out.println(newList.size()); //expect 1
            newStudents.removeAll(newList);
            System.out.println(newStudents.size()); //expect 4
            students.addAll(newStudents);
            System.out.println(students.size()); //expect 11


//            for (Student student : students) {
//                System.out.println(student.toString());
//            }

        }

        //Add all not added previously students from <newStudents> into <oldStudents>
        public static void addNewListToOldList(List<Student> students, List<Student> newStudents) {
            replaceOldStudentList(students,newStudents);
            students.addAll(newStudents);
            for (Student student : students) {
                System.out.println(student.toString());
            }
        }
    }
}
