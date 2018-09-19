package chapter_3;

import static utils.Print.print;

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1:x.c:" + x.c);
        f(x);
        print("2:x.c:" + x.c);
    }
}

class Letter {
    char c;
}
