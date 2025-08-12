/*Single File Programming Question
Problem Statement



Arjun manages a parking lot that charges customers based on the time they enter. The parking fee is determined solely by the entry hour and is applied uniformly for the entire duration the vehicle is parked.



The program uses several static variables (class-level constants that belong to the class rather than individual objects) to define the parking rates and peak hours:



PEAK_RATE = 10.0 - The hourly rate charged during peak hours
OFF_PEAK_RATE = 7.0 - The hourly rate charged during off-peak hours
PEAK_START_HOUR = 8 - The starting hour of peak time (8 AM)
PEAK_END_HOUR = 18 - The ending hour of peak time (6 PM)


Parking Rate Logic:

If the entry hour falls within the peak hours (8 AM to 6 PM, inclusive), a peak rate of 10.0 per hour is charged for all parked hours.

Otherwise, an off-peak rate of 7.0 per hour is charged for all parked hours.



Help Arjun automate the parking fee calculation based only on the entry time and number of hours parked.



Important:

The parking rate is decided based on the entry hour only and remains the same for the entire parked duration, even if the time crosses from off-peak to peak or vice versa.

Input format :
The first line of input consists of an integer hoursParked, representing the number of hours the vehicle was parked.

The second line consists of an integer entryHour, representing the hour (in 24-hour format) when the vehicle entered the parking lot.

Output format :
The output prints "Parking fee: <value>" followed by a double, representing the total parkingfee calculated based on the applicable rate (rounded to one decimal place).



Refer to the sample output for the formatting specifications.

Code constraints :
1 ≤ hoursParked ≤ 100

0 ≤ entryHour ≤ 23

Sample test cases :
Input 1 :
3
14
Output 1 :
Parking fee: 30.0
Input 2 :
5
9
Output 2 :
Parking fee: 50.0
Note :
The program will be evaluated only after the “Submit Code” is clicked.
Extra spaces and new line characters in the program output will
*/
import java.util.*;
public class static_void {
    static final double PEAK_RATE=10.0;
static final double OFF_PEAK_RATE=7.0;
static final int PEAK_START_HOUR=8;
static final double PEAK_END_HOUR=18;
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int hourParked=sc.nextInt();
    int entryHour=sc.nextInt();
    double rate;
    
    if(entryHour>=PEAK_START_HOUR && entryHour<=PEAK_END_HOUR){
        rate=PEAK_RATE;
    }else{
        rate=OFF_PEAK_RATE;
    }
    double totalFee=hourParked * rate;
    System.out.printf("Parking fee: %.1f",totalFee);
    sc.close();
}


    
}
