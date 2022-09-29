import java.util.Scanner;
class player{
    String pid,name,country;
    
    player(String p,String n,String c){
        pid=p;
        name=n;
        country=c;
    }
    String disp(){
       return (pid+" "+name+" "+country+" ");
    }


}
class cricketplayer extends player{
    int runs;

    cricketplayer(String id,String Name,String Country,int run){
        super(id,Name,Country);
        runs=run;
    }
   
    void runscore(){
        System.out.print(disp());
        if(runs>=1 && runs<=10){
            System.out.print("eligible later");
        }
        else if(runs>10){
            System.out.print("eligible");
        }
        else{
            System.out.print("not eligible");
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String plyid=sc.next();
        String name=sc.next();
        String country=sc.next();
        int runs=sc.nextInt();

        cricketplayer o1=new cricketplayer(plyid,name,country,runs);
        

        o1.runscore();
    }
}
