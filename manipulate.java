import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Manip{
    int[] arr1=new int[5];
    int[] arr2=new int[5];
    int num;

    void Idelete(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr1[i]=sc.nextInt();

        }
        int num=sc.nextInt();
        
        for(int i=0;i<5;i++){
            if(arr1[i]==num){
                List<Integer> arrayList = IntStream.of(arr1)
                                    .boxed()
                                    .collect(Collectors.toList());
 
        // Remove the specified element
        arrayList.remove(i);
 
                continue;
            }

            else{
                arr2[i]=arr1[i];
            }
        }
        for(int i=0;i<5;i++){
        System.out.println(arr2[i]);
        }
    }
}
public class manipulate {
    public static void main(String[] args){
        
        Manip o1=new Manip();
        o1.Idelete();
       
    }
    
}
