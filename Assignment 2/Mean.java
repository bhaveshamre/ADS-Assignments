import java.lang.*;
import java.util.*;

class Mean{

public static double mean(double[] x,int y,int z){

if (z==y-1)                                                                // base ststement
return z;
else 
return x[z]+(mean(x,y,z+1));                              // sum of array

}

public static void main(String[] args){

double[] arr = {0,5,10,15,20};
int a = arr.length;
double r = mean(arr,a,0)/a;                                // sum divide by length
System.out.println(r);

}
}
