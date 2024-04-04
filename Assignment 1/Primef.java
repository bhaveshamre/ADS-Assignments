import java.lang.*;
import java.util.*;

class Primef {
    public static void prime(int x, int y) {

if (x==0) {

return;
}      

      if (x <= 1) {
            return;
        }
        if (y > x) {
            return;
        }
        if (x % y == 0) {
            System.out.println(y);
            prime(x / y, y);
        } else {
            prime(x, y + 1);
        }
    }

    public static void main(String[] args) {
        int a = 30;
        System.out.println("Prime factors of " + a + " are:");
        prime(a, 2);
    }
}
//  Prime factor here we are first look at the modulus of given no by 2 if its 0 then we divide the x/y in prime(x/y,y).

// else we increse the y value by 1 in prime(x,y+1) Base case is  0 we stop recursion.