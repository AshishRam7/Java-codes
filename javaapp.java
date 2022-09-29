import java.util.Scanner;

class covishield{
    static int vial=0;
    static void cs(){
        vial++;
        System.out.println("covishield vial "+vial);
    }
}


public class javaapp {

    static int vial=0; 
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<n+1;i++){
       if(i%5==0 ||i==1){
          covishield.cs();
       }
       else{
           cv();
       }
    }
    }
    static void cv(){
        vial++;
        System.out.println("Covaxin vial "+vial);
    }
}
