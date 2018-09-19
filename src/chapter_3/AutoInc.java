package chapter_3;

import static utils.Print.print;

public class AutoInc {
    public static void main(String[] args){
        int i=1;
        print("i:"+i);
        print("++i"+ ++i);
        print("i++:"+ i++);
        print("i:"+i);
        print("--i:"+ --i);
        print("i--:"+i--);
        print("i:"+i);
    }
}
