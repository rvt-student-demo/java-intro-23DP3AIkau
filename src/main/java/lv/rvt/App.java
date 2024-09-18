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
        



        System.out.println("Give the first number:");
        int firstn = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println(firstn + " + " + second + " = " + (firstn+second));
        System.out.println(firstn + " - " + second + " = " + (firstn-second));
        System.out.println(firstn + " * " + second + " = " + (firstn*second));
        System.out.println(firstn + " / " + second + " = " + ((double)firstn/second));
        System.out.println(firstn + " un " + second + " Vidējais skaitlis = " + ((double)firstn+second)/2); //videjais


    }

}
