import java.lang.*;
import java.util.*;

class sumofd{

public static int sum(int a){

if (a==0)                                     /// base case
return 0;
else 
return a%10 +sum(a/10);  /// her we get the last digit of a no. with help of modulas then to eleminate that                                                      //digit we divide it by 10
}

public static void main(String[] args){

int a = 1856;

System.out.println(sum(a)); 

}
}
C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>javac sumofd.java

C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>java sumofd
20