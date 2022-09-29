import java.util.Scanner;

class crop{
    String name;
    String soil[];
    String season[];
    int ph_low;
    int ph_up;
    int rainfall_low;
    int rainfall_up;
    int temp_low;
    int temp_up;

    crop(String name1,String soil1[],String season1[],int ph_low1,int ph_up1,int rainfall_low1,int rainfall_up1,int temp_low1,int temp_up1){
        name=name1;
        soil=soil1;
        season=season1;
        ph_low=ph_low1;
        ph_up=ph_up1;
        rainfall_low=rainfall_low1;
        rainfall_up=rainfall_low1;
        temp_low=temp_low1;
        temp_up=temp_up1;


    }
}

public class agri {

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);

       String Soil=sc.next();
       String Season=sc.next();
       int PH=sc.nextInt();
       int Rainfall=sc.nextInt();
       int temperature=sc.nextInt();

       crop paddy=new crop("paddy",{"sand loamy","silty loam","clay loamy","silty"},{"loamy","clay loamy"},);



}
}
