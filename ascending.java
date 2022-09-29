import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        boolean ascending=true;
        int temporary=n%10;

        while(n>0){
            n/=10;
            if(temporary<n%10){
                ascending =false;
            }
        }

        if(ascending){
           System.out.println("lucky");
        }
        else{
            System.out.println("Not Lucky");
        }
    }

    
}
