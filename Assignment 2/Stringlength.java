import java.lang.*;
import java.util.*;

class Stringlength {
    public static String length(String str) {
        if (str.isEmpty())
            return str;
        else
            return 1+length(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "abcd";
        String ok = length(str);
        System.out.println(ok);
    }
}

C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>javac Stringlength.java

C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>java Stringlength
1111