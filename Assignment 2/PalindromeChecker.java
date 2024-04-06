import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Base case: if the string has 0 or 1 character, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }
        
        // Recursive case: compare the first and last characters
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // If the first and last characters match, check the substring excluding them
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            // If the first and last characters don't match, it's not a palindrome
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }
}

C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>javac PalindromeChecker.java

C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>java PalindromeChecker
Enter a string: abccba
The string is a palindrome.

Base Case:

If the length of the string is 0 or 1, it means the string is empty or has only one character. In such cases, it's considered a palindrome because a single character string is the same forwards and backwards.
The base case checks for this condition:
java
Copy code
if (str.length() <= 1) {
    return true;
}
Recursive Case:

If the length of the string is greater than 1, the method enters the recursive case.
The method compares the first and last characters of the string:
java
Copy code
if (str.charAt(0) == str.charAt(str.length() - 1)) {
    // If the first and last characters match, check the substring excluding them
    return isPalindrome(str.substring(1, str.length() - 1));
}
If the first and last characters are the same, it calls itself recursively with the substring excluding these characters (str.substring(1, str.length() - 1)).
This effectively reduces the problem size, moving towards the base case. It's like dividing the problem into smaller, more manageable subproblems.
If the first and last characters don't match, the method immediately returns false because the string can't be a palindrome:
java
Copy code
else {
    return false;
}
Recursion Unwinding:

As the recursive calls continue, the string gets shorter and shorter until it reaches the base case (string length 0 or 1).
At this point, the recursion unwinds. Each recursive call returns its result to the previous call, and ultimately to the original caller.
If all the recursive calls return true (indicating that all the substrings were palindromes), then the original call returns true, indicating that the entire string is a palindrome.
If any of the recursive calls return false, indicating that a substring is not a palindrome, then the original call also returns false.
This recursive approach effectively checks whether a string is a palindrome by breaking down the problem into smaller subproblems and solving them recursively.







