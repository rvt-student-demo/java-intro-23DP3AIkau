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

        System.out.print("To where? ");
        int end = Integer.valueOf(scanner.nextLine());

        for (int i = start; i <= end; i++){
            System.out.println(list.get(i));
        }
    }
}
