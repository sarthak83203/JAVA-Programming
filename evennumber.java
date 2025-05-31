import java.util.*;
public class evennumber {
    public static void Even(int x){
        if(x%2==0){
            System.out.println("Even");
            Multiple(x);
        }else{
            System.out.println("odd");
        }
    }
    public static void Multiple(int x){
        if(x%10==0){
            System.out.println("Multiple of 10");
        }else{
            System.out.println("Not multiple of 10");
        }
        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Even(n);
        sc.close();
    }
    
}
