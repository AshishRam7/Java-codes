import java.util.Scanner;
class student{
    int regno;
    int mark;
    
    student(int marks,int regnos){
        mark=marks;
        regno=regnos;

    }
    
    int score(){
        if(mark<25){
            return 0;
        }
        else{
            return mark;
        }
    }
}

class admi extends student{
    int mark;

    admi(int marks,int regnos, int markse){
        super(marks,regnos);
        mark=markse;
    }

    int score(){
       if(mark>25){
           return mark;
       }
       else{
           return 0;
       }

    }

    void total(){
        System.out.println("regno:"+regno+"  12th marks:"+(super.mark)+" entrance marks:"+mark+" total:"+(score()+super.score()));
    }
}
public class admission{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int regno1=sc.nextInt();
        int marks=sc.nextInt();
        int marke=sc.nextInt();

        admi o1=new admi(marks,regno1,marke);
        o1.total();
    }
}