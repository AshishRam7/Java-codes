import java.util.*;
public class capsstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char check=' ';
        char c=sc.next().charAt(0);
        int a[]=new int[str.length()];
        for(int i=0;i<str.length();i++){
           a[i]=str.charAt(i);
        }
        
        for(int i=0;i<str.length();i++){
            if(a[i]==c){
               a[i]=a[i]-32;
               check=(char)a[i];
            }
        }
        for(int i=0;i<str.length();i++){
        System.out.print((char)a[i]);
        
        }
        System.out.println();

        for(int i=0;i<str.length();i++){
            if((char)a[i]!=check){
            System.out.print((char)a[i]);
            }
            else{
                System.out.println();
                continue;
            }
        }

    }
    
}
