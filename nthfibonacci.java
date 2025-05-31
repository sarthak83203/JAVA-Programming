import java.util.*;
public class nthfibonacci {
    public static void nthFibonacci(int num){
        
        int a=0,c=0;
        int b=1;
        for(int i=2;i<=num;i++){
            c=a+b;
            a=b;
            b=c;
            
        }
        if(c%10==0){
            System.out.println(1);
        }else{
            System.out.println(c%10);
        }
        
        
        

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nthFibonacci(n);
        sc.close();


    }
    
}
