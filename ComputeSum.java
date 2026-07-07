/*Object oriented programming Lab 2 question 5

Complete the main method in the ComputeSum class by using a do-while loop to read numbers from the user with the prompt "Please Enter a Number".
When the user enters a negative number  then the loop should stop, and output the sum of the numbers input (excluding the negative number input)











For example:
Test	Input	Result
ComputeSum.main(new String[]{});	2
3
5
6
-1	Please Enter a Number
Please Enter a Number
Please Enter a Number
Please Enter a Number
Please Enter a Number
16

ComputeSum.main(new String[]{});	-1	Please Enter a Number
0

ComputeSum.main(new String[]{});	2
3
4
-1	Please Enter a Number
Please Enter a Number
Please Enter a Number
Please Enter a Number
9

ComputeSum.main(new String[]{});	0
6
2
3
4
-9	Please Enter a Number
Please Enter a Number
Please Enter a Number
Please Enter a Number
Please Enter a Number
Please Enter a Number
15


import java.util.Scanner;
public class ComputeSum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
       
    }
}
*/

import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0; // Variable to store the sum
        int number;

        do {
            System.out.println("Please Enter a Number"); // Prompt user for input
            number = scan.nextInt(); // Read input from user

            if (number >= 0) {
                sum += number; // Add positive numbers to the sum
            }
        } while (number >= 0); // Loop continues until a negative number is entered

        System.out.println(sum); // Output the sum of entered numbers
        scan.close(); // Close the scanner
    }
}
