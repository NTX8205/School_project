import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
//資管二B 410921812 余汶芯
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入正整數n：");
		int n=sc.nextInt();
		int[] a = new int[n];
		// 迴圈輸入數字
		for (int i = 0; i < n; i++) {
			a[i] = (int)(Math.random()*100);
		}

		System.out.print("假設隨機產生的四個正整數分別為");

		// 迴圈輸出排好的數字
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");

		}

	}
}
