package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void addGrade(int grade) {this.grades.add(grade);}

    public double getGradeAverage(){

        double sumOfGrades = 0;
//                double amountOfGrades = grades.size();
        for(Integer grade : grades){
            sumOfGrades += grade;
        }return sumOfGrades / grades.size();
    }

    public static void main(String[] args) {
        Student elias = new Student("Elias");
        elias.addGrade(57);
        elias.addGrade(68);
        elias.addGrade(88);
        System.out.println("Elias's grade average is: " + elias.getGradeAverage());

        Student melinda = new Student("Melinda");
        melinda.addGrade(80);
        melinda.addGrade(75);
        melinda.addGrade(85);
        System.out.println("Melinda's grade average is: " + melinda.getGradeAverage());


    }

}