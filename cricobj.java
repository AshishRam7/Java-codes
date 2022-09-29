import java.util.Scanner;
class runs{
    int run;
    runs(int run1){
        this.run=run1;
    }


    public static void maxrun(runs o1,runs o2,runs o3){
        if(o1.run>o2.run && o1.run>o3.run){
            System.out.println(o1.run);
        }
        else if(o2.run>o1.run && o2.run>o3.run){
            System.out.println(o2.run);
        }
        else{
            System.out.println(o3.run);
        }
    }

}
public class cricobj {
public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   
   int n1=sc.nextInt();
   int n2=sc.nextInt();
   int n3=sc.nextInt();

   runs b1=new runs(n1);
   runs b2=new runs(n2);
   runs b3=new runs(n3);

   runs.maxrun(b1,b2,b3); 

}
}
