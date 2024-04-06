import java.lang.*;
import java.util.*;

class Reverse {
    public static String rev(String str) {
        if (str.isEmpty() || str.length() == 1)
            return str;
        else
            return rev(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "abcd";
        String reversedStr = rev(str);
        System.out.println(reversedStr);
    }
}

C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>javac Reverse.java

C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>java Reverse
dcba

===================================================================================================

The rev method is a recursive function that reverses a string. Here's how it works:

Base Case: The base case is defined in the if statement:

java
Copy code
if (str.isEmpty() || str.length() == 1)
    return str;
This checks if the input string str is empty or has only one character. If so, it means the string is already reversed (or doesn't need to be reversed), so the method returns the same string.

Recursive Case: If the input string has more than one character, the method enters the else block:

java
Copy code
else
    return rev(str.substring(1)) + str.charAt(0);
This line of code is where the magic of recursion happens. It calls the rev method recursively with the substring of str starting from the second character (str.substring(1)), and then appends the first character of str (str.charAt(0)) at the end. This effectively reverses the order of characters in the string.

Now, let's see how this works with an example:

Input: "abcd"

The rev method is called with the input string "abcd".
Since the string has more than one character, it enters the else block.
It calls rev("bcd") (substring of "abcd" starting from index 1) and appends 'a' at the end.
Now, rev("bcd") is called.
It calls rev("cd") (substring of "bcd" starting from index 1) and appends 'b' at the end.
Now, rev("cd") is called.
It calls rev("d") (substring of "cd" starting from index 1) and appends 'c' at the end.
Now, rev("d") is called.
Since "d" has only one character, it returns "d".
"d" is appended with 'c' (resulting in "dc").
This "dc" is returned to the previous call.
"dc" is appended with 'b' (resulting in "dcb").
This "dcb" is returned to the previous call.
"dcb" is appended with 'a' (resulting in "dcba").
This "dcba" is the final result and returned to the original caller.
So, the reversed string of "abcd" is "dcba", which is the output of the rev method.

===================================================================================================





