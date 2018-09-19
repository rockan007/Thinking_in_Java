package chapter_3;

import java.util.Random;

import static utils.Print.print;

public class MathOps {
    public static void main(String[] args){
        //Create a seeded random number generator
        Random random=new Random(47);
        int i,j,k;
        //Choose value from 1 to 100
        j=random.nextInt(100)+1;
        print("j:"+j);
        k=random.nextInt(100)+1;
        print(("k:"+k));
        i=j+k;
        print("j+k : "+i);
        i=j-k;
        print("j-k :" +i);
        i=j/k;
        print("j/k:"+i);
        i=j*k;
        print("j*k:"+i);
        i=j%k;
        print("j%k:"+i);
        j%=k;
        print("j%=k:"+j);
        float u,v,w;
        v=random.nextFloat();
        print("v:"+v);
        w=random.nextFloat();
        print("w:"+w);
        u=v+w;
        print("v+w:"+u);
        u=v-w;
        print("v-w:"+u);
        u=v*w;
        print("v*w"+u);
        u=v/w;
        print("v/w"+u);
        u+=v;
        print("u+=v:"+u);
        u-=v;
        print("u-=v:"+u);
        u*=v;
        print("u*=v:"+u);
        u/=v;
        print("u/=v:"+u);
    }
}
