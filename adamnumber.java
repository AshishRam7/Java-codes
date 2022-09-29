import java.util.Scanner;

class adam{
    int Num;
    int sqr;
    int revsqr;

    adam(int n){
       Num=n;
       
    }

    static String check(int n){
        int sqr=n*n;
        
        int rev=0;
        int rev2=0;
        int remainder;
        int remainder2;
        while(n>0){
            remainder=n%10;
            rev=(rev*10)+remainder;
            n=n/10;
        }
        
        
        int revsqr=rev*rev;
        while(revsqr>0){
            remainder2=revsqr%10;
            rev2=(rev2*10)+remainder2;
            revsqr=revsqr/10;
        }
       
        if(sqr==(rev2)){
            return "Adam number";
        }

        else{
            return "Not an Adam number";
            
        }
    }
}

public class adamnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number;");
        int num=sc.nextInt();
        adam o1=new adam(num);
        System.out.print(o1.check(num));

    }
    
}
