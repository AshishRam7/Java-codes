import java.util.Scanner;
class account{
    int accnum;
    String name;
    double balance;

    void credit(int credit){
       balance+=credit;
       System.out.println("Your current balance is:"+balance);
       System.out.println();
    }

    void debit(int debit){
        balance-=debit;
        System.out.println("Your current balance is:"+balance);
        System.out.println();
    }
    void disp(){
        System.out.println("Your current balance is:"+balance);
    }
}
public class bank{
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       account o=new account();
       String Name=sc.next();
       o.name=Name;
       for(;;){
       System.out.println("Enter - 1.Credit 2.Debit 3.exit transaction"); 
       int m=sc.nextInt();
       if(m==3){
           break;
           
       }

       System.out.println("Enter the amount you want to credit/debit:");
       int n=sc.nextInt();
       
       if(m==1){
           o.credit(n);
       }
       else if(m==2){
           o.debit(n);
       }
      
    }
    }
}