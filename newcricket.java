import java.util.*;
class player{
    int pid;
    String name;
    String country;
    
    player(int id,String nam,String c){
        pid=id;
        name=nam;
        country=c;
    }
    
    String disp(){
        return (pid+" "+name+" "+country);
        
    
}

}
class cricketplayer extends player{
    int runs;
    
    cricketplayer(int id,String nm,String c,int run){
        super(id,nm,c);
        runs=run;
    }
    
    void runscore(){
        
        if(runs>=1 && runs<=10){
            System.out.print(disp()+" eligible later");
        }
        if(runs>10){
            System.out.print(disp()+" eligible");
        }
        else{
            System.out.print(disp()+" not eligible");
        }
    }
}



public class newcricket{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int id=sc.nextInt();
        String nm=sc.next();
        String c=sc.next();
        int run=sc.nextInt();
        
        cricketplayer o1=new cricketplayer(id,nm,c,run);
        o1.runscore();
    } 
}