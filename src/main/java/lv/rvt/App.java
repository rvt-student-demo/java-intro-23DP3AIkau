package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?"); 
        int number = Integer.valueOf(scanner.nextLine());

        int skaitlis = 0;

        for (int i = 1; i <= number; i++ ) {
            skaitlis += i;
        }

        System.out.println("The sum is " + skaitlis);

                

    }

}
