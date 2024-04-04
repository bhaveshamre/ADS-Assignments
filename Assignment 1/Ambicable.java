import java.util.Scanner;

public class Ambicable {
    // Function to calculate the sum of proper divisors of a number
    public static int sumOfDivisors(int num, int divisor) {
        // Base case: if divisor is greater than or equal to num, return 0
        if (divisor >= num)
            return 0;
        // If num is divisible by divisor, add divisor to sum and recursively call sumOfDivisors
        // with incremented divisor
        if (num % divisor == 0)
            return divisor + sumOfDivisors(num, divisor + 1);
        // If num is not divisible by divisor, recursively call sumOfDivisors with incremented divisor
        return sumOfDivisors(num, divisor + 1);
    }

    // Function to check if a number is part of an amicable pair
    public static boolean isAmicable(int num, int sumOfDivisorsNum) {
        // Calculate the sum of proper divisors of num
        int sum = sumOfDivisors(sumOfDivisorsNum, 1);
        // Check if the sum equals num and num is not equal to sumOfDivisorsNum
        return sum == num && num != sumOfDivisorsNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Calculate the sum of proper divisors of the input number
        int sumOfDivisorsNumber = sumOfDivisors(number, 1);

        // Check if the input number is part of an amicable pair
        boolean isAmicableNumber = isAmicable(number, sumOfDivisorsNumber);

        // Print the result
        if (isAmicableNumber)
            System.out.println(number + " is part of an amicable pair.");
        else
            System.out.println(number + " is not part of an amicable pair.");
    }
}

C:\Users\User\Desktop\1.Cdac\4.DSA\Assignment\Assignment 1>javac Ambicable.java

C:\Users\User\Desktop\1.Cdac\4.DSA\Assignment\Assignment 1>java Ambicable
Enter a number: 220
220 is part of an amicable pair.


Sum of Proper Divisors Function (sumOfDivisors()):

Calculates the sum of proper divisors of a given number recursively.
Starts with a divisor of 1 and iterates up to one less than the number itself.
Adds each divisor that evenly divides the number to the sum.
Recursively continues this process until all possible divisors are checked.
Returns the total sum of proper divisors.
Amicable Number Check Function (isAmicable()):

Checks whether a given number is part of an amicable pair.
Takes two parameters: the number to be checked (num) and the sum of proper divisors of another number (sumOfDivisorsNum).
Calculates the sum of proper divisors for sumOfDivisorsNum.
If the sum of proper divisors of sumOfDivisorsNum equals num and num is not equal to sumOfDivisorsNum, returns true, indicating that num is part of an amicable pair.
Main Method:

Reads a number from the user.
Calculates the sum of proper divisors of the input number using the sumOfDivisors() function.
Checks if the input number is part of an amicable pair using the isAmicable() function.
Prints a message indicating whether the input number is part of an amicable pair or not.
This program efficiently determines whether a given number forms part of an amicable pair using recursive functions to calculate the sum of proper divisors and check for amicability.
