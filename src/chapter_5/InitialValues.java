package chapter_5;

import utils.Print;

public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printInitialValues(){
        Print.print("Data type           initialValues");
        Print.print("boolean             "+t);
        Print.print("char                "+c);
        Print.print("short               "+s);
        Print.print("int                 "+i);
        Print.print("long                "+l);
        Print.print("float               "+f);
        Print.print("double              "+d);
        Print.print("reference           "+reference);
    }
    public static void main(String[] args){
        InitialValues initialValues=new InitialValues();
        initialValues.printInitialValues();
    }
}
