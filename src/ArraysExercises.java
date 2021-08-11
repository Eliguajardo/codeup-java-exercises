//import java.util.Arrays;
//
//public class ArraysExercises {
//
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//
////    Create an array that holds 3 Person objects.
////    Assign a new instance of the Person class to each element.
////    Iterate through the array and print out the name of each person in the array.
////        Person person1 = new Person("Elias");
////        Person person2 = new Person("Jaden");
////        Person person3 = new Person("Jewels");
////
////        Person[] people = {person1, person2, person3};
////        // for each currentPerson of data type Person in the people array
////        for (Person currentPerson : people) ;
////        System.out.println(currentPerson.getName());
////
////
////
////
////    }
////
////
////}
////public static Person[] (Person person){
////
////
////
////        }
//
//
//        Person[] people = new Person[3];
//
//        people[0] = new Person("eli");
//        people[1] = new Person("eli");
//        people[2] = new Person("eli");
//
//        for (int i = 0; i < people.length; i++) ;
//        System.out.println(people[i].getName);
//
//
//
//
//
//    }
//},
//
//public static Person[] addPerson(Person[] people, Person personToAdd) {
//    Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);
//    newPeopleArray[newPeopleArray.length - 1] = personToAdd;
//
//    return newPeopleArray;
//
//
//}
//}
import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("ozzy");
        people[1] = new Person("eli");
        people[2] = new Person("oscar");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());

        }
        people = addPerson(people, new Person("Mark"));
        System.out.println("with added person");
        for (Person person : people) {
            System.out.println(person.getName());
        }


        }




    public static Person[] addPerson (Person[]people, Person personToAdd){
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);

        newPeopleArray[newPeopleArray.length - 1] = personToAdd;
        return newPeopleArray;

}
}
