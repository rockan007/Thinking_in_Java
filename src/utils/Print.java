package utils;

import java.util.Date;

public class Print {
    public static void print(double d) {
        System.out.println(d);
    }

    public static void print(float f) {
        System.out.println(f);
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(Date date) {
        System.out.println(date.toString());
    }

    public static void print(boolean b) {
        System.out.println(b);
    }
}
