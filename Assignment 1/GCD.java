import java.lang.*;
import java.util.*;

class GCD{

public static int gfc(int x,int y){

if (y==0)
return x;
else 
return gfc(y,Math.abs(x-y)); // Here we are using Euclidean Algorithm (of repetaed Subtraction)

}

public static void main(String[] args){

int a = 25;
int b = 50;

System.out.println(gfc(a,b));

}
}

// with help of algorithm we are subtracting the values of x & y and storing it on gfc(int y) and also storing 

// y value at gfc (int x)  .  then we are performing recursion on that values repetedley till gfc(int y) value 
//becomes 0. then with the help of the termination statement /base case we return the value of gfc(int x);

// 