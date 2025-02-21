package lv.rvt;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> personList = PersonManager.getPersonList();

        for (Person person : personList) {
            System.out.println(person);
        }

        System.out.println("Would you like to add a new person? (yes/no)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            Person newPerson = new Person(name, address, age);
            PersonManager.addPerson(newPerson);
            System.out.println("Person added successfully!");
        }

        scanner.close();
    }
}
