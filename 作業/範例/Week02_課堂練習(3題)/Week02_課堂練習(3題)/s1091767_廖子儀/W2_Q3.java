import java.util.*;
public class W2_Q3{
//質因數分解進階版
//資管二B/410917677/廖子儀
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + "=");
        for (int k = 2; k <= n; k++) {
            while (n != k) {
                if (n % k == 0) {
                    System.out.print(k + "*");
                    n /= k;
                } else {
                    break;
                }
            }

        }
        System.out.print(n);
        }
        }