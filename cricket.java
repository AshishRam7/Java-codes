import java.util.Scanner;

class player{
    String pid;
    String name;
    String country;
    int runs;
    
    void display(String pid,String name,String country){
        System.out.print(pid+" "+name+" "+country);
    }
    
    class cricketplayer1 extends player{
    int runs;    
    void runscore(String pid,String name,String country,int runs){
        display(pid,name,country);
        if(runs>=1 && runs<=10){
            System.out.print(" eligible later");
        }
        else if(runs>10){
            System.out.println(" eligible");
        }
        else{
            System.out.println(" not eligible");
        }
    }
    }
}
public class cricket{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String id=sc.next();
        String nm=sc.next();
        String co=sc.next();
        int run=sc.nextInt();
        
        cricketplayer1 o=new cricketplayer1();
        o.pid=id;
        o.name=nm;
        o.country=co;
        o.runs=run;
    }
}
