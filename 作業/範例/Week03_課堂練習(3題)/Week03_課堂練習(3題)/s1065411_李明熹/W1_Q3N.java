//計算兩個正整數的最大公因數&最小公倍數
//410654114資工5B李明熹
//2022/2/23
import java.util.Scanner;

public class W1_Q3N {
	
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("輸入兩數得最大公因數&最小公倍數");
		int input1 = sca.nextInt();
		int input2 = sca.nextInt();
		GreatestCommonFactor(input1, input2);
		LeastCommonMultiple(input1, input2);
	}

	public static void GreatestCommonFactor(int input1, int input2) {
		int tmp = 0;
		while (input1 % input2 != 0) {
			tmp = input2;
			input2 = input1 % input2;
			input1 = tmp;
		}
		System.out.println("最大公因數" + input2);

	}

	public static void LeastCommonMultiple(int input1, int input2) {
		int tmp = 0;
		int x = input1;
		int y = input2;
		while (input1 % input2 != 0) {
			tmp = input2;
			input2 = input1 % input2;
			input1 = tmp;
		}
		System.out.println("最小公倍數" + (x * y / input2));

	}

}
