package W1;
import java.util.*;
//資管二B 410954603 劉珞珩
public class W1_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(num + "=");
        for (int k = 2; k <= num; k++) {
            while (num != k) {
                if (num % k == 0) {
                    System.out.print(k + "*");
                    num /= k;
                } else {
                    break;
                }
            }

        }
        System.out.print(num);

	}

}
