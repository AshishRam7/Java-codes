import java.util.Scanner;
class order{
    public static int orderid=1000;
    String name;
    int quantity;
    int cost;

    order(){
        cost=100;
    }

    order(int type,int quantity,String name){
        if(type==1){
            cost=80;
            System.out.println("Name:"+name);
            System.out.println("Orderid:"+orderid);
            System.out.println("The cost of your order is:"+(cost*quantity));
        }

        else if(type==2){
            cost = 150;
            System.out.println("Name:"+name);
            System.out.println("your orderid is:"+orderid);
            System.out.println("The cost of your order is:"+(cost*quantity));
        }

        else if(type==3){
            cost = 180;
            System.out.println("Name:"+name);
            System.out.println("your orderid is:"+orderid);
            System.out.println("The cost of your order is:"+(cost*quantity));
        }
    }

    void cost(String name){
        System.out.println("Name:"+name);
        System.out.println("your orderid is:"+orderid);
        System.out.println("The cost of your order is:"+cost);
    }

    

}

public class pizza {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       
       
       for(;;){
           System.out.println();
       System.out.println("Do you want to continue ordering: y/n?");
       char c = sc.next().charAt(0);
       if(c=='n'){
           break;
       }
       System.out.println("Enter your name:");
       String Name=sc.next();
       System.out.println("Choose an option - 1.regular pizza 2.customized pizza");
       int n=sc.nextInt();
       System.out.println();
       if(n==1){
          order o=new order();
          o.cost(Name);
          o.name=Name;
          o.orderid+=1;
       }
       else if(n==2){
           System.out.println("1.Small pizza 2.large pizza 3.special pizza");
           int m=sc.nextInt();
           System.out.println("Enter the quantity:");
           int no=sc.nextInt();
           System.out.println();
           order o=new order(m,no,Name);
           o.name=Name;
           o.orderid+=1;
       }
       
       }

    }
}
