package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//create class of student
public class CollectionHomeWorkNo1 {

    public static class Student {

        String name;
        int grade;
        int age;
        String sport;
        String team;
        String hobby;

        public Student() {}

        public Student(String name, int grade, int age, String sport, String team, String hobby) {
            this.name = name;
            this.grade = grade;
            this.age = age;
            this.sport = sport;
            this.team = team;
            this.hobby = hobby;
        }

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

        public static void main(String[] args) {

            // Create 20 Student objects
            List<Student> students = new ArrayList<>();
            Student student1 = new Student();
            student1.setName("Rockstar1");
            student1.setGrade(10);
            student1.setAge(27);
            student1.setSport("Soccer");
            student1.setTeam("Ice Bulls");
            student1.setHobby("Guitar");
            students.add(student1);

            Student student2 = new Student();
            student2.setName("Rockstar2");
            student2.setGrade(10);
            student2.setAge(27);
            student2.setSport("Hockey");
            student2.setTeam("Tiger");
            student2.setHobby("Video Games");
            students.add(student2);

            Student student3 = new Student();
            student3.setName("Rockstar3");
            student3.setGrade(10);
            student3.setAge(27);
            student3.setSport("Tennis");
            student3.setTeam("Angry Dog");
            student3.setHobby("Books");
            students.add(student3);

            Student student4 = new Student();
            student4.setName("Rockstar4");
            student4.setGrade(10);
            student4.setAge(27);
            student4.setSport("Baseball");
            student4.setTeam("Angry Dog");
            student4.setHobby("Guitar");
            students.add(student4);

            Student student5 = new Student();
            student5.setName("Rockstar5");
            student5.setGrade(10);
            student5.setAge(27);
            student5.setSport("Baseball");
            student5.setTeam("Angry Dog");
            student5.setHobby("Guitar");
            students.add(student5);

            Student student6 = new Student();
            student6.setName("Rockstar6");
            student6.setGrade(10);
            student6.setAge(27);
            student6.setSport("Baseball");
            student6.setTeam("Angry Dog");
            student6.setHobby("Guitar");
            students.add(student6);

            Student student7 = new Student();
            student7.setName("Rockstar7");
            student7.setGrade(10);
            student7.setAge(27);
            student7.setSport("Baseball");
            student7.setTeam("Angry Dog");
            student7.setHobby("Guitar");
            students.add(student7);

            Student student8 = new Student();
            student8.setName("Rockstar8");
            student8.setGrade(10);
            student8.setAge(27);
            student8.setSport("Baseball");
            student8.setTeam("Angry Dog");
            student8.setHobby("Guitar");
            students.add(student8);

            Student student9 = new Student();
            student9.setName("Rockstar9");
            student9.setGrade(10);
            student9.setAge(27);
            student9.setSport("Baseball");
            student9.setTeam("Angry Dog");
            student9.setHobby("Guitar");
            students.add(student9);

            Student student10 = new Student();
            student10.setName("Rockstar10");
            student10.setGrade(10);
            student10.setAge(27);
            student10.setSport("Baseball");
            student10.setTeam("Angry Dog");
            student10.setHobby("Guitar");
            students.add(student10);

            Student student11 = new Student();
            student11.setName("Rockstar11");
            student11.setGrade(10);
            student11.setAge(27);
            student11.setSport("Baseball");
            student11.setTeam("Angry Dog");
            student11.setHobby("Guitar");
            students.add(student11);

            Student student12 = new Student();
            student12.setName("Rockstar12");
            student12.setGrade(10);
            student12.setAge(27);
            student12.setSport("Baseball");
            student12.setTeam("Angry Dog");
            student12.setHobby("Guitar");
            students.add(student12);

            Student student13 = new Student();
            student13.setName("Rockstar13");
            student13.setGrade(10);
            student13.setAge(27);
            student13.setSport("Baseball");
            student13.setTeam("Angry Dog");
            student13.setHobby("Guitar");
            students.add(student13);

            Student student14 = new Student();
            student14.setName("Rockstar14");
            student14.setGrade(10);
            student14.setAge(27);
            student14.setSport("Baseball");
            student14.setTeam("Angry Dog");
            student14.setHobby("Guitar");
            students.add(student14);

            Student student15 = new Student();
            student15.setName("Rockstar15");
            student15.setGrade(10);
            student15.setAge(27);
            student15.setSport("Baseball");
            student15.setTeam("Angry Dog");
            student15.setHobby("Guitar");
            students.add(student15);

            Student student16 = new Student();
            student16.setName("Rockstar16");
            student16.setGrade(10);
            student16.setAge(27);
            student16.setSport("Baseball");
            student16.setTeam("Angry Dog");
            student16.setHobby("Guitar");
            students.add(student16);

            Student student17 = new Student();
            student17.setName("Rockstar17");
            student17.setGrade(10);
            student17.setAge(27);
            student17.setSport("Baseball");
            student17.setTeam("Angry Dog");
            student17.setHobby("Guitar");
            students.add(student17);

            Student student18 = new Student();
            student18.setName("Rockstar18");
            student18.setGrade(10);
            student18.setAge(27);
            student18.setSport("Baseball");
            student18.setTeam("Angry Dog");
            student18.setHobby("Guitar");
            students.add(student18);

            Student student19 = new Student();
            student19.setName("Rockstar19");
            student19.setGrade(10);
            student19.setAge(27);
            student19.setSport("Baseball");
            student19.setTeam("Angry Dog");
            student19.setHobby("Guitar");
            students.add(student19);

            Student student20 = new Student();
            student20.setName("Rockstar20");
            student20.setGrade(10);
            student20.setAge(27);
            student20.setSport("Hockey");
            student20.setTeam("Angry Dog");
            student20.setHobby("Guitar");
            students.add(student20);

            students.add(new Student("Rockstar21", 9, 17, "Tennis", "Ice Bulls", "Books"));

            // printAllStudentsInformation(students);
//            printStudentsBySport(students);
             printStudentsByGuitarHobby(students);
        }

