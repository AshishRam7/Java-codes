import java.util.Scanner;

class square{
    public static void power(int m){
        System.out.println(m*m);
    }
}
public class staticfn {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        square.power(n);

    }
}
