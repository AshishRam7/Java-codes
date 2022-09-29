import java.util.Scanner;

public class number3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String len=Integer.toString(n);
        int mul=1;
        for(int i=1;i<len.length()+1;i++){
           n=n+(mul*3);
           mul*=10;
        }

        System.out.println(n);

    }
}
