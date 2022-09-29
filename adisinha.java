import java.util.*;
class bike{
    int gear;
    int mileage;
    int maxspeeds;

    void gears(){
        System.out.println("Number of gears:"+this.gear);
    } 

    void maxspeed(){
        System.out.println("Maximum speed:"+this.maxspeeds);
    }

    void mileage(){
        System.out.println("Mileage:"+this.mileage);
    }
    
    
}


public class adisinha {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       if(s.equals("RoyalEnfield")){
           bike RE=new bike();
           RE.gears();
           RE.maxspeed();
           RE.mileage();

       }
    }
}
