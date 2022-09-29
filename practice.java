import java.util.Scanner; 
class student{
     int regno;
     int mark;
     
    student(){
        
    }

    int score(int mark12){
        if(mark12<25){
            return 0;
        }
        else{
            return mark12;
        }

   
    }

    class admission extends student{
        int entermark;

        admission(){

        }
        
        int score(int markentrance){
            if(markentrance<25){
                return 0;
            }
            else{
                return markentrance;
            }
    }

        void total(){
            if()
    }
}
}

public class practice {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
    }
}
