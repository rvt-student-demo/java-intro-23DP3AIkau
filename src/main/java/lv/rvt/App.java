package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        int karta = 0;
        int summ = 0;
        while (true) {
            System.out.println("Give number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            summ += number;
            karta += 1;
            
        }
        System.out.println("Number of the numbers: " + karta);
        System.out.println("Sum of the numbers: " + summ);


                

    }

}
