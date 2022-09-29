import java.util.Scanner;


class Student{
    static int regno=1001;
    String Name;
    double Marks;

    Student(){
       
    }
    void status(double marks){
        
        
            
        if(marks>50){
            System.out.println("21BCE"+regno+" is registered");
            regno++;
        }
        else{
            System.out.println("Regno is in waitlist");
        }
    
    }
}
class college {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
       System.out.println("Enter the marks:");
       double mark=sc.nextInt();
       Student o1=new Student();
       o1.status(mark);
       }
       
    
}
}
