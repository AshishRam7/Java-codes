class A
{
static int a;
int b;
int c;
A(int b1,int c1)
{
System.out.println("con third");
b=b1;
c=c1;
}
static{a=100; System.out.println("sb first");}
{System.out.println("before cons");}
void disp(){System.out.println("method four "+a+" "+b+" "+c);}
}
class B
{
public static void main(String args[])
{
System.out.println("main second");
A o1=new A(10,20);
o1.a=999;
o1.disp();
A o2=new A(10,20);
o2.disp();
A o3=new A(10,20);
o3.disp();
}
}