package lv.rvt;

import java.lang.reflect.Array;
import java.util.*;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Books(title, pages, year));
        }

        System.out.println("What information will be printed? ");
        String information = scanner.nextLine();

        for (Books book : books) {
            if (information.equals("everything")) {
                System.out.println(book);
            } else if (information.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}