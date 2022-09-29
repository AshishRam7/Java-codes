import java.util.Scanner;
class year
{
    static int count1=0;

static String nonleap(){
count1++;
return "_"+count1;}

}
class leapyr
{
static int count2=0;
static String leap(){
count2=count2+1;
return "_Leap_"+count2;
}


    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(((n%4==0)&&(n%100!=0))||(n%400==0)){
           System.out.print(n+leap());
        }
        else{
      for (int i=1600;i<n+1;i++){
        if(((i%4==0)&&(i%100!=0))||(i%400==0)){
        System.out.println(i+leapyr.leap());
       } 
      else{
        System.out.println(i+year.nonleap());
 }
    }
}
}
}