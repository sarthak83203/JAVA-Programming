/*Dave used to crack puzzles a lot, but recently he has been having a tough time solving one. The solution to a particular puzzle is related to palindrome. 



Write a program for Dave to check if only the odd digits in an integer form a palindrome. He should use a 'do-while' loop to solve the same.

Input format :
The input consists of an integer N.

Output format :
The first line of output prints "Odd digits: " followed by the odd digits of N in reverse order.

The second line prints one of the following:

If the odd digits form a palindrome, print "The odd digits form a palindrome."
Otherwise, print "The odd digits do not form a palindrome."


Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ N ≤ 109

Sample test cases :
Input 1 :
12321
Output 1 :
Odd digits: 131
The odd digits form a palindrome.
Input 2 :
12345
Output 2 :
Odd digits: 531
The odd digits do not form a palindrome.

*/
import java.util.*;
public class palindrome_case {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,nu,sum=0,sum1=0;
        while(n>0){
            r=n%10;
            if(r%2!=0){
                sum=sum*10+r;
                
            }
            n=n/10;
        }
        int m=sum;
        while(sum>0){
            nu=sum%10;
            sum1=sum1*10+nu;
            sum=sum/10;
            
        }
        if(m==sum1){
            System.out.println("Odd digits: "+m);
            System.out.println("The odd digits form a palindrome.");
            
        }else{
            System.out.println("Odd digits: "+m);
            System.out.println("The odd digits do notform a palindrome.");
            
        }
        sc.close();
        
    }
    
    
}
