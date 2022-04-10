//題目說明:將使用者輸入的正整數做質因數分解
//資管二B  410917677 廖子儀
//Date:2022/02/23
import java.util.*;
public class W1_Q2 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
            while (n != i) {
                if (n % i == 0) {
                    System.out.print(i + "*");
                    n /= i;
                } else {
                    break;
                }
            }
		}
		System.out.print(n);
	}
}


