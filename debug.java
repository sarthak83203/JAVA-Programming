/*Kavya is developing a signal converter for a satellite control module. It takes two integer inputs and processes them as follows:



Perform an XOR of the two numbers.
If the XOR result is even, left shift it by 1.
If the XOR result is odd, right shift it by 1.
Print the final result.


Due to real-time hardware limitations, no if-else, loops, or arrays are allowed.

Use only bitwise operators, arithmetic, and ternary (? :) conditions.

Input format :
The input consists of two integers separated by a space.

Output format :
The output prints a single integer (final result).



﻿Refer to the sample output for formatting specifications.

Code constraints :
0 ≤ value ≤ 255

Sample test cases :
Input 1 :
10 5
Output 1 :
7
Input 2 :
7 1
Output 2 :
12
*/
import java.util.*;
public class debug {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int xor = a ^ b;  
        int result = (xor % 2 == 0) ? (xor << 1) : (xor >> 1);  

        System.out.println(result);
        sc.close();
    }
    
}
