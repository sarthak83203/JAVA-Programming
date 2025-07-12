/*import java.util.*;
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
    
}*/

//WAP which contains the function to conert to string and to convert character to integer.
import java.util.*;
public class problem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=Integer.toString(n);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int digit=ch-'0';  //This is conversion of character to string.

            if(digit%2==0){
                System.out.print(digit);
            }else{
                System.out.print("*");
            }
        }
    }

}
