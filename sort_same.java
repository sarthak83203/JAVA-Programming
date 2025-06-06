import java.util.*;
public class sort_same {
    public static void PrintArray(int arr[],int n){
          for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Now the Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int flag=0;
        for(int i=0;i<n;i++){
            
                if(arr[i]!=arr[0]){
                    flag=1; //it means we have diffremt elements
                    break;
                    
                }

            
        }

        if(flag==0){
            System.out.println("All the Elements are same");
        }else{
            PrintArray(arr,n);

        }





      
        sc.close();
    }
    
}
