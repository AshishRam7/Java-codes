import java.util.Scanner;
public class bmi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        
        
        double height=sc.nextDouble();
        double weight=sc.nextDouble();

        double bmi;
        bmi=weight/((height*2.5*height*2.5)/10000);
        if(bmi<18.5){
            System.out.println("Underweight");
        }

        else if(bmi>=25){
            System.out.println("Overweight");
        }

        else{
            System.out.println("normal Weight");
        }
        
    }
}
