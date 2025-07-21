/* 



Joe has a favourite number, let's call it X. He wants to check if X is divisible by the sum of its digits. If it is, he considers it a lucky number. If not, he wants to find the closest smaller number, that is divisible by the sum of digits of X. Joe has challenged his friends to solve this puzzle at his birthday party.



Example



Input:

157

Output:

157 is not divisible by the sum of its digits.

The closest smaller number that is divisible: 156

Explanation:

The sum of the digits of X is 1+5+7=13. Since 157 is not divisible by 13, we need to find the closest smaller number that is divisible by 13. 156 is divisible by 13, it is the closest smaller number that meets the requirement.

Input format :
The input consists of an integer X, representing Joe's favourite number.

Output format :
If X is a lucky number, then the output must be in the format: "X is divisible by the sum of its digits."

If not, then the output must be in the format:

"X is not divisible by the sum of its digits.

The closest smaller number that is divisible: Y",

where X is the entered number and Y is the closest number.



Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ X ≤ 107

Sample test cases :
Input 1 :
120
Output 1 :
120 is divisible by the sum of its digits.
Input 2 :
157
Output 2 :
157 is not divisible by the sum of its digits.
The closest smaller number t
*/

import java.util.*;
public class looping {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int r,sum=0;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        
        int close=m;
        while(close>0 && close%sum!=0){
            close--;
        }
        if((m%sum)==0){
                System.out.println(m + " is divisible by the sum of its digits.");
            }else  {
                System.out.println(m + " is not divisible by the sum of its digits.");
                System.out.println( "The closest smaller number that is divisible: "+close);
            }
            sc.close();
    }
    
}
