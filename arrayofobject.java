/*Problem Statement



Suba is managing a collection of cars for a car dealership. She needs to efficiently retrieve all the car models from a particular manufacturer. To help her with this, she is using an array of Car objects, where each Car object stores details like the car's make, model, and year of manufacture.



You are required to help Suba by writing a program that:

Takes a list of Car objects, each containing information about the car's make, model, and year.
Allows Suba to search for all models from a particular manufacturer (make).
If the specified make exists in the collection, the program should list all the models from that make.
If no cars of the given make are found, the program should inform her that no cars of that make exist.


Help Suba implement this task efficiently using an array of Car objects. The program should list all models of the given make or print a message indicating that no cars of the given make are found.

Input format :
The first line of the input consists of an integer N, representing the number of car objects in the array.

The next N lines each contain a string make, a string model, and an integer year, separated by spaces. Each line represents a car object.

The last line contains a string make, representing the manufacturer for which models are to be retrieved.

Output format :
If cars of the specified make are found, the first line of output displays "Models of cars made by " followed by <make>. The following lines display each model, one per line.

If no cars of the specified make are found, the output displays "No cars found for the given make".



Refer to the sample output for the formatting specifications.

Code constraints :
The given test cases will fall under the following constraints:

1 ≤ N ≤ 8

1000 ≤ Year ≤ 2030

1 ≤ make, model string length ≤ 50

Sample test cases :
Input 1 :
3
Honda Accord 2019
Toyota Camry 2020
Honda Civic 2018
Honda
Output 1 :
Models of cars made by Honda
Accord
Civic
Input 2 :
2
BMW X5 2021
Audi A4 2022
Mercedes
Output 2 :
No cars found for the given make
Input 3 :
6
Chevrolet Spark 2022
Chevrolet Malibu 2021
Chevrolet Tahoe 2020
Ford Mustang 2019
Ford Ff 2018
Tesla Model 2022
Chevrolet
Output 3 :
Models of cars made by Chevrolet
Spark
Malibu
Tahoe
*/
public class arrayofobject {
    
}
