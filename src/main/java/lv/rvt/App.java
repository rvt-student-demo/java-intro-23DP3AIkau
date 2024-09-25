package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Scanner scanner = new Scanner(System.in);

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
        

        //Simple calculator
        // System.out.println("Give the first number:");
        // int firstn = Integer.valueOf(scanner.nextLine());
        // System.out.println("Give the second number:");
        // int second = Integer.valueOf(scanner.nextLine());
        // System.out.println(firstn + " + " + second + " = " + (firstn+second));
        // System.out.println(firstn + " - " + second + " = " + (firstn-second));
        // System.out.println(firstn + " * " + second + " = " + (firstn*second));
        // System.out.println(firstn + " / " + second + " = " + ((double)firstn/second));
        // System.out.println(firstn + " un " + second + " Vidējais skaitlis = " + ((double)firstn+second)/2); //videjais


        //Speed ticket
        // System.out.println("Give speed:");
        // int speed = Integer.valueOf(scanner.nextLine());
        // if (speed > 120) {
        //     System.out.println("Speeding ticket!");
        // }



        // Grades and Points
        // System.out.println("Give points [0-100]");
        // int grade = Integer.valueOf(scanner.nextLine());
        // if (grade < 0) {
        //     System.out.println("Grade: impossible");
        // } else if (grade <= 49) {
        //     System.out.println("Grade: failed");
        // } else if (grade <= 59) {
        //     System.out.println("Grade: 1");
        // } else if (grade <= 69) {
        //     System.out.println("Grade: 2");
        // } else if (grade <= 79) {
        //     System.out.println("Grade: 3");
        // } else if (grade <= 89) {
        //     System.out.println("Grade: 4");
        // } else if (grade <= 100) {
        //     System.out.println("Grade: 5");
        // } else if (grade > 100) {
        //     System.out.println("Grade: incredible!");
        // }




        //Gift Tax
        Scanner scanner = new Scanner(System.in);
        int money = Integer.valueOf(scanner.nextLine());
        if (money < 5000) {
            System.out.println("No tax!");
        } 
        else if (money >= 5000 && money <= 25000) {
            System.out.println("Tax " + (100+(money-5000)*0.08));
        }
        else if (money > 25000 && money <= 55000) {
            System.out.println("Tax " + (1700+(money-25000)*0.1));
        }
        else if (money > 55000 && money <= 200000) {
            System.out.println("Tax " + (4700+(money-55000)*0.12));
        }
        else if (money > 200000 && money <= 1000000) {
            System.out.println("Tax " + (22100+(money-200000)*0.15));
        }
        else {
            System.out.println("Tax " + (142100+(money-1000000)*0.17));
        }
    }

}
