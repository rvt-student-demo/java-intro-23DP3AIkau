package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class PersonManager {

    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");
        ArrayList<Person> personList = new ArrayList<>();
        String line;
        reader.readLine();
        
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length < 3) continue;
            String name = parts[0].trim();
            String address = parts[2].trim();
            int age = Integer.parseInt(parts[1].trim());
            Person person = new Person(name, address, age);
            personList.add(person);
        }
        return personList;
    }

    public static void addPerson(Person person) throws Exception {
        try (BufferedWriter writer = Helper.getWriter("persons.csv", StandardOpenOption.APPEND)) {
            writer.newLine();
            writer.write(person.getName() + "," + person.getAge() + "," + person.getAddress());
        }
    }

    public static void printPersonTable() throws Exception {
        ArrayList<Person> personList = getPersonList();
        System.out.println("----------------------------------------");
        System.out.printf("| %-10s | %-5s | %-15s |%n", "NAME", "AGE", "ADDRESS");
        System.out.println("----------------------------------------");
        for (Person person : personList) {
            System.out.printf("| %-10s | %-5d | %-15s |%n", person.getName(), person.getAge(), person.getAddress());
        }
        System.out.println("----------------------------------------");
    }
}
