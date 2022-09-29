import java.util.Scanner;
class order
{
    static int x;
    static{x=100;}
    {x=x+1;System.out.println("welcome "+x);}
    order(){}
}
class Main1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            order o=new order();
        }
    }
}
