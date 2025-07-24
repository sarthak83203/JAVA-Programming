/*Henry is interested in counting how many prime numbers, starting from a given number N, can be summed up until the sum exceeds a threshold M. He wants to know how many prime numbers he adds before the sum exceeds M. 



Write a program to help Henry calculate this count.



Example



Input:

10 150

Output:

8

Explanation:

For the input 10 150, the program:

Starts with prime = 10, and keeps adding primes to the sum until the sum > 150.

The primes found are: 11, 13, 17, 19, 23, 29, 31, 37.

The sum of these primes is 11 + 13 + 17 + 19 + 23 + 29 + 31 + 37 = 180, which exceeds 150 after 8 primes.

Input format :
The input consists of two integers N and M, where N is the starting number, and M is the threshold for the sum.

Output format :
The output prints an integer representing the number of prime numbers that can be summed up before exceeding M.



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ N ≤ 1000

1 ≤ M ≤ 10000

Sample test cases :
Input 1 :
10 50
Output 1 :
4
Input 2 :
10 150
Output 2 :
8
*/
import java.util.*;
public class primenumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        int count=0;
      
        for(int i=n;i<=m;i++){
              int flag=1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=0;
                    break;
                
                }
                
            }
            if(flag==1){
                count++;
                sum=sum+i;
            }
            if(sum>m){
                break;
            }
            
           
           
        }
        System.out.println(count);
        sc.close();
    }

    
}
