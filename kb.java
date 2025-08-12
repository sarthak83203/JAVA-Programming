/*Oliver is working on a project that involves dealing with file sizes. He needs a Java program that can convert file sizes from bytes to kilobytes (KB), megabytes (MB), gigabytes (GB), and vice versa. Write a Java program that includes a static method for converting file sizes. The program should be able to perform the following conversions:

Convert from bytes to KB, MB, or GB.
Convert from KB, MB, or GB to bytes.


Note:

1 KB (Kilobyte) = 1,024 bytes

1 MB (Megabyte) = 1,024 KB = 1,024 × 1,024 bytes = 1,048,576 bytes

1 GB (Gigabyte) = 1,024 MB = 1,024 × 1,024 × 1,024 bytes = 1,073,741,824 bytes

Input format :
The first line consists of a long integer fileSize, representing the file size to be converted

The second line consists of a string fromUnit, representing the current unit of the file size

The third line consists of a string toUnit, representing the target unit for the conversion.

Output format :
The output prints a string containing the converted file size followed by the unit of measurement (e.g., "256 KB").



Refer to the sample output formatting specifications

Code constraints :
(1 ≤ fileSize ≤ 1018).

Sample test cases :
Input 1 :
1024
bytes
KB
Output 1 :
1 KB
Input 2 :
2048
KB
MB
Output 2 :
2 MB
*/
import java.util.*;
public class kb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fileSize = sc.nextLong(); 
        sc.nextLine();
        String fromUnit = sc.nextLine().toLowerCase();
        String toUnit = sc.nextLine().toLowerCase();

        String[] units = {"bytes", "kb", "mb", "gb"};
        int fromIndex = -1, toIndex = -1;

        for (int i = 0; i < units.length; i++) {
            if (units[i].equals(fromUnit)) fromIndex = i;
            if (units[i].equals(toUnit)) toIndex = i;
        }

        if (fromIndex == -1 || toIndex == -1) {
            System.out.println("Invalid unit");
            return;
        }

        // Convert source size to bytes
        long bytes = fileSize * power1024(fromIndex);

        // Convert bytes to target unit
        long targetValue = bytes / power1024(toIndex);

        System.out.println(targetValue + " " + toUnit.toUpperCase());
        sc.close();
    }

    private static long power1024(int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= 1024;
        }
        return result;
        
    }
    
}
