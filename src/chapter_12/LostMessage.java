package chapter_12;

import static util.Print.print;

class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "A very important Exception";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "A trivial Exception";
    }
}

class ThirdException extends Exception {
    @Override
    public String toString() {
        return "Third Exception";
    }
}

public class LostMessage {
    public static void main(String[] args) {

        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } catch (Exception e) {
                e.printStackTrace(System.out);
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            print(e);
        } finally {

        }
    }

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void third() throws ThirdException {
        throw new ThirdException();
    }
}
