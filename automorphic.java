import java.util.*;
public class automorphic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
        int m=n*n;
        r=m%10;
        if(n==1 || r==n){
        System.out.println("Yes the NUmber is automorphic");
        }else{
            System.out.println("NO the Number is not automorphic");
        
    }
    sc.close();
    }
    
    
}
