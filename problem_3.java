/*Single File Programming Question
Problem Statement



Amit wants to evaluate the depreciation of his car over time to understand its current value and categorize it based on that value. 



Write a program that helps him determine the current value of his car after a certain number of years of depreciation and classify it into one of three categories:

High: If the current value is greater than 10,000.
Medium: If the current value is between 5,000 and 10,000, both inclusive.
Low: If the current value is less than 5,000.


The depreciation rate of the car is 15% per year. The program should calculate the current value of the car after applying this depreciation over the given number of years and print the current value along with the category.

Input format :
The first line of input consists of an integer, representing the initial cost of the car.

The second line consists of an integer, representing the number of years the car has been depreciating.

Output format :
The first line of output prints a double value, representing the current value of the car, rounded off to two decimal places "Current Value: <value>".

The second line prints its category "Category: <categories>".



Refer to the sample output for formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:

1 ≤ initial cost ≤ 100000

0 ≤ age ≤ 100

/*Sample test cases :
Input 1 :
20000
5
Output 1 :
Current Value: 8874.11
Category: Medium
Input 2 :
15537
7
Output 2 :
Current Value: 4980.81
Category: Low
Input 3 :
12575
1
Output 3 :
Current Value: 10688.75
Category: High
*/

import java.util.*;
public class problem_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int initial=sc.nextInt();
        int years=sc.nextInt();
        double ty=(double)Math.pow((1.0-(0.15)),years);
        double results=(double)initial * ty;
        results=Math.round(results * 100.00)/100.0;
        if(results>10000.00){
            System.out.printf("Current Value: %.2f\n",results);
            System.out.print("Category: High");
        }else if(results>=5000.00 && results<=10000.00){
            System.out.printf("Current Value: %.2f\n",results);
            System.out.print("Category: Medium");
            
            
        }else if(results<5000.00 ){
            System.out.printf("Current Value: %.2f\n",results);
            System.out.print("Category: Low");
            
            
        }
        sc.close();
    }
    
}
