import java.util.Scanner;
class player{
    String pid,name,country;
    
    player(){

    }
    String disp(){
       return (pid+" "+name+" "+country);
    }


}
class cricketplayer extends player{
    int runs;

    cricketplayer(){

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
public class cricketrun{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String plyid=sc.next();
        String name=sc.next();
        String country=sc.next();
        int runs=sc.nextInt();

        cricketplayer o1=new cricketplayer();
        o1.pid=plyid;
        o1.name=name;
        o1.country=country;
        o1.runs=runs;

        o1.runscore();
    }
}
