import java.util.Scanner;
import java.io.*;

class auth{
    String str;

    auth(int n){
        if(n>=18){
            str="Eligible";
        }
        else{
            str="Not Eligible";
        }
    }
}

class ageck extends auth{
    String gender;

    ageck(String s,int m){
        super(m);
        gender=s;

    }


}


class check<T extends auth>{
    T vote;

    check(T v){
       vote=v;
    }

    T get(){
        return vote;
    }
}

public class practice2PAT {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        check<ageck> o1=new check<>(new ageck(sc.next(),sc.nextInt()));
        System.out.println(o1.get().gender);
        //System.out.println(o1.get().Str);
    }
}
