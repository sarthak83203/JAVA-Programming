/*Arav is developing a text editor that provides basic string manipulation features. To implement these, he is working with a StringBuffer to efficiently modify strings. However, his current implementation is not working correctly.



He needs to perform the following operations on an input string:

Append the word "Editor" to the given string.
Insert the word "Java " at the beginning of the string.
Reverse the entire string.
Delete a character at the 5th position (0-based index) of the modified string.
Replace the substring from index 2 to 6 with "XYZ".
Extract a substring from index 3 to 8 and print it separately.


Your task is to complete Arav’s program by implementing the required modifications in the correct order.



Example:

Input:

﻿Hello

Output:

roXYZlleH avaJ

YZlle

Explanation:

Step 1: Append "Editor"

"Hello" → "HelloEditor"


Step 2: Insert "Java " at the beginning

"HelloEditor" → "Java HelloEditor"


Step 3: Reverse the string

Reversing "Java HelloEditor" results in: "rotidEolleH avaJ"


Step 4: Delete character at index 5 (0-based index)

The character at index 5 is E.
Removing "E" from "rotidEolleH avaJ" gives: "rotidolleH avaJ"


Step 5: Replace characters from index 2 to 6 with "XYZ"

The substring from index 2 to 6 is "tido".
Replacing it with "XYZ", we get: "roXYZlleH avaJ"


Step 6: Extract substring from index 3 to 8

The substring from index 3 to 8 in "roXYZlleH avaJ" is: "YZlle"
Input format :
The input contains a single line containing the input string.

Output format :
The first line of the output prints a string representing the modified string after all operations.

The second line prints a string representing the extracted substring.



Refer to the sample output for the formatting specifications.

Code constraints :
The given test cases will fall under the following constraints:

The input string will contain only lowercase and uppercase alphabets.

1≤ length of input string ≤ 50

Sample test cases :
Input 1 :
Code
Output 1 :
roXYZdoC avaJ
YZdoC
Input 2 :
Hello
Output 2 :
roXYZlleH avaJ
YZlle
*/
import java.util.*;
public class string_important {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuffer sb=new StringBuffer(input);
        sb.append("Editor");
        sb.insert(0,"Java");
        sb.reverse();
        sb.deleteCharAt(5);
        sb.replace(2,6,"XYZ");
        String extracted=sb.substring(3,8);
        System.out.println(sb.toString());
        System.out.println(extracted);
        sc.close();
    }
    
}
