/*Mukesh is managing a company and needs to calculate the average salary of employees who earn more than a given threshold. Each employee has a name and a salary. Rakesh is using an array of Employee objects to store the employee details. He needs help with writing a program that:



Takes the number of employees and their details (name and salary) using an array of Employee objects.
Takes the salary threshold as input.
Calculates the total salary of employees who earn more than the threshold and computes the average salary for those employees.
If no employees meet the threshold, the program should print a message indicating so.


Help Mukesh implement this task using an array of Employee objects. The program should calculate the average salary of employees who earn more than the threshold, or print a message if no employees meet the threshold.

Input format :
The first line contains an integer numberOfEmployees, representing the number of employees.

The next 2 x numberOfEmployees lines contain the following for each employee:

A string name (the name of the employee).
A double salary (the salary of the employee).
The last line contains a double threshold (the salary threshold).

Output format :
The output prints the average salary of employees whose salary is greater than the threshold, rounded off to two decimal places.

If no employees earn more than the threshold, print "No employees earn more than the given threshold."



Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ numberOfEmployees ≤ 1000

0 ≤ salary ≤ 106

0 ≤ threshold ≤ 106

Sample test cases :
Input 1 :
2
Arun 
21500.56
Ashok 
9980.67
10000.45
Output 1 :
21500.56
Input 2 :
4
Alice
12750.5
Bob
21089.2
David
43189.2
Charles
23500.7
13758.4
Output 2 :
29259.70
Input 3 :
2
Anna
5000.0
Paul
6000.0
9500.0
Output 3 :
No employees earn more than the given threshold.
Note :
The program will be evaluated only after the “Submit Code” is clicked.
Extra spaces and new line characters in the program output will result in the failure of the test case.
Marks : 10
Negative Marks : 0
image
Header Snippet
Fill your code here
Java (11)
theme
instruction
        }
    }


*/
import java.util.*; //this is array of object
class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

public class copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Car[] cars = new Car[N];

        for (int i = 0; i < N; i++) {
            String make = sc.next();
            String model = sc.next();
            int year = sc.nextInt();
            cars[i] = new Car(make, model, year);
        }

        String searchMake = sc.next();

        List<String> models = new ArrayList<>();
        for (Car c : cars) {
            if (c.make.equalsIgnoreCase(searchMake)) {
                models.add(c.model);
            }
        }

        if (models.isEmpty()) {
            System.out.println("No cars found for the given make");
        } else {
            System.out.println("Models of cars made by " + searchMake);
            for (String model : models) {
                System.out.println(model);
            }
        }
        sc.close();
    }
}
