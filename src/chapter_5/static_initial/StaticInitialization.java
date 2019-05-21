package chapter_5.static_initial;

import utils.Print;

public class StaticInitialization {
    public static void main(String[] args){
        Print.print("Creating new Cupboard in main");
        new Cupboard();
        Print.print("Creating new CupBoard in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table=new Table();
    static Cupboard cupboard=new Cupboard();
}
