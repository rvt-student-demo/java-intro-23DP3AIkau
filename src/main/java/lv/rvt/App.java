package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        divibleByThree(2, 10);
    }

    public static void divibleByThree(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
