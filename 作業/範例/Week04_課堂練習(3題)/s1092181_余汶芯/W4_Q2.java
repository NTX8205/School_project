import java.util.Scanner;
//前段和與後段和
//資管二B 410921812 余汶芯 
public class W4_Q2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int pre = 0;// pre為前段和，pro為後段和，count為組數
		int count = 0;

		for (int i = 0; i < n; i++) {// 前段和
			pre += array[i];
			int post = 0;
			for (int j = n - 1; j >= 0; j--) {// 後段和
				post += array[j];
				if (pre == post) {// 兩個相應的話，組數+1
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
