package W1;
//資管二Ｂ田睿宥 410918089
import java.util.*;
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
