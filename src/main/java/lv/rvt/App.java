package lv.rvt;

import java.util.*;


public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longest = "";
        double count = 0;
        int sum = 0;

        while (true) {
            String input = String.valueOf(scanner.nextLine());
            if (input.equals("")) {
                break;
            }
            String [] parts = input.split(",");

            count++;
            sum = sum + Integer.valueOf(parts[1]);

            
            if (parts[0].length() > longest.length()){
                longest = parts[0];
            }

            


        }
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + sum/count);

    }
}
