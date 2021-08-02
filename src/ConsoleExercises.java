import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.println("Pi is equal to " + pi);
//        System.out.println("double : " + String.format("%.2f", pi));

//        Scanner scanner = new Scanner(System.in);// this allows scanner class to work with input
//
////        System.out.print("Enter something: ");
////        String userInput = scanner.next();
////
////        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        System.out.println("Enter interger");// request input
//
//        int userInput = scanner.nextInt();// stores input can bve float double ect
//
//        System.out.println(userInput); // output of what entered or calculate

//        String Vatos = "Vatos";
//        String Locos = "Locos";
//        String forever = "Forever";
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        Vatos = scanner.next();
//        Locos = scanner.next();
//        forever = scanner.next();
//        System.out.println("You entered: --> \"" + Vatos + Locos + forever + "\" <---");
//

//        String Sentence;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        Sentence = scanner.nextLine();
//        System.out.println("You entered: ---> \"" + Sentence + "\" <--");
//
//        int width;
//        int length;
//        int area;
//        int perimeter;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter width: ");
//        System.out.print("Enter length: ");
//        int width = scanner.nextLine();
//        length = scanner.nextLine();
//        int area = width * length;
//        int perimeter = (width * width) + (length * length);
//
//        System.out.println("You entered: --> \"" + width + length + "\" <--");
//        System.out.println("This is the area: --> \"" + area + "\" <-- ");
//        System.out.println("This is the area: --> \"" + perimeter + "\" <-- ");

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the length  of the Codeup Classrom:");

        String userInput = scanner.nextLine();
        double UserNumbers = Integer.parseInt(userInput);
        System.out.println("You entered Length: -->\" " +UserNumbers + "\" <--");


        System.out.println("Enter the Width of the Classroom");
        String UserInputWidth = scanner.nextLine();
        double  UserWidth = Integer.parseInt(UserInputWidth);
        System.out.println("You entered Width: -->\" " +UserInputWidth + "\" <--");


        double area = UserNumbers * UserWidth;
        double perimiter = area * 2;
        System.out.printf("The area of the classroom is %s \n",area );
        System.out.printf("The perimeter of the classroom is %s \n",perimiter);
        //        System.out.println("You entered Width) \" " +area+ "\" \""+perimiter+"\"");


       System.out.println("What is the height of the Codeup Classroom?:");
        String userInputHeight = scanner.nextLine();
        double UserHeight = Integer.parseInt(userInputHeight);
        System.out.println("You entered Height: -->\" " +userInputHeight + "\" <--");
        double volume = UserNumbers * UserWidth * UserHeight;
        System.out.printf("The volume of the Codeup Classroom is: %s \n",volume);

    }
}
