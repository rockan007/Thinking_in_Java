package chapter_7;

class Homer {
    char doh(char c) {
        System.out.println("doh(c)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse {

}

class Bart extends Homer {
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(0);//
        b.doh('a');
        b.doh(1.1f);
        b.doh(new Milhouse());

    }
}
