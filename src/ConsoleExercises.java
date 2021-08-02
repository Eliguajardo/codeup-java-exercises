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

        String Vatos = "Vatos";
        String Locos = "Locos";
        String forever = "Forever";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        Vatos = scanner.next();
        Locos = scanner.next();
        forever = scanner.next();
        System.out.println("You entered: --> \"" + Vatos + Locos + forever + "\" <---");
    }
}
