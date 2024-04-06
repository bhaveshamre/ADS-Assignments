import java.lang.*;
import java.util.*;

class Print{

public static void print(int x,int y){

if (x<=y){

System.out.println(x);
print(x+1,y);
}
}

public static void main(String[] args){

int n= 10;

print(1,n);


}
}