        //implement a function that will take a number of Students to
        //generate and will return List of generated Students ****

        // Implement mothod that will take List<Student> currentStudents as input parameter and will print full information about student
        public static void printAllStudentsInformation(List<Student> currentStudents) {
            for (Student studentList : currentStudents) {
                System.out.println(studentList.getName());
                System.out.println(studentList.getGrade());
                System.out.println(studentList.getAge());
                System.out.println(studentList.getSport());
                System.out.println(studentList.getTeam());
                System.out.println(studentList.getHobby());
            }
        }

        //Implement method that will take List<Student> as input parameter and will print team and name of the student for each type of sport
        public static void printStudentsBySport(List<Student> students) {
            Map<String, List<String>> sportTeams = new HashMap<>();
            Map<String, List<Student>> sportTeams1 = new HashMap<>();

            for (Student student : students) {
                if (!sportTeams.containsKey(student.sport)) {
                    sportTeams.put(student.sport, new ArrayList<>());
                }
                sportTeams.get(student.sport).add(student.team + ": " + student.name);
            }

            for (Student student : students) {
                if (!sportTeams1.containsKey(student.sport)) {
                    sportTeams1.put(student.sport, new ArrayList<>());
                }
                sportTeams1.get(student.sport).add(student);
            }

            for (Map.Entry<String, List<String>> entry : sportTeams.entrySet()) {
                System.out.println("Sport: " + entry.getKey());
                for (String studentInfo : entry.getValue()) {
                    System.out.println(studentInfo);
                }
                System.out.println();
            }
        }

        //Implement method that will take List<Student> as input parameter and will print how many student like to play guitar in each team
        public static void printStudentsByGuitarHobby(List<Student> students) {
            Map<String, Integer> studentsPlayingGuitar = new HashMap<>();

            for (Student student : students) {
                if (student.hobby.equals("Guitar")) {
                    studentsPlayingGuitar.put(student.team, studentsPlayingGuitar.getOrDefault(student.team, 0) + 1);
                }
            }

            for (Map.Entry<String, Integer> entry : studentsPlayingGuitar.entrySet()) {
                System.out.println("Team: " + entry.getKey() + ", Guitar Players: " + entry.getValue());
            }
        }
    }
}
