import java.util.Scanner;

abstract class Shape{
    abstract double rectangleperimeter(int l,int b);
    
    abstract double hexagonperimeter(int s);

    abstract double pentagonperimeter(int s);

    abstract double circleperimeter(int r);
}

class Perimeter extends Shape{
    double rectangleperimeter(int l,int b){
        return 2*(l+b);
    }

    double pentagonperimeter(int s){
        return 5*s;
    }

    double hexagonperimeter(int s){
        return 6*s;
    }

    double circleperimeter(int r){
        return 2*3.14*r;
    }
}
public class shapes {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int length=sc.nextInt();
       int breadth=sc.nextInt();

       Perimeter o1=new Perimeter();
       System.out.println(o1.rectangleperimeter(length,breadth));
       System.out.println(o1.hexagonperimeter(length));
       System.out.println(o1.pentagonperimeter(length));
       System.out.println(o1.circleperimeter(breadth));
    }
}
