import java.util.Scanner;

class notleap{
    static int count=1;
    static void display(int n){
        
         System.out.println(n+"_"+count);
         count++;
    }
}
public class leapyear1 {
    static int counter=1;
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        
        int leap=sc.nextInt();
        if((leap-1600)%4==0 || leap==1600){
            int check =((leap-1600)/4)+1;
            leapyear1.leapyear(leap,check);
        }
        else{
        for(int i=1600;i<leap+1;i++){
            
            
            if(i%4==0){
                if(i%100==0){
                    if(i%400==0){
                      leapyear1.leapyear(i);
                      
                    }
                    else{
                      notleap.display(i);

                    }
                }
                else{
                    leapyear1.leapyear(i);
                    

                }

            }
            else{
                notleap.display(i);
            }

        }
    }
    }

    static void leapyear(int n){
        System.out.println(n+"_leap_"+counter);
        counter++;
    }

    static void leapyear(int n,int check){
        System.out.println(n+"_leap_"+check);
    }
    
}
