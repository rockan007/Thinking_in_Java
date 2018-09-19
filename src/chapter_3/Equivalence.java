package chapter_3;

import static utils.Print.print;

public class Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        print(n1 == n2);
        print(n1 != n2);
    }
}
