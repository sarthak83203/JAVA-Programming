/*Consider a scenario where you are tasked with organizing the different possible subsequences of a word into sorted order. You are given a string, and your goal is to find and display all the contiguous subsequences (subarrays) of that string. 



For instance, if the input string is "fun", the output should list all possible contiguous subsequences such as f, fu, fun, n, u, un



The total number of subarrays for a string of length `n` can be calculated using the formula n(n+1)/2. 



Write a program that generates all subarrays of the given string and prints them in alphabetically sorted order.

Input format :
The first line of input contains a string representing the input string

Output format :
The program should print all contiguous subarrays (substrings) of the input string in alphabetical order. Each substring should be printed on a separate line. The substrings must include all possible contiguous combinations, starting from the smallest (1 character) up to the full length of the string.



Refer to the sample output for formatting specifications.

Code constraints :
0 ≤ length of string ≤ 200

string contains only lowercase characters.

Sample test cases :
Input 1 :
examly
Output 1 :
a
am
aml
amly
e
ex
exa
exam
examl
examly
l
ly
m
ml
mly
x
xa
xam
xaml
xamly
y
Input 2 :
iamneo
Output 2 :
a
am
amn
amne
amneo
e
eo
i
ia
iam
iamn
iamne
iamneo
m
mn
mne
mneo
n
ne
neo
o
Note :
*/
import java.util.*;
public class didnotun {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        List<String> substrings=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                substrings.add(s.substring(i,j));
            }
        }
        Collections.sort(substrings);
        
        for(String sub:substrings){
            System.out.println(sub);
        }
        sc.close();
    }
    
}
