package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give number:");
        int number = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <= number; i++ ) {
            System.out.println(i);
        }


                

    }

}
