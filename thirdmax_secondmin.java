/*Rosh is intrigued by numerical patterns. Today, she stumbled upon a puzzle while working with arrays. She wants to compute the sum of the third-largest and second-smallest elements from a list of integers. She seeks your help to implement a program that solves this for her efficiently.

Input format :
The first line of input is an integer N, representing the size of the array.

The second line of input consists of N space-separated integers, representing the elements of the array.

Output format :
The output displays a single integer representing the sum of the third-largest and second-smallest elements in the array.



Refer to the sample output for the formatting specifications.

Code constraints :
The given testcases fall under the following constraints:

3 ≤ N ≤ 50

1 ≤ elements ≤ 100

Sample test cases :
Input 1 :
10
10 20 30 40 50 60 70 80 90 100
Output 1 :
100
Input 2 :
5
98 1 54 36 82
Output 2 :
90
Input 3 :
3
10 28 47
Output 3 :
38
*/
import java.util.*;
public class thirdmax_secondmin {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        int first1=Integer.MAX_VALUE;
        int Second1=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }else if(arr[i]>second && arr[i]!=first){
                third=second;
                second=arr[i];
            }else if(arr[i]>third && arr[i]!=first && arr[i]!=second){
                third=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<first1){
                Second1=first1;
                first1=arr[i];
            }else if(arr[i]<Second1 &&arr[i]!=Second1){
                Second1=arr[i];
            }
            
        }
        System.out.println(third+Second1);
        sc.close();
        
    }
    
}
