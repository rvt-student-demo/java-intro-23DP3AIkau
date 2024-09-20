package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Ievadi savu vārdu: ");

        //String name = scanner.nextLine();

        //System.out.println("Ievadi savu uzvārdu: ");
        //String lastname = scanner.nextLine();

        //System.out.println("Ievadi savu grupu: ");
        //String group = scanner.nextLine();

        //System.out.println("Students: " + name + " " + lastname + " Grupa: " + group);



        //double doubleValue = Double.valueOf(scanner.nextLine());
        //int value = Integer.valueOf(scanner.nextLine());
        //value = value + 20;
        //System.out.println(value);




        //int a = 3;
        //int b = 2;

        //double c = a / b;
        //System.out.println(c);

        //double d = (double) a / b;
        //System.out.println(d);

        //double e = (double) (a / b);
        //System.out.println(e);
        


        // System.out.println("Give the first number:");
        // int firstn = Integer.valueOf(scanner.nextLine());

        // System.out.println("Give the second number:");
        // int second = Integer.valueOf(scanner.nextLine());

        // System.out.println(firstn + " + " + second + " = " + (firstn+second));
        // System.out.println(firstn + " - " + second + " = " + (firstn-second));
        // System.out.println(firstn + " * " + second + " = " + (firstn*second));
        // System.out.println(firstn + " / " + second + " = " + ((double)firstn/second));
        // System.out.println(firstn + " un " + second + " Vidējais skaitlis = " + ((double)firstn+second)/2); //videjais


        // System.out.println("Give speed:");
        // int speed = Integer.valueOf(scanner.nextLine());


        // if (speed > 120) {
        //     System.out.println("Speeding ticket!");
        // }



        
        System.out.println("Give points [0-100]");
        int grade = Integer.valueOf(scanner.nextLine());
        if (grade < 0) {
            System.out.println("Grade: impossible");
        } else if (grade <= 49) {
            System.out.println("Grade: failed");
        } else if (grade <= 59) {
            System.out.println("Grade: 1");
        } else if (grade <= 69) {
            System.out.println("Grade: 2");
        } else if (grade <= 79) {
            System.out.println("Grade: 3");
        } else if (grade <= 89) {
            System.out.println("Grade: 4");
        } else if (grade <= 100) {
            System.out.println("Grade: 5");
        } else if (grade > 100) {
            System.out.println("Grade: incredible!");
        }
        
        
    }

}
