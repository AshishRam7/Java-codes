import java.util.Scanner;
import java.util.Arrays;
public class backtracking {

    public static void printer(String s, String perm,int indx){
        if(s.length()==0){
           System.out.println(perm);
        }
        char arr1[]=new char[s.length()];
        /*for(int i=0;i<s.length();i++){
            //System.out.println(s.charAt(i));
           arr1[i]=s.charAt(i);
        }*/
        //System.out.println(Arrays.toString(arr1));

        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            String appendedstr=s.substring(0,i)+s.substring(i+1);
            printer(appendedstr,perm+current,indx+1);
        }
    }
    public static void main(String args[]){
        String str="ABCD";
        printer(str,"",0);
    }
}
