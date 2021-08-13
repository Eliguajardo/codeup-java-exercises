package grades;

import org.w3c.dom.ls.LSOutput;
import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student studentJaden = new Student("Jaden");
        studentJaden.addGrade(80);
        studentJaden.addGrade(70);
        studentJaden.addGrade(85);

        Student studentJewels = new Student("Jewels");
        studentJewels.addGrade(72);
        studentJewels.addGrade(94);
        studentJewels.addGrade(87);

        Student studentMax = new Student("Max");
        studentMax.addGrade(90);
        studentMax.addGrade(94);
        studentMax.addGrade(89);

        Student studentVanessa = new Student("Vanessa");
        studentVanessa.addGrade(84);
        studentVanessa.addGrade(85);
        studentVanessa.addGrade(83);

        students.put("ne-jaden", studentJaden);
        students.putIfAbsent("ne-jewels", studentJewels);
        students.putIfAbsent("ne-max", studentMax);
        students.putIfAbsent("ne-vanessa", studentVanessa);

        cmdLineInterface(students);
    }

    public static void cmdLineInterface(HashMap<String, Student> students) {

        Input input = new Input();

        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students: ");

        do {

            for (String key : students.keySet()) {
                System.out.printf("|" + key + "| ");
            }

            System.out.println("\n" + "\nWhat student would like to see more information on? " );

            String userResponse = input.getString();

            if (students.containsKey(userResponse)) {

                Student currentStudent = students.get(userResponse);

                System.out.println("Name: " + currentStudent.getName() + " - " + "Github Username: " + userResponse);
                System.out.println("Current Average: " + currentStudent.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userResponse + ".");
            }

            System.out.println("\nWould you like to see another student?");
        } while (input.yesNo());
        System.out.println("Goodbye, and have a wonderful day!");
    }
}