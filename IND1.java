class rect
{
int l;
int b;
rect(int l1,int b1)
{
l=l1;
b=b1;
System.out.println("base");
}

void display(){
    System.out.println("Base class");
}

void greeting(){
    System.out.println("SCOPE");
}
int area(){return l*b;}
}
class cuboid extends rect
{
int h;
cuboid(int l1,int b1,int h1)
{
super(l1,b1);
h=h1;
System.out.println("der");
}
int volume(){return l*b*h;}

void disp(){
    System.out.println("Derived class");
}

void greeting(){
    System.out.println("SENSE");
}

void new1(){
    super.greeting();
}
}

class IND1
{
public static void main(String args[])
{
cuboid c1=new cuboid(2,3,4);
System.out.println(c1.area());
System.out.println(c1.volume());

c1.greeting();
c1.new1();




}
}