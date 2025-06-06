import java.util.*;
public class search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] arr=new int[n];
        int u=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(m==arr[i]){
                u=i;
                break;
            }
            
        }
        System.out.println(u);
        sc.close();
    }
    
}
