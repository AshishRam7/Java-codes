import java.util.Scanner;
class A
{
int a;
int b;
A(){}
A(int a1,int b1)
{
a=a1;
b=b1;
}
void disp()
{
System.out.println(a+" "+b);
}



int adder()
{ return a+b;}



int muli(int c)//formal argument or parameter
{ return (a+b)*c; }



A ocopy(A o)
{
A x=new A();
x.a=this.a+o.a;
x.b=this.b+o.b;
//System.out.println(this.a+" "+this.b);
return x;
}



}
public class objfunct
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
A o=new A(10,20);
o.disp();
int v=o.adder();
System.out.println(v);
System.out.println(o.adder());
int x=s.nextInt();
System.out.println(o.muli(x));//actual arg
A o1=new A(5,5);// 0 0
A o2=o1.ocopy(o);
System.out.println(o2.a+" "+o2.b);
}
}
