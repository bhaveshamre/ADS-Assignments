import java.lang.*;
import java.util.*;

class Fibr{

public static int fibr(int n){
if (n <= 1) {                                                            // base statement
            return n;
        } else {
            return fibr(n - 1) + fibr(n - 2);                  /// recursion
        }
}

public static void main(String[] args){

int n =5;

fibr(n);
 
 for (int i = n-1; i >= 0; i--) {
            System.out.print(fibr(i) + " ");   //// reverse printing
        }
}
}

C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>javac Fibr.java

C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>java Fibr
3 2 1 1 0