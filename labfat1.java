import java.util.Scanner;

abstract class account{
    abstract void salary();
}

class employee extends account{
    double salary(int n){
        if(n==100){ 
            return 2*10000;
        }

        else if(n>=75){
            return 10000+((10000*50)/100);
        }

        else{
            return 10000+(10000*10/100);
        }
    }
}
public class labfat1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int e1=sc.nextInt();
        int e2=sc.nextInt();
        int e3=sc.nextInt();

        employee o1=new employee();
        System.out.println(o1.salary(e1));
        System.out.println(o1.salary(e2));
        System.out.println(o1.salary(e3));


    }
}
