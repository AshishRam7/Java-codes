import java.util.Scanner;
public class dowhile {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        char ans='y';
        do{
        String name=sc.next();
        System.out.println("Hi "+name);
        System.out.println("Do you want to continue?");
        char answer=sc.next().charAt(0);
        if(answer!='y'){
            ans='n';
        }
        }while(ans=='y');

    }
}
