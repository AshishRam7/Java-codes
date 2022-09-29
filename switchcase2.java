import java.util.Scanner;

interface int1{
    
    abstract void square();
    
}

class display implements int1{

    int num;

    display(int n){
       num=n;
    }
    
    public void square(){
        System.out.println(num*num);
    }
}
public class switchcase2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        display o1=new display(n);
        o1.square();
        
        


    }
}
