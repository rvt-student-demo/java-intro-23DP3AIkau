package lv.rvt;

import java.lang.reflect.Array;
import java.util.*;


public class App{

    public static void main(String[] args) {
        Product name = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(name);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}