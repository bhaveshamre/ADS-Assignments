import java.lang.*;
import java.util.*;

class pd{

public static int palindrome(int n,int t){

if (n==0)
return 0;

t = (t*10) + (n%10);
return palindrome(n/10,t);

}

public static void main(String[] args){

int a = 252;

int r = palindrome(a,0);

if (r==a)
System.out.print("Yes");
else 
System.out.print("No");

}
}

// with help of algorithm we are subtracting the values of x & y and storing it on gfc(int y) and also storing 

// y value at gfc (int x)  .  then we are performing recursion on that values repetedley till gfc(int y) value 
//becomes 0. then with the help of the termination statement /base case we return the value of gfc(int x);

// 