//題目：將使用者輸入的正整數質因數分解
//班級：資管二B 學號：410903521 姓名：葉宸甄
//日期：2/23
package text6;
import java.util.*;
public class main2 {
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
