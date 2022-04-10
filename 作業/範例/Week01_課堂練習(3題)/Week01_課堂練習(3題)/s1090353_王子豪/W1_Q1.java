// 判斷使用者輸入的正整數是否為質數
// 資管二A 410903539 王子豪
// 2022/2/23
package hw;
import java.util.*;
public class W1_Q1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = 0;
		for(int i = 1;i<=m;i++) {
			if(m%i == 0) {
				n++;
			}
		}
		if(n<=2) {
			System.out.println(m +" 是質數 ");
		}else{
			System.out.println(m +" 不是質數 ");
		}
	}
}