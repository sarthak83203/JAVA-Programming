import java.util.*;
public class max_min {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }else if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum Number: "+min);
        sc.close();
    }
}
