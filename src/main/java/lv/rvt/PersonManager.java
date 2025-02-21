package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
            String name = parts[0];
            String address = parts[2];
            int age = Integer.parseInt(parts[1]);
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
}
