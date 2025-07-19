/*A prominent real estate agency, 'EstatePro', is streamlining its customer service by automating lease calculations and payment method suggestions. As a software developer, your mission is to create a program that will calculate the total cost of leasing a property based on the monthly rent and the duration of the lease in months. 



Additionally, provide payment method suggestions to the customers, using a 'switch-case' statement.

If the total cost is less than or equal to 1000, suggest payment by cash or check.
If the total cost is between 1000 and 5000 (inclusive), suggest payment by credit card.
If the total amount is over 5000, suggest payment by bank transfer.
Input format :
The first line of input consists of an integer, representing the monthly rent.

The second line consists of an integer, representing the lease duration.

Output format :
The first line prints: "Total Cost: " followed by an integer value representing the total cost (monthly rent × lease duration).

The second line prints: "Payment Method Suggestion: " followed by one of the following exact strings, based on the total cost category:

If the total cost is less than or equal to 1000, "Payment by cash or check is recommended."

If the total cost is greater than 1000 and less than or equal to 5000, "Payment by credit card is recommended."

If the total cost is greater than 5000, "Payment by bank transfer is recommended."



Refer to the sample output for the exact text and format.

Code constraints :
1 ≤ monthly rent ≤ 10,000

1 ≤ lease duration ≤ 36

Sample test cases :
Input 1 :
500
12
Output 1 :
Total Cost: 6000
Payment Method Suggestion: Payment by bank transfer is recommended.
Input 2 :
800
3
Output 2 :
Total Cost: 2400
Payment Method Suggestion: Payment by credit card is recommended.
Input 3 :
150
5
Output 3 :
Total Cost: 750
Payment Method Suggestion: Pa

*/
import java.util.*;
public class problem_7 {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rent=sc.nextInt();
        int duration =sc.nextInt();
        int results=rent * duration;
        int flag=0;
        if(results<=1000){
            flag=1;
            
            
        }else if(results>=1000 && results<=5000){
            flag=2;
        }else if(results>5000){
            flag=3;
        }
        switch(flag){
            case 1:
                System.out.println("Total Cost: "+results);
                System.out.println("Payment Method Suggestion: Payment by cash or check is recommended.");
                break;
            case 2:
                System.out.println("Total Cost: "+results);
                System.out.println("Payment Method Suggestion: Payment by credit card is recommended.");
                break;
            case 3:
                System.out.println("Total Cost: "+results);
                System.out.println("Payment Method Suggestion: Payment by bank transfer is recommended.");
                break;
            default:
                System.out.println("Invalid input.");
                
                
        } 
                
       sc.close(); 
    }

    
}
