import java.util.Scanner;

class Student{
    String name;
    int age;
    
    public void printinfo(){
       System.out.println(this.name);
       System.out.println(this.age);
    }
    
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class OOPS{
    public static void main(String[]  args){
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of entries:");
        int num=sc.nextInt();
        int store[]=new int[num];
        char Sum='S';
        int sum1=(int)Sum;
        System.out.println(sum1);
        for(;;){
        
        String nm=sc.next();
        int n=sc.nextInt();
        Student s1 =new Student(nm,n);
     
        s1.printinfo();
        /*System.out.println("Do you want to continue?? (y/n)");
        char response=sc.next().charAt(0);
        if(response=='n'){
            break;
        }*/
        }

    }
}