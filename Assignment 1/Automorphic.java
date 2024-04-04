import java.util.Scanner;

public class Automorphic {
    // Function to calculate the number of digits in a number
    public static int countDigits(int num) {
        if (num == 0)
            return 0;
        return 1 + countDigits(num / 10);
    }

    // Function to check if a number is automorphic
    public static boolean isAutomorphic(int num, int square) {
        // Base case: if num equals the last few digits of square, return true
        if (num == square % (int) Math.pow(10, countDigits(num)))
            return true;
        // If square is smaller than num, it's not automorphic, return false
        if (square < num)
            return false;
        // Recursively check next digits by squaring num
        return isAutomorphic(num, square / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Calculate the square of the input number
        int square = number * number;

        // Check if the input number is an automorphic number
        boolean isAutomorphicNumber = isAutomorphic(number, square);

        // Print the result
        if (isAutomorphicNumber)
            System.out.println(number + " is an Automorphic number.");
        else
            System.out.println(number + " is not an Automorphic number.");
    }
}

C:\Users\User\Desktop\1.Cdac\4.DSA\Assignment\Assignment 1>javac Automorphic.java

C:\Users\User\Desktop\1.Cdac\4.DSA\Assignment\Assignment 1>java Automorphic
Enter a number: 625
625 is an Automorphic number.


countDigits(int num): This function calculates the number of digits in a given number num recursively. It returns 0 if the number is 0, otherwise it adds 1 to the count and recursively divides the number by 10 until it becomes 0.

isAutomorphic(int num, int square): This function checks whether a given number num is an automorphic number by comparing it with the square of num. It recursively checks if num equals the last few digits of square by continuously dividing square by 10.

In the main() method:

It reads a number from the user.
It calculates the square of the input number.
It checks if the input number is an automorphic number using the isAutomorphic() function.
It prints the result accordingly.





