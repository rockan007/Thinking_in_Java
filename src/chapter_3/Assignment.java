package chapter_3;

import static utils.Print.print;

public class Assignment {
    public static void main(String[] args){
        Tank tank1=new Tank();
        Tank tank2=new Tank();
        tank1.level=9;
        tank2.level=47;
        print("1:tank1.level:"+tank1.level+" ,tank2.level:"+tank2.level);
        tank1=tank2;
        print("2:tank1.level:"+tank1.level+" ,tank2.level:"+tank2.level);
        tank1.level=27;
        print("3:tank1.level:"+tank1.level+" ,tank2.level:"+tank2.level);
    }
}
class Tank{
    int level;
}
