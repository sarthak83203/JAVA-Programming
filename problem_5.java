/* 



Raj is solving a physics problem involving projectile motion, where he needs to calculate the time a ball hits the ground using a quadratic equation of the form ax² + bx + c = 0. Depending on the coefficients, the ball may hit the ground once, twice, or not at all in real time. 



Help Raj find all real roots of the equation, if any.



Note: discriminant = b2 - 4ac

Input format :
The input consists of three space-separated doubles a, b, and c, representing the coefficients of the quadratic equation.

Output format :
If there are two real roots, print:

"Two real solutions:"
"Root1 = <value>"
"Root2 = <value>"
If there is one real root, print:

"One real solution:"
"Root = <value>"
If there are no real roots, print:

"There are no real solutions."
Note: values are rounded to two decimal places.



Refer to the sample output for formatting specifications.

Code constraints :
a≠0

Sample test cases :
Input 1 :
1 6 9
Output 1 :
One real solution:
Root = -3.00
Input 2 :
1 5 6
Output 2 :
Two real solutions:
Root1 = -2.00
Root2 = -3.00
Input 3 :
1 5 7
Output 3 :
There are no real solutions.

*/

import java.util.*;
public class problem_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int discriminant=(b * b) - (4 * a * c);
        if(discriminant>0){
            double root1=(-b + Math.sqrt(discriminant))/(2.0 * a);
            double root2=(-b - Math.sqrt(discriminant))/(2.0 * a);
            System.out.println("Two real solutions:");
            System.out.printf("Root1 = %.2f\n",root1);
            System.out.printf("Root2 = %.2f\n",root2);
            
            
        }else if(discriminant==0){
            double rootsd= -b/(2.0 * a);
             System.out.println("One real solution:");
             System.out.printf("Root = %.2f",rootsd);
             
            
        }else if(discriminant<0){
            System.out.println("There are no real solutions.");
            
        }
        
    sc.close();
}
}
    

