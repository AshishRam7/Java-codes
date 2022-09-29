import java.util.Scanner;

class reverse{
    String regno;
    String pass="";
    String pass1="";
    String pass2="";
    String pass3="";
    

    reverse(String str){
        regno=str;
    }

    void generatepassword(){
        

        for(int i=0;i<9;i++){
            if(i<2){
                pass1+=regno.charAt(i);
            }
            if(i>=2 && i<5){
                pass2+=regno.charAt(i);
            }

            if(i>=5 && i<9){
                pass3+=regno.charAt(i);
            }

            
        }
    
        //System.out.println(pass3);
        for(int i=0;i<9;i++){
            if(i<2){
               for(int j=1;j>=0;j--){
                   //System.out.println(pass1.charAt(j));
                   pass+=pass1.charAt(j);
                   i++;
               }
            }
            if(i>1 && i<5){
                for(int j=2;j>=0;j--){
                   pass+=pass2.charAt(j);
                   i++;
                }
            }

            if(i>=5 && i<9){
                for(int j=3;j>=0;j--){
                    pass+=pass3.charAt(j);
                    i++;
                }
            }
               
        }
        
        
    }

    void displaypassword(){
        System.out.println(pass);
    }
}
public class vtoppass {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       String reg=sc.next();
       if(reg.length()!=9){
           System.out.println("Invalid");
       }
       else{
           reverse o1=new reverse(reg);
           o1.generatepassword();
           o1.displaypassword();
       }
      
    }
}
