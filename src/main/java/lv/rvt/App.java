package lv.rvt;

import java.util.*;


public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            list.add(input);
        }


        System.out.print("From where? ");
        int start = Integer.valueOf(scanner.nextLine());

        if (start >= 0 && start < list.size()){
            System.out.print("To where? ");
            int end = Integer.valueOf(scanner.nextLine());

            if (end >= start && end < list.size()){
                for (int i = start; i <= end; i++){
                    System.out.println(list.get(i));
                }
            } else {
                System.out.println("Nepareiza ievade");
            }
        } else {
            System.out.println("Nepareiza ievade");
        }
    }
}
