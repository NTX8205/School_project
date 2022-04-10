//資管二B
//陳坤煇
//410918259

import java.util.*;
public class W1_Q2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + "=");
        for (int k = 2; k <= n; k++) {
            while (n != k) {
                if (n % k == 0) {
                    System.out.print(k + "*");
                    n=n / k;
                } 
                else {
                    break;
                }
            }
        }
        System.out.print(n);
   }
 }