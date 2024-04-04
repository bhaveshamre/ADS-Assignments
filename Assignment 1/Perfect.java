import java.util.Scanner;

class Perfect {
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

    // Function to check if a number is a perfect number
    public static boolean isPerfect(int num) {
        // Calculate the sum of proper divisors (excluding num itself)
        int sum = sumOfDivisors(num, 1);
        // If the sum of proper divisors equals the number itself, num is a perfect number
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Check if the number is a perfect number
        boolean isPerfectNumber = isPerfect(number);

        // Print the result
        if (isPerfectNumber)
            System.out.println(number + " is a perfect number.");
        else
            System.out.println(number + " is not a perfect number.");
    }
}
