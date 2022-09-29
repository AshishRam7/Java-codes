import java.util.Scanner;

class recommend{
    String soil1;
    String soil2;
    String soil3;
    String month;
    int temp_min;
    int temp_max;
    double ph_min;
    double ph_max;
    int rainfall_min;
    int rainfall_max;
    
    recommend(String Soil1,String Soil2,String Soil3,String Month,int Temp_min,int Temp_max,double Ph_min,double Ph_max,int Rainfall_min,int Rainfall_max){
        soil1=Soil1;
        soil2=Soil2;
        soil3=Soil3;
        month=Month;
        temp_max=Temp_max;
        ph_min=Ph_min;
        ph_max=Ph_max;
        rainfall_min=Rainfall_min;
        rainfall_max=Rainfall_max;
        
    }
    void count(){

    }
}

public class crop {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String soil=sc.next();
    String month=sc.next();
    int temp_min=sc.nextInt();
    int temp_max=sc.nextInt();
    int ph_min=sc.nextInt();
    int ph_max=sc.nextInt();
    int rainfall_min=sc.nextInt();
    int rainfall_max=sc.nextInt();
    recommend wheat=new recommend("loamy","clay loamy","","rabi",21,26,6,7,20,75);
    recommend paddy=new recommend("sand loamy","clay loamy","silty","kharif",16,30,5,9.5,100,200);
}
}
