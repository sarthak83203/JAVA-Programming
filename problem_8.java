/*Ravi wants to estimate the total utility bill for a household based on the consumption of electricity, water, and gas. 



Write a program to calculate the total bill using the following criteria:

The cost per unit for electricity is 0.12, for water is 0.05, and for gas is 0.08.
A discount is applied to the total cost based on the following conditions:
If the total cost is 100 or more, a 10% discount is applied.
If the total cost is between 50 and 99.99, a 5% discount is applied.
No discount is applied if the total cost is less than 50.


The program should output the total bill after applying the discount with two decimal places.

Input format :
The input consists of three double values, representing the number of units consumed for electricity, water, and gas respectively.

Output format :
The output prints a double value, representing the total bill after applying the discount, formatted to two decimal places.



Refer to the sample output for formatting specifications.

Code constraints :
1.00 ≤ units consumed ≤ 10000.00

Sample test cases :
Input 1 :
1000.0
200.0
100.0
Output 1 :
124.20
Input 2 :
500.0
30.0
20.0
Output 2 :
59.95
Input 3 :
120.0
70.0
45.0
Output 3 :
21.50
*/

import java.util.*;
public class problem_8 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        double e=sc.nextDouble();
        double w=sc.nextDouble();
        double g=sc.nextDouble();
        double elec=(0.12 * e)+(0.05 * w)+(0.08 * g);
        if(elec>=100.0){
            double half=elec * 0.1;
            double finals=elec-half;
            System.out.printf("%.2f",finals);
        }else if(elec>50.0 && elec<99.99){
            double half=elec * 0.05;
            double finals=elec-half;
            System.out.printf("%.2f",finals);
        }else if(elec<50){
            
            double finals=elec;
            System.out.printf("%.2f",finals);
        }
        
        
        sc.close();
    }
    
}
