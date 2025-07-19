/*Mary is a cashier at a store and needs a program to help her break down amounts of money into specific denominations. Depending on the customer's preference, she needs to provide either the number of notes or coins needed to make up a given amount. 



Write a program that takes the amount of money and the preferred mode as input, and outputs the number of each denomination required to make up that amount.

Input format :
The first line of input contains a double value, representing the amount of money.

The second line contains a string, either 'notes' or 'coins', indicating the preferred mode of denomination.

Output format :
If the mode is 'notes', print the number of 500, 100, 50, and 10 denomination notes required, each on a new line.

If the mode is 'coins', print the number of 25, 10, 5, and 1 cent coins required, each on a new line.

If the mode is invalid, print "Invalid mode"



Refer to the sample output formatting specifications.

Code constraints :
10.0 ≤ amount ≤ 5000.0

Sample test cases :
Input 1 :
35.60
coins
Output 1 :
25 cents: 142
10 cents: 1
5 cents: 0
1 cent: 0
Input 2 :
2250.29
notes
Output 2 :
500: 4
100: 2
50: 1
10: 0
Input 3 :
3000.50
Currency
Output 3 :
Invalid mode
*/



import java.util.*;
public class problem_6 {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        String s=sc.next();
        if(s.equalsIgnoreCase("notes")){
            int money=(int)a;
            System.out.println("500: "+money/500);
            money%=500;
            
            System.out.println("100: "+money/100);
            money%=100;
            
            System.out.println("50: "+money/50); //this counts the notes
            money%=50;//its gives remaining one
            
            System.out.println("10: "+money/10);
            
        }else if(s.equalsIgnoreCase("coins")){
            int cents=(int)Math.round(a * 100);
            
            System.out.println("25 cents: "+cents/25);
            cents%=25;
            
            System.out.println("10 cents: "+cents/10);
            cents%=10;
            
            System.out.println("5 cents: "+cents/5);
            cents%=5;
            
            System.out.println("1 cent: "+cents);
            
            
            
        }else{
            System.out.println("Invalid mode");
        }
        sc.close();
    }
}
