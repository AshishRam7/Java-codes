import java.util.Scanner;
import java.io.*;

class Menu{
    String name;

    Menu(String s){
        name=s;
    }
}

class nveg extends Menu{
    int count;
    nveg(String n,int n1){
       super(n);
       count=n1;
    }
    
}

class Fish extends nveg{
    //int count;
    Fish(String n,int n2){
       super(n,n2);
    }
    

}

class chicken extends nveg{
     //int count;
    chicken(String b,int m){
         //count =m;
         super(b,m);
     }
    
}

class veg extends Menu{
    int count;
     veg(String n,int n1){
        super(n);
        count=n1;
        
     }
}

class Order<T extends Menu>{
    T var1;

    Order(T v){
       var1=v;
    }

    T get(){
        return var1;
    }
}
public class practicePAT {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       Order<Fish> x=new Order(new Fish(sc.next(),sc.nextInt()));
       Order<chicken> y=new Order(new chicken(sc.next(),sc.nextInt()));
       System.out.println(x.get().name);
       System.out.println(x.get().count);
       System.out.println(y.get().name);
       System.out.println(y.get().count);

    }
}
