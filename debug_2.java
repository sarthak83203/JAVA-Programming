/*Karthik is working on an emergency module for the International Space Relay Station. The module takes exactly four binary-encoded sensor readings. Due to limited hardware, he can't store these readings in arrays. His goal is to:



XOR all four input readings together.
Left shift the result by 1 bit.
If the shifted result is divisible by 5, perform a bitwise AND with 63.
If the original XOR value is odd, negate the shifted result (use bitwise NOT ~).
Otherwise, return the shifted result as it is.


However, his current implementation produces incorrect outputs. Help Karthik debug the code.

Input format :
The input consists of four integers, each separated by a space.

Output format :
The output prints a single integer – the final computed value after applying the operations.



﻿Refer to the sample output for formatting specifications.

Code constraints :
0 ≤ value ≤ 255

Sample test cases :
Input 1 :
10 20 30 40
Output 1 :
16
Input 2 :
1 3 5 7
Output 2 :
0
*/
import java.util.*;
public class debug_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt(); 
        int d = sc.nextInt();

        int xor = a ^ b ^ c ^ d;                      
        int shifted = xor << 1;                       
        int masked = (shifted % 5 == 0) ? (shifted & 63) : shifted; 
        int result = (xor % 2 != 0) ? ~masked : masked;             

        System.out.println(result);
        sc.close();
    }
    
}
