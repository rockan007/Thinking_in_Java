//5.4.1在构造其中调用构造器
package chapter_5;

import utils.Print;

public class Flower {
    int petalCount=0;
    String s="initial value";
    Flower(int petals){
        petalCount=petals;
        Print.print("Constructor w/ int arg only,petalCount="+this.petalCount);
    }
    Flower(String ss){
        Print.print("Constructor w/ String arg only,s="+ss);
        s=ss;
    }
    Flower(String s,int petals){
        this(petals);
//        this(s);//必须第一个？所以只能一个？
        this.s=s;
        Print.print("String & int args");
    }
    Flower(){
        this("hi",47);
        Print.print("Default constructor (no args)");
    }
    void printPetalCount(){
//        this(11);方法里不能用
        Print.print("petal count="+this.petalCount+" s="+s);
    }
    public static void main(String[] args){
        Flower f=new Flower();
        f.printPetalCount();
    }
}
