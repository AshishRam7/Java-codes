import java.util.Scanner;

class reverse{
    int marks;
    
        reverse(int n){
        marks=n;
    }

    int display(int marks){
        int rev=0;
        while(marks!=0){
            
            rev=rev+marks;
            marks=marks/10;
        }
        return rev;
        
    }
}
public class objcon {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            int n=sc.nextInt();
            reverse o1=new reverse(n);
            
            a[i]=o1.display(n);
        }

        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }

        
    }
}
