package exercises.arraylist;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMap {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String newStudent;
        Integer newID;

        HashMap<Integer, String> classRoster = new HashMap<>();
        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("ID: ");
                newID = input.nextInt();
                classRoster.put(newID, newStudent);

                //read in the next line before looping back - gotta check for out exit condition!
                input.nextLine();
            }

        } while (!newStudent.equals(""));
        //while newStudent is not empty, keep running this loop

        System.out.println("\nClass Roster: ");
        //for each student inside our entry set for the roster, print out...
        for(Map.Entry<Integer, String> student: classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
    }
}
