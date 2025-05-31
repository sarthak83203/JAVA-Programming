import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=n;
        int r,sum=0;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(m==sum){
            System.out.println("Yes its Palindrome: ");
            System.out.println(sum);
        }else{
            System.out.println("No its Not an Palindrome");
        }
        sc.close();
    }
    
}
