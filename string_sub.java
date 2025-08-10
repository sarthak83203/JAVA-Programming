/*Kunal is developing a software tool that requires him to efficiently determine the length of the longest substring without repeating characters from a given string. This capability is crucial for optimizing search functionality within large text data. The program reads a string and calculates the length of the longest substring that contains unique characters.



Help Kunal to accomplish his task.

Input format :
The input consists of a string, representing the text from which the longest substring without repeating characters needs to be extracted.

Output format :
The output prints an integer representing the length of the longest substring without repeating characters.



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ length of string ≤ 30

Sample test cases :
Input 1 :
abcabcbb
Output 1 :
3
Input 2 :
klmnio
Output 2 :
6
*/
import java.util.*;
public class string_sub {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       String s=sc.next();
       int maxlength=0;
       for(int i=0;i<s.length();i++){
           String current="";
           for(int j=i;j<s.length();j++){
               char ch=s.charAt(j);
               if(current.indexOf(ch)!=-1){
                   break;
               }
               current+=ch;
               if(current.length()>maxlength){
                   maxlength=current.length();
               }
           }
       }
       System.out.println(maxlength);
       sc.close();
    }
    
}
