package lv.rvt;

public class Stars {
    public static void printStars(int number) {
        for (int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++){
            System.out.print(" ");
        }
    }
    public static void printTraingle(int size) {
        int spaces = size - 1;
        for (int i = 1; i <= size; i++) {
            printSpaces(spaces);
            printStars(i);
            spaces--;
        }            
    }
    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }
        for (int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}
