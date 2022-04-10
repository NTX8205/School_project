//題目：判斷輸入的正整數是否為質數
//班級：資管二B 學號：410903521 姓名：葉宸甄
//日期：2/23
package text6;
import java.util.*;
public class main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	boolean flag=true;
	for (int i = 2; i <= Math.sqrt(n); i++) {
		if (n % i == 0) {
			flag = false;
			break;
		}
	}
	if (flag) {
		System.out.println("是質數");
	} else {
		System.out.println("不是質數");
	}
   }
}
