package chapter_5.static_initial;

import utils.Print;

public class Cupboard {
    Bowl bowl3=new Bowl(3);
    static Bowl bowl4=new Bowl(4);
    Cupboard(){
        Print.print("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker){
        Print.print("f3("+marker+")");
    }
    static Bowl bowl5=new Bowl(5);
}
