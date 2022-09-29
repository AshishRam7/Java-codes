import java.util.Scanner;

class shape2d{
    double length;
    double width;
}

class rectangle extends shape2d{

    rectangle(int l,int b){
        length=l;
        width=b;
    }
   double area(){
        return length*width;
   }

   double perimeter(){
        return 2*(length+width);
   };
}

class circle extends shape2d{

    circle(int r){
       length=r;
    }
   double area(){
       return length*length*3.14;
   }

   double perimeter(){
       return 2*3.14*length;
   }
}

class square extends shape2d{

    square(int s){
       length=s;
    }
    double area(){
        return length*length;
    }
    double perimeter(){
        return 4*length;
    }
}

public class areainheritance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s[]=str.split(" ");
        int l=Integer.valueOf(s[0]);
        int w=Integer.valueOf(s[1]);
        rectangle o1=new rectangle(l,w);
        square o2=new square(l);
        circle o3=new circle(l);

        System.out.println("The area and perimeter of a circle with radius "+o3.length+" is "+o3.area()+" and "+o3.perimeter());
        System.out.println("The area and perimeter of a square with side length "+o2.length+" is "+o2.area()+" and "+o2.perimeter());
        System.out.println("The area and perimeter of a Rectangle with length "+o1.length+" and breadth "+o1.width+" is "+o1.area()+" and "+o1.perimeter());


    }
}
