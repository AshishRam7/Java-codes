import java.util.Scanner;
import java.util.Arrays;
public class sorting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
        int temp;
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            if(a[i]>10){
                throw new myexc("Number greater than 10");
            }
        }

        System.out.println(Arrays.toString(a));

        for(int i=0;i<5;i++){
           for(int j=0;j<5-i-1;j++){
               if(a[j]>a[j+1]){
                   temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
               }
           }
        }


            System.out.println(Arrays.toString(a));
    }

    catch(myexc e){
        System.out.println(e);
    }
    

}
}

class myexc extends Exception {
	String str;
	public myexc(String str) { 
		this.str = str;}
	public String toString() { return this.str;}
	}
