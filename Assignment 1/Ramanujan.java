import java.util.Scanner;

public class Ramanujan {
    // Function to check whether a number is a Ramanujan number
    public static boolean isRamanujan(int n, int a, int b, int c, int d) {
        // Base case: if a^3 + b^3 equals n, check if c^3 + d^3 also equals n
        if (a * a * a + b * b * b == n) {
            return isRamanujan(n, a, b, c, d, c, d);
        }
        // If a^3 + b^3 doesn't equal n, check next pair (a, b)
        if (a < b) {
            return isRamanujan(n, a + 1, b, c, d);
        }
        // If a > b, reset a and increment b
        if (a >= b) {
            return isRamanujan(n, 1, b + 1, c, d);
        }
        // If a > n^(1/3), no more possible pairs to check, return false
        if (a > Math.pow(n, 1.0 / 3)) {
            return false;
        }
        return false;
    }

    // Overloaded function to check whether a number is a Ramanujan number with given pairs (a, b) and (c, d)
    public static boolean isRamanujan(int n, int a, int b, int c, int d, int origC, int origD) {
        // Base case: if c^3 + d^3 equals n, return true
        if (c * c * c + d * d * d == n) {
            // Check if pairs are distinct
            if (a != c && a != d && b != c && b != d) {
                System.out.printf("%d is a Ramanujan number, %d = %d^3 + %d^3 = %d^3 + %d^3%n",
                        n, n, a, b, origC, origD);
                return true;
            }
        }
        // If c^3 + d^3 doesn't equal n, check next pair (c, d)
        if (c < d) {
            return isRamanujan(n, a, b, c, d + 1, origC, origD);
        }
        // If c > d, reset c and increment d
        if (c >= d) {
            return isRamanujan(n, a, b, origC + 1, origD + 1, origC + 1, origD + 1);
        }
        // If c > n^(1/3), no more possible pairs to check, return false
        if (c > Math.pow(n, 1.0 / 3)) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Check if the number is a Ramanujan number
        boolean isRamanujanNumber = isRamanujan(number, 1, 2, 1, 2);

        // Print the result
        if (!isRamanujanNumber)
            System.out.println(number + " is not a Ramanujan number.");
    }
}

C:\Users\User\Desktop\1.Cdac\4.DSA\Assignment\Assignment 1>java Ramanujan
Enter a number: 1729
1729 is a Ramanujan number, 1729 = 9^3 + 10^3 = 1^3 + 2^3



//This Java program checks whether a given number is a Ramanujan number or not. Here's a brief //explanation of the code:

//The isRamanujan(int n) method iterates through all possible pairs (a, b) where 1 ≤ a < b. It calculates the //sum a^3 + b^3 for each pair.

//For each sum, it calculates the cube root c using Math.cbrt(). If c is an integer greater than b and c^3 equals //the sum, it indicates that the number is a Ramanujan number.

//If a Ramanujan number is found, the method prints the number and the pairs (a, b) and (b, c) such that n = //a^3 //+ b^3 = b^3 + c^3.

//In the main() method, the user is prompted to enter a number. The program then checks if the entered //number is a Ramanujan number using the isRamanujan() method.

//If the entered number is not a Ramanujan number, it prints a message indicating so.






