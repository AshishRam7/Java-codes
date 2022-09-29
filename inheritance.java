class A {
    int a;
    {System.out.println("NS A");}
    A(int x)
    {
    a=x;
    System.out.println("C A");
    }
    void dispA(){System.out.println(a);}
    }
    class B extends A {
    int b;
    {System.out.println("NS B");}
    B(int x,int y)
    {
    super(x);
    System.out.println("C B");
    b=y;
    }
    void dispB(){System.out.println(b);}
    }
    class C extends B {
    int c;
    {System.out.println("NS C");}
    C(int x,int y,int z)
    {
    super(x,y);
    System.out.println("C C");
    c=z;
    }
    void dispC(){System.out.println(c);}
    }
    class inheritance
    {
    public static void main(String args[])
    {
    C o=new C(2,3,4);//1
    o.dispA();
    o.dispB();
    o.dispC();
    }
    }
