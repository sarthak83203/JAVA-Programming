import java.util.*;
public class multiple_table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int hno=sc.nextInt();
        int arr[]=new int[hno];
        
        for(int i=0;i<hno;i++){
            arr[i]=sc.nextInt();
        }
        int range=sc.nextInt();
        for(int i=0;i<hno;i++){
            for(int j=1;j<=range;j++){
                System.out.print(arr[i] * j+" ");

            }
        }

       
    }
    
}
