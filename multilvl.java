import java.util.Scanner;
class A{
    int a;

    A(int x){
      a=x;
    }

    void displayA(){
        System.out.println(a+"-parent class; ");
    }
}

class B extends A{
    int b;

    B(int x,int y){
        super(x);
        b=y;
        
    }

    void displayB(){
        System.out.println(b+"-daughter class-1; ");
    }
}

class C extends B{
    int c;

    C(int x,int y,int z){
        super(x,y);
    }

    void displayC(){
        System.out.println(c+"-daughter class-2 ");
    }
}

public class multilvl {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();

       C o1=new C(a,b,c);
       o1.displayA();
       o1.displayB();
       o1.displayC();

    }
}
