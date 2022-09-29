import java.util.Scanner;
class student
{
int regno;
String name;
String school;
int year;
double mark;
student()
{
school="SENSE";
year=1;
}
student(int r,String n,String sc,int y,double m)
{
regno=r;
name=n;
school=sc;
year=y;
mark=m;
}
student(String sc,int y)
{
regno=1111;
name="rsabc";
school=sc;
year=y;
mark=0.0;
}
student(student o)//2000
{
this.regno=o.regno;
this.name=o.name;
this.school=o.school;
this.year=o.year;
this.mark=o.mark;
}
}
class clgstudent
{
public static void main(String args[])
{
student o1=new student();
System.out.println(o1);
Scanner s=new Scanner(System.in);
o1.regno=101;
o1.name="Abirami";
o1.school="SENSE";
o1.year=1;
o1.mark=100;



student o2;
o2=new student();
System.out.println(o2);
o2.regno=102;
o2.name="Sarvesh";
o2.school="SENSE";
o2.year=1;
o2.mark=90;



student o3=new student();
System.out.println(o3);
/*o3.regno=s.nextInt();
o3.name=s.next();
o3.school=s.next();
o3.year=s.nextInt();
o3.mark=s.nextDouble();*/



student o4=new student(1,"abc","SENSEPG",2,99.90);
System.out.println(o4);



student o5=new student(1,"abc","SCOPEPG",2,0.0);
System.out.println(o5);



student o6=new student("SCOPERO",1);
System.out.println(o6);



student o7=new student(o4);
System.out.println(o7);



student o8=o5;
System.out.println(o8);



System.out.println(o1.regno+" "+o1.name+" "+o1.school+" "+o1.year+" "+o1.mark);
System.out.println(o2.regno+" "+o2.name+" "+o2.school+" "+o2.year+" "+o2.mark);
System.out.println(o3.regno+" "+o3.name+" "+o3.school+" "+o3.year+" "+o3.mark);
System.out.println(o4.regno+" "+o4.name+" "+o4.school+" "+o4.year+" "+o4.mark);
System.out.println(o5.regno+" "+o5.name+" "+o5.school+" "+o5.year+" "+o5.mark);
System.out.println(o6.regno+" "+o6.name+" "+o6.school+" "+o6.year+" "+o6.mark);
System.out.println(o7.regno+" "+o7.name+" "+o7.school+" "+o7.year+" "+o7.mark);
System.out.println(o8.regno+" "+o8.name+" "+o8.school+" "+o8.year+" "+o8.mark);
}
}
