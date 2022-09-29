import java.util.Scanner;
abstract class Employee{
    int empID;
    String empName;
    String dateofjoin;
    String department;
    double sal;
    //void display();
    abstract void salary();
}
class Salary extends Employee{
    int cadre;
    double bsal;
    public double salary(int a){
        if(a == 1){
            return a+(0.7*a);
        }
        else if(a == 2){
            return a+(0.5*a);
        }
        else{
            return a+(0.25*a);
        }
    }

    void display(){
        System.out.println("Employee ID: "+empID+" Employee Name: "+empName+" Employee Date of joining: "+dateofjoin+" Employee department: "+department+" Employee Salary: "+sal);
    }
}
public class Demopoems{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        String b = s.next();
        String c = s.next();
        String d = s.next();
        int e = s.nextInt();
        int f = s.nextInt();
        Salary A = new Salary();
        A.empID = a;
        A.empName = b;
        A.dateofjoin = c;
        A.department = d;
        A.bsal = f;
        A.cadre = e;
        A.sal = A.salary(e);
        A.display();
    }
}