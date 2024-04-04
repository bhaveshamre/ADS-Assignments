import java.lang.*;
import java.util.*;


class Prime {
    public static int prime(int x, int y) {
        if (x <= 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        if (y == x) {
            return 2;
        }
        if (x % y == 0) {
            return 0;
        }
        return prime(x, y + 1);
    }

    public static void main(String[] args) {
        int a = 17;
        int b = prime(a, 2);

        if (b == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


// we are checking if the no. is less tan one or is 1 then it directey retuns no. else y==x means its 2 then yes

// then we are checking if x is giving 0 modules with the help of rucursive vales of y if find will return 0 which staes not a prime 
// 