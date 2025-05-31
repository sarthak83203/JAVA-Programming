import java.util.*;
public class function {
    public static void NeonNumber(int num){
        int sum=0,r,sum1=0;
        sum=sum+ num * num;
        int m=num;
        while(sum>0){
            r=sum%10;
            sum1=sum1+r;
            sum=sum/10;
        }
        if(m==sum1){
            System.out.println(m+" Yes its Neon Number");
        }else{
            System.out.println(m+" No its not an Neon Number");
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NeonNumber(n);
       sc.close();
    }
    
}
