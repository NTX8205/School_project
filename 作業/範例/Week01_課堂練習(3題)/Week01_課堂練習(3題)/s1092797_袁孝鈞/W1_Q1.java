import java.util.*;
public class W1_Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();// 定 flag = true
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(num1); i++) {
			if (num1 % i == 0) {
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

