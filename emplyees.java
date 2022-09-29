/*
employee is a class with a function to set the details of the employee such as 
the emp_id, Name, gender and city. The full time employee is a class derived from 
employee has a function to set the dearness allowance (DA), House Rent allowance (HRA) and 
EPF Deduction. Part-time employee is a class derived from employee is a class derived
 from employee has a function to set the shift (1,11 or 111), 
pickup point, pickup time, drop point and leaving time.
*/

import java.util.Scanner;
class employee{
    String emp_id;
    String Name;
    String gender;
    String city;
    

    void setdet(String emp_id1,String names,String genders,String city1){
        emp_id=emp_id1;
        Name=names;
        gender=genders;
        city=city1;
    }
}

class fulltime extends employee{
    int DA;
    int HRA;
    int EPF;

    void setdet(String emp_id1,String names,String genders,String city1,int DA1,int HRA1, int EPF1){
        super.setdet(emp_id1,names,genders,city1);
        DA=DA1;
        HRA=HRA1;
        EPF=EPF1;
    }

    void display(){
        System.out.println(emp_id+" "+Name+" "+gender+" "+city+" "+DA+" "+HRA+" "+EPF);
    }
}

class parttime extends employee{
    int shift;
    int pickupt;
    String pickupp;
    int dropt;
    String dropp;

    void setdet(String emp_id1,String names,String genders,String city1,int shift1,int pickupt1,String pickupp1,int dropt1,String dropp1){
        super.setdet(emp_id1,names,genders,city1);
        shift=shift1;
        pickupt=pickupt1;
        pickupp=pickupp1;
        dropt=dropt1;
        dropp=dropp1;
    }

    void display(){
        System.out.println(emp_id+" "+Name+" "+gender+" "+city+" "+shift+" "+pickupt+" "+pickupp+" "+dropt+" "+dropp);
    } 
}
public class emplyees {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String emp=sc.next();
        String name=sc.next();
        String gender=sc.next();
        String city=sc.next();
        char a=sc.next().charAt(0);
        if(a=='y'){
            int DA=sc.nextInt();
            int HRA =sc.nextInt();
            int EPF=sc.nextInt();

            fulltime o1=new fulltime();
            o1.setdet(emp,name,gender,city,DA,HRA,EPF);
        }

        else{
            int shift=sc.nextInt();
            int pickupt=sc.nextInt();
            String pickupp=sc.next();
            int dropt=sc.nextInt();
            String dropp=sc.next();

            parttime o2=new parttime();
            o2.setdet(emp,name,gender,city,shift,pickupt,pickupp,dropt,dropp);
        }

       
        
        
        
       


    }
}
