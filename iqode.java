import java.util.*;
public class iqode {
    public static void main(String[] args){
        int n, p, sum=0, revsum=0,temp;

        System.out.println("Enter the Number");

        Scanner lsk = new Scanner(System.in); 
        n=lsk.nextInt();
    
        p=n;
        while(p!=0)
        {
        sum=sum+(p%10);
        p=p/10;
        }

        temp=sum;

        while (temp != 0){
            revsum = (revsum*10) + (temp%10);
            temp = temp%10;
        }

        if(n==(sum*revsum))
        System.out.println("the given number is a ramanujam number");
        
        else
        System.out.println("the given number is not a ramanujam number");
    
    }
}    