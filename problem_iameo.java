// Single File Programming Question
// Problem Statement



// Sampad is a high school teacher who wants to convert numeric grades into letter grades.



// Write a program that accepts a numeric grade as input. The program should then convert this numeric grade into a letter grade based on specific conditions. The letter grades are A, B, C, D and F.



// The conversion is determined by the following conditions:

// If the numeric grade is 90 or higher, it's an "A"
// If the numeric grade is between 80 and 89 (inclusive), it's a "B"
// If the numeric grade is between 70 and 79 (inclusive), it's a "C"
// If the numeric grade is between 60 and 69 (inclusive), it's a "D"
// If the numeric grade is below 60, it's an "F"
// Input format :
// The input consists of an integer representing the numeric grade of the student.

// Output format :
// The output prints the letter grade corresponding to the input numeric grade as "Letter Grade: <grade>".



// Refer to the sample output for the formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// 1 ≤ numeric grade ≤ 100

// Sample test cases :
// Input 1 :
// 85
// Output 1 :
// Letter Grade: B
// Input 2 :
// 79
// Output 2 :
// Letter Grade: C
// Input 3 :
// 68
// Output 3 :
// Letter Grade: D
// Input 4 :
// 100
// Output 4 :
// Letter Grade: A
// Input 5 :
// 45
// Output 5 :
// Letter Grade: F

import java.util.*;
public class problem_iameo {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=90){
            System.out.println("Letter Grade: A");
        }else if(n>=80 && n<=89){
            System.out.println("Letter Grade: B");
        }else if(n>=70 && n<=79){
            System.out.println("Letter Grade: C");
        }else if(n>=60 && n<=69){
            System.out.println("Letter Grade: D");
        }else if(n<60){
            System.out.println("Letter Grade: F");
        }
        sc.close();
    }
    
}
