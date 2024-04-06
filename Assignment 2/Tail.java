import java.lang.*;
import java.util.*;

class Tail{

public static int tail(int[] arr,int a,int n){

if (a==n-1)
return arr[a];
else 
return arr[a] + tail(arr,a+1,n);

}
public static void main(String[] args){

int[] arr = {5,5,5};
int n = arr.length;

System.out.println(tail(arr,0,n));

}
}
C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>javac Tail.java

C:\Users\User\Desktop\1.Cdac\4.DSA\Practice Assignment 2>java Tail
15