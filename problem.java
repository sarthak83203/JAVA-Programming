import java.util.*;
public class problem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String result="";
        while(n>0){
            int digit=n%10;
            
            if(digit%2==0){
                result=digit+result;
            }else{
                result="*" +result;
            }
            n=n/10;
        }
        System.out.print(result);
        sc.close();
    }
    
    
    
}
