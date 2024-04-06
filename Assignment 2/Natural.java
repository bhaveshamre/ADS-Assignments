import java.lang.*;
import java.util.*;

class Natural{

public static int naturalNo(int x){

if (x==1){
return 1;
}
else {
return x+naturalNo(x-1);
}
}
public static void main(String[] args){

int n= 7;

System.out.println(naturalNo(n));


}
}