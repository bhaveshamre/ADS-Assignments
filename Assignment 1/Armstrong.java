import java.util.Scanner;

public class Armstrong {
    // Function to calculate the power of a number
    public static int power(int num, int p) {
        // Base case: if power is 0, return 1
        if (p == 0)
            return 1;
        // Recursive step: multiply num with power(num, p-1)
        return num * power(num, p - 1);
    }

    // Function to count the number of digits in a number
    public static int countDigits(int num) {
        // Base case: if num is 0, return 0
        if (num == 0)
            return 0;
        // Recursive step: increment count and remove the last digit
        return 1 + countDigits(num / 10);
    }

    // Function to check if a number is an Armstrong number
    public static int isArmstrong(int num, int originalNum, int n) {
        // Base case: if num is 0, return 0 if originalNum is 0, -1 otherwise
        if (num == 0)
            return originalNum == 0 ? 0 : -1;
        // Recursive step: extract the last digit, raise it to power n, and add it to the result
        int digit = num % 10;
        return power(digit, n) + isArmstrong(num / 10, originalNum, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Count the number of digits in the input number
        int numOfDigits = countDigits(number);

        // Check if the number is an Armstrong number
        int armstrongSum = isArmstrong(number, number, numOfDigits);

        // Print the result
        if (armstrongSum == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
