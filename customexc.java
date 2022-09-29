import java.util.Scanner;
public class customexc {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       try{
       int n=sc.nextInt();
       if(n>10){
         throw new newexception("The number is greater than 10");
       }
    }
    catch()
    }
}

class newexception extends Exception{
    String str;
    newexception(String s){
        str=s;
    }
    
    public String toString(){
        return str;
    }
}
