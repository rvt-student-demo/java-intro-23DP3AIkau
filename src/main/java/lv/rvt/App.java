package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers: ");

        int sk = 0;
        int karta = 0;
        double avg = 0;
        int odd = 0;
        int even = 0;



        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sk);
                System.out.println("Numbers: " + karta);
                System.out.println("Average: " + avg);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sk += number;
            karta++;
            avg = sk/(double)karta;
        }
        
        
    }

}
